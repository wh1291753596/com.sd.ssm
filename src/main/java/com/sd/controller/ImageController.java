package com.sd.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ImageController {
	/**
	 * @author FCmmmmmm
	 * 
	 * 图片的controller  目前图片的controller只用于测试   图片不能形成单独controlller
	 * 
	 * 改项目只为图片上传铺垫
	 */
	@RequestMapping("image")
	public String index(HttpServletRequest request, Model model) {
		
		
		
		return null;
	}
}
