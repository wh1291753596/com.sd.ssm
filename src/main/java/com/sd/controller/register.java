package com.sd.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.cookie;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysql.fabric.Response;

@Controller
@RequestMapping(value = "/register", method = RequestMethod.POST)
public class register {

	@RequestMapping("/up")
	public String regsterup(HttpServletRequest request,Model model,HttpServletResponse response)
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String affirmpassword=request.getParameter("affirmpassword");
		 
	/*	需要将这些数据传到数据库*/
		
		return "login";
	}
}
