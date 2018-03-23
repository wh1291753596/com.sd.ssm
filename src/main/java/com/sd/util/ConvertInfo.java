package com.sd.util;

import java.util.ArrayList;
import java.util.List;

import com.sd.bean.GoodAttributeInfo;
import com.sd.pojos.GoodAttributeBooksInfo;
/*
 * Author:WangHao
 * Time:2018/03/22
 * 对数据库中二手书籍进行转换为后台渲染类
 */
public class ConvertInfo {

	public List<GoodAttributeBooksInfo> convert(List<GoodAttributeInfo> goodAttributeInfos) {
		List<GoodAttributeBooksInfo> goodAttributeBooksInfos=new ArrayList<GoodAttributeBooksInfo>();
		for (int i=0;i<goodAttributeInfos.size();i=i+2)
		{
			System.out.println(goodAttributeInfos.size());
			GoodAttributeBooksInfo goodAttributeBooksInfo=new GoodAttributeBooksInfo();
			goodAttributeBooksInfo.setName(goodAttributeInfos.get(i).getName());
			goodAttributeBooksInfo.setUnit(goodAttributeInfos.get(i).getUnit());
			goodAttributeBooksInfo.setStock(goodAttributeInfos.get(i).getStock());
			goodAttributeBooksInfo.setSalesQuantity(goodAttributeInfos.get(i).getSalesQuantity());
			goodAttributeBooksInfo.setDiscountPrice(goodAttributeInfos.get(i).getDiscountPrice());
			goodAttributeBooksInfo.setShopPrice(goodAttributeInfos.get(i).getShopPrice());
			goodAttributeBooksInfo.setType(goodAttributeInfos.get(i).getType());
			goodAttributeBooksInfo.setFlag(goodAttributeInfos.get(i).getFlag());
			goodAttributeBooksInfo.setImageId(goodAttributeInfos.get(i).getImageId());
			goodAttributeBooksInfo.setCreateTime(goodAttributeInfos.get(i).getCreateTime());
			goodAttributeBooksInfo.setAttributename(goodAttributeInfos.get(i).getAttributename());			
			goodAttributeBooksInfo.setPubcompany(goodAttributeInfos.get(i).getValue());
			goodAttributeBooksInfo.setid(goodAttributeInfos.get(i).getid());
			goodAttributeBooksInfos.add(goodAttributeBooksInfo);
		}
		List<String> list=new ArrayList<String>();
		for(int i=1;i<goodAttributeInfos.size();i=i+2)
		{
			list.add(goodAttributeInfos.get(i).getValue());
		}
		for(int i=0;i<goodAttributeBooksInfos.size();i++)
		{
			goodAttributeBooksInfos.get(i).setAuthor(list.get(i));
		}
		return  goodAttributeBooksInfos;
	}
}
