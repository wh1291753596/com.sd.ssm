package com.sd.controller;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sd.bean.AddressKeyInfo;
import com.sd.bean.Order;
import com.sd.bean.Send;
import com.sd.service.GetUserAddressKeyInfo;
import com.sd.service.OrderManageTool;

@Controller
/*@RequestMapping("/consign")*/
public class test {
	int id=1;
	//System.out.println("");
	
	@RequestMapping("/up")
	public String test456(HttpServletRequest request,Model model) {
		System.out.println("到这里了吗？\r\n");
		List<AddressKeyInfo> addressKeyInfos=new ArrayList<AddressKeyInfo>();
		
		GetUserAddressKeyInfo getAddInnfo=new GetUserAddressKeyInfo();
		
		addressKeyInfos=getAddInnfo.GetNondefaulltAddressByUserId(1);
		for(AddressKeyInfo addressKeyInfo:addressKeyInfos)
		{
			System.out.println(addressKeyInfo.toString());
		}
		
		
		model.addAttribute("mytest", addressKeyInfos);
		System.out.println("???");
		return "consign";
		
	}
	@RequestMapping("/consignss")
	public String cons(HttpServletRequest request,Model model) {
		System.out.println("测试上传\r\n");
		
		String conpany=request.getParameter("peoplecompany");
		String name=request.getParameter("peoplename");
		String phone=request.getParameter("peoplephone");
		String address=request.getParameter("peopleaddress");
		String info=request.getParameter("peopleinfo");
		
		
		Send send=new Send();
		Order order =new Order();
		send.setCompany(conpany);
		order.setReceiver(name);
		order.setPhone(phone);
		order.setAddress(address);
		order.setRemark(info);
		OrderManageTool orderManageTool=new OrderManageTool();
		
		Date now=new Date();
		//SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//df.format(now);
		
		
		orderManageTool.CreateSendOrder(send, order, now);
		System.out.println("chengg\r\n");
		return "my";
	}
	
}
