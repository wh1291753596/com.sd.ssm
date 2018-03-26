package com.sd.service;

import java.util.List;

import com.sd.bean.GetOrderInfo;
import com.sd.bean.SendOrderInfo;

public interface IGetSendOrderInfoService {
	
	/*
	 * 查询对应状态的代取订单信息
	 * orderStatusId可以通过OrderStatusEnum来获取
	 */
	List<GetOrderInfo> SelectGetOrderInfoByOrderStatus(int orderStatusId);
	
	/*
	 * 查询对应状态的代寄订单信息
	 * orderStatusId可以通过OrderStatusEnum来获取
	 */
	List<SendOrderInfo> SelectSendOrderInfoByOderStatus(int orderStatusId);
}
