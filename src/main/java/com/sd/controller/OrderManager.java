package com.sd.controller;

import static org.hamcrest.CoreMatchers.allOf;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sd.bean.Order;
import com.sd.dao.OrderMapper;
import com.sd.pojos.OrederManager_Query;
import com.sd.service.IOrderManager_QueryService;
import com.sd.service.SqlSessionTool;
import com.sd.service.imp.OrderManager_Query;
import com.sd.util.FinduserId;
import com.sd.util.cookies;
/*
 * Author:WangHao
 * Time:2018/03/25
 * 订单管理(查)
 */
@Controller
@RequestMapping("/OrderManager")
public class OrderManager {

	@RequestMapping("/delete")
	public String deleteorder(HttpServletRequest request, Model model) {
		String status=request.getParameter("status");
		String orderid=request.getParameter("orderid");
		if (status.equals("已下单")||status.equals("订单完成")||status.equals("异常订单")) {
			Integer id=Integer.valueOf(orderid).intValue();
			SqlSession session = SqlSessionTool.CreateSqlSession();
			OrderMapper orderMapper=session.getMapper(OrderMapper.class);
			Order order=new Order();
			order=orderMapper.selectByPrimaryKey(id);
			Byte mByte=0;
			order.setFlag(mByte);
			orderMapper.updateByPrimaryKeySelective(order);
			session.commit();
			session.close();
			return "orderManage";
		}		
		else {
			OrederManager_Query orederManager_Query=new OrederManager_Query();
			orederManager_Query.setRemark("删除失败/取消失败");
			List<OrederManager_Query> aList=new ArrayList<OrederManager_Query>();
			aList.add(orederManager_Query);
			model.addAttribute("aList", aList);
			return "failure";
		}	
	}
	
	@RequestMapping("/query")
	public String query(HttpServletRequest request, Model model) {
		Boolean judgelogin = null;
		cookies uCookies = new cookies();
		judgelogin = uCookies.judge(request);
		if (judgelogin.equals(false)) {
			return "login";
		} else {
			String getusername = null;
			Integer getuserid = null;
			getusername = uCookies.getusername(request);
			FinduserId finduserId = new FinduserId();
			getuserid = finduserId.getuserid(getusername);//获取userid
			
			//分别拿到三大链表,并且汇总到一个链表
			List<OrederManager_Query> orederManager_Queries=new ArrayList<OrederManager_Query>();//总链表
			List<OrederManager_Query> orederManager_Queries1=new ArrayList<OrederManager_Query>();
			IOrderManager_QueryService orderManager_QueryService=new OrderManager_Query();
			orederManager_Queries1=orderManager_QueryService.selectConsignByUserid(getuserid);
			for(int i=0;i<orederManager_Queries1.size();i++)
			{
				orederManager_Queries.add(orederManager_Queries1.get(i));
			}
			orederManager_Queries1=orderManager_QueryService.selectFetchByUserid(getuserid);
			for(int i=0;i<orederManager_Queries1.size();i++)
			{
				orederManager_Queries.add(orederManager_Queries1.get(i));
			}
			orederManager_Queries1=orderManager_QueryService.selectOtherByUserid(getuserid);
			for(int i=0;i<orederManager_Queries1.size();i++)
			{
				orederManager_Queries.add(orederManager_Queries1.get(i));
			}
			System.out.println(orederManager_Queries.size());
			//开始分别拿数据
			List<OrederManager_Query> woOrederManager_Queries= new ArrayList<OrederManager_Query>();//表示未支付
			List<OrederManager_Query> ooOrederManager_Queries= new ArrayList<OrederManager_Query>();//表示其他
			for(OrederManager_Query orederManager_Query:orederManager_Queries)
			{			
				if (orederManager_Query.getOrderStatusId()==4) {
					orederManager_Query.setStatus("未支付");
					woOrederManager_Queries.add(orederManager_Query);
				}
				else {
					if(orederManager_Query.getOrderStatusId()==1)
					{
						orederManager_Query.setStatus("已下单");
					}
					else if(orederManager_Query.getOrderStatusId()==2)
					{
						orederManager_Query.setStatus("取件中");
					}
					else if(orederManager_Query.getOrderStatusId()==3)
					{
						orederManager_Query.setStatus("派送中");
					}
					else if(orederManager_Query.getOrderStatusId()==5)
					{
						orederManager_Query.setStatus("订单完成");
					}
					else if(orederManager_Query.getOrderStatusId()==6)
					{
						orederManager_Query.setStatus("异常订单");
					}
					ooOrederManager_Queries.add(orederManager_Query);
				}
			}		
			model.addAttribute("weizhifu", woOrederManager_Queries);//未支付
			model.addAttribute("qita", ooOrederManager_Queries);//其他
			return "orderManage";
		}
		
	}
}
