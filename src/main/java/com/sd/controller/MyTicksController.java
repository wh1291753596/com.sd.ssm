package com.sd.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.cookie;

import java.io.IOException;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sd.bean.Coupon;
import com.sd.bean.Image;
import com.sd.bean.UserCouponServicePojo;
import com.sd.dao.ImageMapper;
import com.sd.pojos.CouponsInfo;
import com.sd.service.imp.UserCouponServiceClass;

@Controller
public class MyTicksController {

	/**
	 * @author FCmmmmmm 查询我的卡券服务
	 **/
	@RequestMapping("myTicks")
	public String index(HttpServletRequest request, Model model) {
		/*
		 * 获取userID 判断cookies中是否存在改ID 开查 渲染
		 */
		

		System.out.println();
		Integer userID = new Integer(1);
		List<CouponsInfo> couponsInfos = new ArrayList<>();// 改用户已拥有卡券
		List<CouponsInfo> couponsInfos_unavailable = new ArrayList<>();

		int i = 0;
		// cookies验证

		// 查询
		UserCouponServiceClass uServiceClass = new UserCouponServiceClass();
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		System.out.println("date=" + dateFormat.format(calendar.getTime()));
		List<UserCouponServicePojo> coupons = uServiceClass.selectCouponByUserId(userID);
		if (coupons == null)
			return null;// 用户未持有任何卡券
		for (UserCouponServicePojo coupon : coupons) {
			switch (coupon.getFlag()) {
			case 0:
				CouponsInfo couponsInfo = new CouponsInfo();
				couponsInfo.setName(coupon.getName());
				couponsInfo.setType(coupon.getType());
				couponsInfo.setDescription(coupon.getDescription());
				couponsInfo.setMoney(coupon.getMoney());
				couponsInfo.setMinMoney(coupon.getMinMoney());
				couponsInfo.setId(coupon.getId());
				couponsInfo.setNum(1);
				// couponsInfo.setCreatTime(coupon.getCreateTime());
				couponsInfo.setEndTime(coupon.getEndTime());

				couponsInfo.setImageSrc(getImageSrc(coupon.getImageId()));
				couponsInfos_unavailable.add(couponsInfo);
				break;
			case 1:
				CouponsInfo couponsInfo1 = new CouponsInfo();
				couponsInfo1.setName(coupon.getName());
				couponsInfo1.setDescription(coupon.getDescription());
				couponsInfo1.setType(coupon.getType());
				couponsInfo1.setMoney(coupon.getMoney());
				couponsInfo1.setMinMoney(coupon.getMinMoney());
				couponsInfo1.setId(coupon.getId());
				couponsInfo1.setNum(1);
				// couponsInfo.setCreatTime(coupon.getCreateTime());
				couponsInfo1.setEndTime(coupon.getEndTime());
				couponsInfo1.setImageSrc(getImageSrc(coupon.getImageId()));
				// 判断月卡次卡 暂时不明 修改在java页面下部
				couponsInfos.add(couponsInfo1);
				break;
			default:
				break;
			}

		}

		model.addAttribute("couponsInfos", couponsInfos);
		model.addAttribute("couponsInfos_unavailable", couponsInfos_unavailable);
		Calendar calendar1 = Calendar.getInstance();
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		System.out.println("date=" + dateFormat1.format(calendar1.getTime()));
		return "myTicket";
	}

	public String getImageSrc(Integer imageId) {

		Reader reader;
		try {
			reader = Resources.getResourceAsReader("mybatisConfig.xml");
			// 创建
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(reader);
			SqlSession session = factory.openSession();
			// 尚不确定图片结果
			ImageMapper imageMapper = session.getMapper(ImageMapper.class);

			Image image = imageMapper.selectByPrimaryKey(imageId);
			return image.getPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "../img/会员.png";
		}

	}
}
