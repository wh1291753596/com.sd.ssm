package com.sd.service;

import com.sd.bean.Coupon;
import com.sd.bean.Image;

public interface ICouponService {
	/*
	 *关于卡券相关---由于这张表未存在直接多表查询
	 * 
	*/
	
	// 增
	void creatCoupon(Image image,Coupon coupon);
	
	// 删
	void deleteCoupon(Image image, Coupon coupon);
	
	// 改
	
	void updataCoupon(Image image, Coupon coupon);
	// 查

}
