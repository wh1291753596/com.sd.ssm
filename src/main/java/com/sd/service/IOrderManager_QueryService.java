package com.sd.service;

import java.util.List;

import com.sd.pojos.OrederManager_Query;

public interface IOrderManager_QueryService {

	//查询代取快递订单
	List<OrederManager_Query> selectFetchByUserid(int userId);
	
	//查询代寄快递订单
	List<OrederManager_Query> selectConsignByUserid(int userId);
	
	//查询其他商品
	List<OrederManager_Query> selectOtherByUserid(int userId);
	
}
