package com.sd.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mysql.fabric.xmlrpc.base.Data;
import com.sd.bean.*;

public class OrderManageTool {
	
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
		SqlSession session = SqlSessionTool.CreateSqlSession();
		if(session!=null) {
			int count = session.insert("com.sd.dao.OrderGoodMapper.insert",sendOrder);
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
