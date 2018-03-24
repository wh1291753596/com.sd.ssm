package com.sd.service;

public enum OrderTypeEnum {
	
	GetOrder((byte)1),				//代取订单
	SendOrder((byte)3),				//代寄订单
	OrdinaryGoodOrder((byte)6);		//普通商品订单
	
	private byte index;
	
	OrderTypeEnum(byte index){
		this.index=index;
	}
	
	public byte getIndex() {
		return index;
	}
}
