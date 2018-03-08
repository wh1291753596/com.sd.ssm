package com.sd.service;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.bean.Order;
import com.sd.bean.OrderGood;
import com.sd.bean.Send;
import com.sd.dao.OrderGoodMapper;


public class OrderManageTool {
	
	/*@Autowired
	private OrderGoodMapper om;*/
	
	public boolean CreateSendOrder(Send send,Order order,Date createTime) {
		//创建SendOrder记录
		OrderGood sendOrder=new OrderGood();
		
		//设置相关属性
		sendOrder.setOrderId(order.getId());
		sendOrder.setGoodId(send.getId());
		sendOrder.setGoodName("寄件服务");		
		sendOrder.setDiscountPrice(new BigDecimal("0"));
		sendOrder.setShopPrice(new BigDecimal("0"));
		sendOrder.setGoodQuantity(new Byte("1"));
		sendOrder.setCreateTime(createTime);
		
		//进行插入操作
		/*int insert = this.om.insert(sendOrder);
		if(insert>0) {
			return true;
		}else {
			return false;
		}*/
		SqlSession session = SqlSessionTool.CreateSqlSession();
		if(session!=null) {
			int count = session.insert("E:/EclipseFiles/com.sd.ssm/src/main/java/com.sd.dao.OrderGoodMapper.insert",sendOrder);
			//关闭session
			session.close();
			
			if(count >0)
				return true;
			else
				return false;
		}
		else
		{
			return false;
		}
	}
	
}
