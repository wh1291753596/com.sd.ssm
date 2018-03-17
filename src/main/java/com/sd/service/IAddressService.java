/**
 * 
 */
package com.sd.service;

import java.util.*;

import com.sd.bean.*;

import com.sd.bean.Address;

/**
 * @author LT
 *
 */
public interface IAddressService {
	/*
	 * 根据用户获取该用户的所有非默认收货地址
	 */
	public Address GetdefaultAddressByUserId(int userId);
	
	/*
	 * 根据用户id获取该用户的所有非默认收货地址
	 */
	public List<Address> GetNondefaultAddressByUserId(int userId);
	
	/*
	 * 插入一条新纪录
	 */
	public int Insert(Address address);
	
	/*
	 * 修改记录
	 */
	public int UpdateAddress(Address address);
	
	/*
	 * 根据地址id删除记录
	 */
	public int DeleteByPrimaryKey(int addressId);
}
