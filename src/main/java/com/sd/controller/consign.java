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
import com.sd.bean.Send;
import com.sd.dao.OrderMapper;
import com.sd.dao.SendMapper;
import com.sd.service.OrderManageTool;
import com.sd.service.SqlSessionTool;

@Controller
@RequestMapping(value = "/consign", method = RequestMethod.POST)
public class consign {

	/*
	 * acthor:WangHao
	 * time：2018/03/08
	*/
	@RequestMapping("/up")
	public String consignup(HttpServletRequest request,Model model)
	{
		
		
		String conpany=request.getParameter("peoplecompany");
		String name=request.getParameter("peoplename");
		String phone=request.getParameter("peoplephone");
		String address=request.getParameter("peopleaddress");
		String info=request.getParameter("peopleinfo");
		
		SqlSession session=SqlSessionTool.CreateSqlSession();
		SendMapper sendMapper = session.getMapper(SendMapper.class);
		
		Date ob=new Date();
		
		//创建send记录
		Send send=new Send();
		send.setCompany(conpany);
		send.setCreateTime(ob);
		sendMapper.insert(send);
		session.commit();
		
		//查询
		send = sendMapper.selectByCreateTime(ob);		
		session.commit();
		session.close();
		
		SqlSession sessiona=SqlSessionTool.CreateSqlSession();
		
		//表示代寄
		byte a =3;
		//表示有效
		byte b=1;
		//表示结算价格
		BigDecimal c=new BigDecimal(0.0);
		//表示优惠后价格
		BigDecimal d=new BigDecimal(0.0);
		//创建order对象
				
		Order order=new Order();
		
		order.setUserId(1);
		order.setReceiver(name);
		order.setPhone(phone);
		order.setAddress(address);
		order.setRemark(info);
		order.setCreateTime(ob);
		order.setFlag(b);
		order.setType(a);
		order.setTotalPrice(c);
		order.setTotalSettlementPrice(d);
		order.setOrderStatusId(1);
		OrderMapper orderMapper=sessiona.getMapper(OrderMapper.class);
		//插入数据
		orderMapper.insert(order);
		sessiona.commit();
		
		//查询数据
		order=orderMapper.selectByCreateTime(ob);
		sessiona.commit();
		
		sessiona.close();
		
		System.out.println("id="+order.getId()+"    createTime="+order.getCreateTime());
		

		return "my";
	}
}
