package com.sd.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class home {
	@RequestMapping("/home")
	public String testhome(HttpServletRequest request,Model model) {
		String id=request.getParameter("tushusid");
		String m=request.getParameter("m");
		System.out.println(id);
		System.out.println(m);
	return "home";
	}
	@RequestMapping("/sds")
	public String sds(HttpServletRequest request,Model model) {
		String tableid=request.getParameter("m");
		System.out.println(tableid);
	return "fetch";
	}
	@RequestMapping("/works")
	public String works(HttpServletRequest request,Model model) {
		String tableid=request.getParameter("m");
		System.out.println(tableid);
	return "home";
	}
	@RequestMapping("/tushus")
	public String tushus(HttpServletRequest request,Model model) {
		String tableid=request.getParameter("m");
		System.out.println(tableid);
	return "order_Purchase";
	}
	@RequestMapping("/fulis")
	public String fulis(HttpServletRequest request,Model model) {
		String tableid=request.getParameter("m");
		System.out.println(tableid);
	return "order_Purchase";
	}
}
