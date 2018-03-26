package com.sd.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.sd.bean.GetOrderInfo;
import com.sd.bean.SendOrderInfo;
import com.sd.service.IGetSendOrderInfoService;
import com.sd.service.OrderStatusEnum;
import com.sd.service.imp.GetSendOrderInfoService;

public class TestGetSendOrderInfoService {

	@Test
	public void test() {
		//查询订单已经完成的代取订单信息
		IGetSendOrderInfoService getSendOrderInfoService = new GetSendOrderInfoService();
		List<GetOrderInfo> getOrderInfos = getSendOrderInfoService.SelectGetOrderInfoByOrderStatus(OrderStatusEnum.Complete.getIndex());
		System.out.println("查询到已完成状态代取订单记录条数："+getOrderInfos.size());
		System.out.println(getOrderInfos.get(0).getAccepterName());
		
		//查询已下单状态的代寄订单信息
		List<SendOrderInfo> sendOrderInfos = getSendOrderInfoService.SelectSendOrderInfoByOderStatus(OrderStatusEnum.Ordered.getIndex());
		System.out.println("查询到已下单状态代寄订单条数："+sendOrderInfos.size());
		System.out.println(sendOrderInfos.get(0).getAccepterName());
	}

}
