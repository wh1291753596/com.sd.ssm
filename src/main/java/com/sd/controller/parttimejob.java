package com.sd.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sd.bean.Parttimejob;
import com.sd.dao.ParttimejobMapper;
import com.sd.dao.SendMapper;
import com.sd.service.SqlSessionTool;

/*
 * acthor:WangHao
 * time：2018/03/17
*/

@Controller
@RequestMapping(value = "/parttimejob", method = RequestMethod.POST)
public class parttimejob {
	
	@RequestMapping("/job")
	public String  parttimejobup(HttpServletRequest request,Model model) throws Exception {
		String jobname=null;
		jobname=request.getParameter("name");
		String joblocation=null;
		joblocation=request.getParameter("location");
		String jobdetail=null;
		jobdetail=request.getParameter("detail");
		String jobwage=null;
		jobwage=request.getParameter("wage");
		String jobcount=null;
		jobcount=request.getParameter("count");
		
		String jobstarttime=null;
		jobstarttime=request.getParameter("start_time");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.parse(jobstarttime));
		
		String jobendtime=null;
		jobendtime=request.getParameter("end_time");
		System.out.println(sdf.parse(jobendtime));
		Byte flag=1;
		Date now=new Date();
		String jobworkingtime=null;
		jobworkingtime=request.getParameter("workingtime");
		String jobcontact=null;
		jobcontact=request.getParameter("contact");
		
		
		Parttimejob parttimejob=new Parttimejob();
		parttimejob.setName(jobname);
		parttimejob.setLocation(joblocation);
		parttimejob.setDetail(jobdetail);
		parttimejob.setWage(jobwage);
		parttimejob.setCount(jobcount);
		parttimejob.setStartTime(sdf.parse(jobstarttime));
		parttimejob.setEndTime(sdf.parse(jobendtime));
		parttimejob.setFlag(flag);
		parttimejob.setWorkingTime(jobworkingtime);
		parttimejob.setContactWay(jobcontact);
		parttimejob.setId(2);
		
		SqlSession session = SqlSessionTool.CreateSqlSession();
		ParttimejobMapper parttimejobMapper=session.getMapper(ParttimejobMapper.class);
		parttimejobMapper.insertSelective(parttimejob);
		session.commit();
		session.close();
		return "successful";
	}
}
