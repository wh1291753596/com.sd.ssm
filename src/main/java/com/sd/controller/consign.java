package com.sd.controller;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.aspectj.lang.NoAspectBoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sd.bean.Order;
import com.sd.bean.OrderGood;
import com.sd.bean.Send;
import com.sd.bean.user;
import com.sd.dao.OrderGoodMapper;
import com.sd.dao.OrderMapper;
import com.sd.dao.SendMapper;
import com.sd.dao.userMapper;
import com.sd.service.OrderManageTool;
import com.sd.service.SqlSessionTool;
import com.sd.util.FinduserId;
import com.sd.util.cookies;

@Controller
@RequestMapping(value = "/consign", method = RequestMethod.POST)
public class consign {

	/*
	 * acthor:WangHao 
	 * time：2018/03/08
	 * 代寄快递上传
	 */
	@RequestMapping("/up")
	public String consignup(HttpServletRequest request, Model model) {

		// 插入send表
		String conpany = request.getParameter("peoplecompany");// 快递公司
		String name = request.getParameter("peoplename");// 收件人姓名
		String phone = request.getParameter("peoplephone");// 收件人电话
		String address = request.getParameter("peopleaddress");// 收件人地址
		String remark = request.getParameter("peopleinfo");// 备注
		Send send = new Send();
		send.setCompany(conpany);
		Date now = new Date();
		send.setCreateTime(now);
		SqlSession session = SqlSessionTool.CreateSqlSession();
		SendMapper sendMapper = session.getMapper(SendMapper.class);
		sendMapper.insertSelective(send);
		session.commit();
		Integer sendid = sendMapper.selectByCreateTime(now).getId();// 获取sendid
		// 获取userid
		cookies uCookies = new cookies();
		String getusername = uCookies.getusername(request);
		FinduserId finduserId = new FinduserId();
		Integer getuserid = finduserId.getuserid(getusername);
		// 插入记录到order表
		Order order = new Order();
		order.setUserId(getuserid);
		order.setOrderStatusId(1);
		order.setRemark(remark);
		order.setAddress(address);
		order.setReceiver(name);
		order.setPhone(phone);
		Byte kByte = 3;// 3表示代寄
		order.setType(kByte);
		BigDecimal Price = new BigDecimal(0.1);
		// 这里将价格全部上传为0.1，仅仅适用于快递而且需要在购买页面修改
		order.setTotalPrice(Price);
		order.setTotalSettlementPrice(Price);
		Byte flag = 1;
		order.setFlag(flag);
		order.setCreateTime(now);
		OrderMapper orderMapper = session.getMapper(OrderMapper.class);
		orderMapper.insertSelective(order);
		session.commit();
		// 插入到order_good表
		order = orderMapper.selectByCreateTime(now);// 查询order.id
		OrderGood orderGood = new OrderGood();
		orderGood.setOrderId(order.getId());
		orderGood.setGoodId(sendid);
		orderGood.setGoodName("代寄快递");
		// 这里将价格全部上传为0.1，仅仅适用于快递而且需要在购买页面修改
		orderGood.setDiscountPrice(Price);
		orderGood.setShopPrice(Price);
		orderGood.setGoodQuantity(kByte);
		orderGood.setCreateTime(now);
		OrderGoodMapper orderGoodMapper = session.getMapper(OrderGoodMapper.class);
		orderGoodMapper.insertSelective(orderGood);
		session.commit();
		session.close();
		
		return "successful";
	}

}
