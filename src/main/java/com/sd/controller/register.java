package com.sd.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.cookie;

import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysql.fabric.Response;
import com.sd.bean.user;
import com.sd.dao.userMapper;
import com.sd.service.SqlSessionTool;

@Controller
@RequestMapping(value = "/register", method = RequestMethod.POST)
public class register {

	/*
	 * acthor:WangHao
	 * Time:2018/08/13
	 */
	@RequestMapping("/up")
	public String regsterup(HttpServletRequest request,Model model,HttpServletResponse response)
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String affirmpassword=request.getParameter("affirmpassword");
		
		//查询username是否存在
		user iUser=new user();
		SqlSession session=SqlSessionTool.CreateSqlSession();
		userMapper iUserMapper=session.getMapper(userMapper.class);	
		iUser=iUserMapper.selectByName(username);
		
		
		if(iUser!=null)
		{
			System.out.println("错误");
			String []info=new String[50];
			info[0]="username重复";
			model.addAttribute("testresultinfo", info);
			return "register";
		}
		else {
			user uuUser=new user();
			uuUser.setName(username);
			uuUser.setPassword(password);
			Byte type=0;
			uuUser.setType(type);
			Date now=new Date();
			uuUser.setCreateTime(now);			
			iUserMapper.insertSelective(uuUser);
			session.commit();
			System.out.println(uuUser);
			return "login";
			
		}
		
		
	/*	需要将这些数据传到数据库*/
		
		
	}
}
