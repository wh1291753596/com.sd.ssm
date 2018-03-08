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
		System.out.println("到这里了吗？11111\r\n");
	return "home";
	}
}
