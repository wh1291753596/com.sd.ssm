package com.sd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sd.bean.Admin_user;
import com.sd.service.IAdmin_user_singletable;
import com.sd.service.imp.Admin_user_singletable;

@Controller
@RequestMapping("/MPeopleManage")
public class M_peoplemanager {

	@RequestMapping("/queryuser")
	public String  singleQuery(HttpServletRequest request, Model model) {
		List<Admin_user> users=new ArrayList<Admin_user>();
		IAdmin_user_singletable admin_user_singletable=new Admin_user_singletable();
		users=admin_user_singletable.selectAllAdminuser();
		model.addAttribute("useramdin", users);
		return "M_People_Management";
	}
}
