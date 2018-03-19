package com.sd.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sd.bean.Address;
import com.sd.bean.user;
import com.sd.dao.userMapper;
import com.sd.service.IAddressService;
import com.sd.service.SqlSessionTool;
import com.sd.service.imp.AddressService;
import com.sd.util.FinduserId;
import com.sd.util.cookies;

/*
 * Author:WangHao
 * Time:2018/03/18
 * 地址管理（增删改查）
 */
@Controller
@RequestMapping("/AddressManage")
public class AddressManage {

	// 查
	@RequestMapping("query")
	public String AddressQuery(HttpServletRequest request, Model model) {
		Boolean judgelogin = null;
		cookies uCookies = new cookies();
		judgelogin = uCookies.judge(request);
		if (judgelogin.equals(false)) {
			return "login";
		} else {
			String getusername = null;
			Integer getuserid = null;
			getusername = uCookies.getusername(request);
			FinduserId finduserId = new FinduserId();
			getuserid = finduserId.getuserid(getusername);
			// 获取默认地址
			IAddressService addressService = new AddressService();

			Address defaultAddress = new Address();
			defaultAddress = addressService.GetdefaultAddressByUserId(getuserid);
			List<Address> defaultaddress = new ArrayList<Address>();
			defaultaddress.add(defaultAddress);
			if (defaultAddress == null) {
				return "addAddress";
			} else {
				model.addAttribute("defaultAddress", defaultaddress);// 默认
				// 获取非默认地址
				List<Address> notdefaultAddress = new ArrayList<Address>();
				notdefaultAddress = addressService.GetNondefaultAddressByUserId(getuserid);
				model.addAttribute("notdefaultAddress", notdefaultAddress);
				return "addressManage";
			}
		}
	}

	// 增
	@RequestMapping("add")
	public String AddressAdd(HttpServletRequest request, Model model) {
		Boolean judgelogin = null;
		cookies uCookies = new cookies();
		judgelogin = uCookies.judge(request);
		if (judgelogin.equals(false)) {
			return "login";
		} else {
			String getusername = null;
			Integer getuserid = null;
			getusername = uCookies.getusername(request);
			FinduserId finduserId = new FinduserId();
			getuserid = finduserId.getuserid(getusername);

			String receiver = request.getParameter("receiver");
			String phone = request.getParameter("phone");
			String area = request.getParameter("area");
			String judge = request.getParameter("judge");
			String detail = null;
			if (judge.equals("学生公寓")) {
				String studentsPlace = request.getParameter("studentsPlace");
				String studenttext = request.getParameter("studenttext");
				detail = studentsPlace + studenttext;
			} else if (judge.equals("教师公寓")) {
				String teacherPlace = request.getParameter("teacherPlace");
				String teachertext = request.getParameter("teachertext");
				detail = teacherPlace + teachertext;
			} else {
				String otherPlace = request.getParameter("otherPlace");
				detail = otherPlace;
			}
			String defalut = request.getParameter("yesOrno");
			IAddressService addressService = new AddressService();
			Address address = new Address();
			address.setUserId(getuserid);
			address.setReceiver(receiver);
			address.setPhone(phone);
			address.setArea(area);
			address.setDetail(detail);
			Byte flag = 1;
			address.setFlag(flag);
			Date now = new Date();
			address.setCreateTime(now);
			if (defalut.equals("否")) {
				addressService.Insert(address);
			} else {
				addressService.Insert(address);
				address = addressService.selectByTime(now);
				System.out.println(address.getId());

				user iUser = new user();
				SqlSession session = SqlSessionTool.CreateSqlSession();
				userMapper iUserMapper = session.getMapper(userMapper.class);
				iUser = iUserMapper.selectByName(getusername);

				iUser.setDefaultAddressId(address.getId());
				iUserMapper.updateByPrimaryKey(iUser);
				session.commit();
				session.close();
			}
			return "addressManage";
		}
	}

	@RequestMapping("/revise")
	public String revise(HttpServletRequest request, Model model) {
		Boolean judgelogin = null;
		cookies uCookies = new cookies();
		judgelogin = uCookies.judge(request);
		if (judgelogin.equals(false)) {
			return "login";
		} else {
			String getusername = null;
			Integer getuserid = null;
			getusername = uCookies.getusername(request);
			FinduserId finduserId = new FinduserId();
			getuserid = finduserId.getuserid(getusername);

			String addressId = request.getParameter("notdefalut");
			int id = Integer.valueOf(addressId).intValue();
			System.out.println(addressId);
			IAddressService addressService = new AddressService();
			Address address = new Address();
			address = addressService.selectByAddressId(id);
			List<Address> reviseaddress = new ArrayList<Address>();
			reviseaddress.add(address);
			model.addAttribute("reviseaddress", reviseaddress);
			return "changeAddress";
		}
	}

	/*
	 * 修改默认地址
	 */
	@RequestMapping("/change")
	public String chenge(HttpServletRequest request, Model model) {
		Boolean judgelogin = null;
		cookies uCookies = new cookies();
		judgelogin = uCookies.judge(request);
		if (judgelogin.equals(false)) {
			return "login";
		} else {
			String getusername = null;
			Integer getuserid = null;
			getusername = uCookies.getusername(request);
			FinduserId finduserId = new FinduserId();
			getuserid = finduserId.getuserid(getusername);

			String defalut = request.getParameter("yesOrno");
			if (defalut.equals("否")) {
				return "addressManage";
			} else {
				String addressId = request.getParameter("addressid");
				int id = Integer.valueOf(addressId).intValue();
				IAddressService addressService = new AddressService();
				Address address = new Address();
				address = addressService.selectByAddressId(id);

				user iUser = new user();
				SqlSession session = SqlSessionTool.CreateSqlSession();
				userMapper iUserMapper = session.getMapper(userMapper.class);
				iUser = iUserMapper.selectByName(getusername);
				iUser.setDefaultAddressId(id);
				iUserMapper.updateByPrimaryKey(iUser);
				session.commit();
				session.close();
				return "successful";
			}
		}
	}
	/*
	 * 从数据库删除地址
	 */
	@RequestMapping("/deleteaddress")
	public String  deleteaddress(HttpServletRequest request, Model model) {	
		String addressId = request.getParameter("addressid");
		int id = Integer.valueOf(addressId).intValue();
		IAddressService addressService = new AddressService();
		Address address=new Address();
		addressService.DeleteByPrimaryKey(id);
		address=addressService.selectByAddressId(id);
		return "my";
	}
	
}
