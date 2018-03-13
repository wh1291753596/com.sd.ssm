package com.sd.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.cookie;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;


import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sd.bean.user;
import com.sd.bean.userExample;
import com.sd.dao.userMapper;
import com.sd.service.SqlSessionTool;
import com.sd.service.loginjudge;


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
		System.out.println(username);
		/*接下来与服务器进行比对，比对成功：生成cookie。*/
		
		//查询是否存在相同name
		user iUser=new user();
		SqlSession session=SqlSessionTool.CreateSqlSession();
		userMapper iUserMapper=session.getMapper(userMapper.class);		
		iUser=iUserMapper.selectByName(username);
		
		System.out.println(iUser.getName());
		//判断账号是否存在
		if(iUser!=null)
		{
			String yunPassword=null;
			yunPassword=iUser.getPassword();
			System.out.println("数据库密码="+yunPassword);
			System.out.println("登陆密码="+password);
			//判断密码是否正确
			if (yunPassword.equals(password)) {
				System.out.println("完成OK");
				
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
				
				return "home";
			}
			else {
				String []info=new String[50];
				info[0]="密码错误";
				model.addAttribute("testresultinfo", info);
				System.out.println("密码错误");
				return "login";
			}
		}
		else {
			String []info=new String[50];
			info[0]="username不存在";
			model.addAttribute("testresultinfo", info);
			System.out.println("账号不在");
			return "login";
		}
	
		


	}
}
