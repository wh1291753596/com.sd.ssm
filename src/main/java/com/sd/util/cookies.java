package com.sd.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/*
 * acthor:WangHao
 * time：2018/03/11
*/
public class cookies {

	public String getusername(HttpServletRequest request) {

		String cookiename = null;
		String cookievalues = null;

		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			cookiename = cookie.getName();
			if ("shandianxiaoyuan".equals(cookiename)) {			
				cookievalues = cookie.getValue();			
			}
		}
		String[] user = cookievalues.split(",");
		String username = user[0];
		return username;
	}

	public boolean judge(HttpServletRequest request) {
		String judge = null;
		String cookiename = null;
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			cookiename = cookie.getName();
			if ("shandianxiaoyuan".equals(cookiename)) {
				judge = cookiename;
			}
		}
		if ("shandianxiaoyuan".equals(judge)) {
			return true;
		} else {
			return false;
		}
	}
}
