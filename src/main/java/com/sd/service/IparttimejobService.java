package com.sd.service;

import java.util.List;

import com.sd.bean.Parttimejob;

/*
 * author:WangHao
 * Time:2018/03/17
 * 用于兼职信息的展示
 */
public interface IparttimejobService {
	//查询
	List<Parttimejob> select();
}
