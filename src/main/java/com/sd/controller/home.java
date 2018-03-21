package com.sd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sd.bean.Parttimejob;
import com.sd.service.IparttimejobService;
import com.sd.service.imp.ParttimejobService;
import com.sd.util.cookies;

@Controller
@RequestMapping("/home")
public class home {

	@RequestMapping("/home")
	public String testhome(HttpServletRequest request, Model model) {
		IparttimejobService pIparttimejobService = new ParttimejobService();
		List<Parttimejob> parttimejobs = new ArrayList<Parttimejob>();
		parttimejobs = pIparttimejobService.select();
		for (Parttimejob iParttimejob : parttimejobs) {
			System.out.println(iParttimejob.getName());
		}
		model.addAttribute("parttimejob", parttimejobs);

		return "home";
	}

	@RequestMapping("/sds")
	public String sds(HttpServletRequest request, Model model) {
		String tableid = request.getParameter("m");
		if (tableid.equals("0")) {
			Boolean judgelogin = null;
			cookies uCookies = new cookies();
			judgelogin = uCookies.judge(request);
			if (judgelogin.equals(false)) {
				return "login";
			} else {
				return "fetch";
			}
		} else {
			Boolean judgelogin = null;
			cookies uCookies = new cookies();
			judgelogin = uCookies.judge(request);
			if (judgelogin.equals(false)) {
				return "login";
			} else {
				return "consign";
			}
		}

	}

	@RequestMapping("/works")
	public String works(HttpServletRequest request, Model model) {
		String tableid = request.getParameter("m");
		System.out.println(tableid);
		return "home";
	}

	@RequestMapping("/tushus")
	public String tushus(HttpServletRequest request, Model model) {
		String tableid = request.getParameter("m");
		System.out.println(tableid);
		return "order_Purchase";
	}

	@RequestMapping("/fulis")
	public String fulis(HttpServletRequest request, Model model) {
		String tableid = request.getParameter("m");
		System.out.println(tableid);
		return "order_Purchase";
	}
}
