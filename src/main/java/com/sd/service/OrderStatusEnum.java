package com.sd.service;

public enum OrderStatusEnum {
	Ordered(1),			//已下单
	PickUp(2),			//取件中
	Sending(3),			//派送中
	NotPaid(4),			//未付款
	Complete(5),		//订单完成
	Exception(6),		//异常订单
	Cancle(7);			//订单取消
	
	private int index;
	
	OrderStatusEnum(int index){
		this.index=index;
	}
	
	public int getIndex() {
		return this.index;
	}
}