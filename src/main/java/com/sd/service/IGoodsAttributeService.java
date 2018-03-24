package com.sd.service;


import com.sd.pojos.GoodsAttributeInfo;

public interface IGoodsAttributeService {

	void insertRecord(GoodsAttributeInfo goodsAttributeInfo);
	
	GoodsAttributeInfo selectByGoodid(Integer goodsId);
}

