package com.sd.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sd.bean.Order;
import com.sd.service.IOrderService;
import com.sd.service.OrderStatusEnum;
import com.sd.service.imp.OrderService;

public class TestOrderService {

	@Test
	public void test() {
		IOrderService orderService = new OrderService();
		
		//先查询出一条order记录
		Order order = orderService.SelectOrderByPrimaryKey(1);
		//修改订单状态为完成状态
		int count = orderService.ChangeOrderStatus(order, OrderStatusEnum.Complete.getIndex());
		System.out.println("共影响行数为："+count);
	}

}
