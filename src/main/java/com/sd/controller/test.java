package com.sd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sd.bean.AddressKeyInfo;
import com.sd.service.GetUserAddressKeyInfo;

@Controller
@RequestMapping("/consign")
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
}
