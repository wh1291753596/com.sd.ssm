package com.sd.service;

import com.sd.bean.Order;

public interface IOrderService {
	/*
	 * 根据订单状态id修改订单状态
	 */
	int ChangeOrderStatus(Order order,Integer statusId);
	
	/*
	 * 根据主键获取订单
	 */
	Order SelectOrderByPrimaryKey(int id);
}
