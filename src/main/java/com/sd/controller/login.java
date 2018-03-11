package com.sd.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.cookie;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/login", method = RequestMethod.POST)
public class login {
	/*
	 * acthor:WangHao
	 * time：2018/03/11
	*/
	@RequestMapping("/up")
	public String loginup(HttpServletRequest request, Model model, HttpServletResponse response) {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		/*接下来与服务器进行比对，比对成功：生成cookie。*/
		
		// 对中文名称进行解码
		username = URLEncoder.encode(username);
		// 创建cookie
		Cookie cookie = new Cookie("shandianxiaoyuan", username + "," + password);
		// 设置存在时间为一周
		cookie.setMaxAge(60 * 60 * 24 * 7);
		// 设置保存路径(表示该工程项目下的所有的文件都能够访问)
		cookie.setPath("/");
		//保存到浏览器
		response.addCookie(cookie);

		
		
		
		System.out.println(username);
		
		return "home";
	}
}
