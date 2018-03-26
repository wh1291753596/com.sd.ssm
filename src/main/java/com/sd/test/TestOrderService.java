package com.sd.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.sd.bean.Order;
import com.sd.service.IOrderService;
import com.sd.service.OrderStatusEnum;
import com.sd.service.imp.OrderService;

public class TestOrderService {

	@Test
	public void test() {
		IOrderService orderService = new OrderService();
		
		//修改订单状态
		//先查询出一条order记录
		Order order = orderService.SelectOrderByPrimaryKey(1);
		//修改订单状态为完成状态
		int count = orderService.ChangeOrderStatus(order, OrderStatusEnum.Complete.getIndex());
		System.out.println("共影响行数为："+count);
		
		//修改订单信息
		//先查询出一条order记录
		Order order1 = orderService.SelectOrderByPrimaryKey(1);
		//修改信息
		order1.setTotalPrice(new BigDecimal("2.22"));
		order1.setExpressNumber("1234567");
		order1.setRemark("请尽快处理，谢谢！");
		//进行订单信息修改
		int count1 =orderService.UpdateOrderInfo(order1);
		System.out.println("共影响行数为："+count1);
	}

}
