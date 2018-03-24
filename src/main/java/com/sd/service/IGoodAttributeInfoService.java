package com.sd.service;

import java.util.List;

import com.sd.bean.GoodAttributeInfo;

public interface IGoodAttributeInfoService {

	List<GoodAttributeInfo> selectAll();
	
	List<GoodAttributeInfo> selectByGoodid(Integer id);
}
