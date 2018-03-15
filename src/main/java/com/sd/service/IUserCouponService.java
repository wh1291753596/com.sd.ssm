package com.sd.service;

import com.sd.bean.UserCoupon;
import java.util.List;
import com.sd.bean.Coupon;


public interface IUserCouponService {
	//用户卡券的使用
	
	//增
	void creatCoupon(UserCoupon userCoupon);
	//删
	void deleteCoupon(UserCoupon userCoupon);
	//改
	void updataCoupon(UserCoupon userCoupon);
	//查
	List<Coupon> selectCouponByUserId(Integer userID);
}
