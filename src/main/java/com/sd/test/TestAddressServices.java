package com.sd.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.sd.bean.Address;
import com.sd.service.IAddressService;
import com.sd.service.imp.AddressService;

public class TestAddressServices {

	@Test
	public void testGetdefaultAddressByUserId() {
		System.out.print("测试默认收货地址查询");
		IAddressService addressService =new AddressService();
		Address address =addressService.GetdefaultAddressByUserId(1);
		
		System.out.println("address detail :"+address.getDetail());
	}

	@Test
	public void testGetNondefaultAddressByUserId() {
		System.out.print("测试非默认收货地址查询");
		IAddressService addressService =new AddressService();
		List<Address> address =addressService.GetNondefaultAddressByUserId(1);
		
		System.out.println("count :"+address.size());
	}

	@Test
	public void testInsert() {
		System.out.print("测试记录插入查询");
		IAddressService addressService = new AddressService();
		
		Address address = new Address();
		address.setUserId(1);
		address.setPhone("12345678");
		address.setReceiver("LT");
		address.setArea("成都理工大学");
		address.setDetail("358");
		address.setFlag(new Byte("1"));
		address.setCreateTime(new Date());
		
		int count =addressService.Insert(address);
		System.out.println("count:"+count);
	}

	@Test
	public void testUpdateAddress() {
		System.out.print("测试记录修改");
		IAddressService addressService = new AddressService();
		
		Address address = new Address();
		address.setId(4);
		address.setUserId(1);
		address.setPhone("12345678");
		address.setReceiver("LT");
		address.setArea("成都理工大学");
		address.setDetail("359");
		address.setFlag(new Byte("1"));
		address.setCreateTime(new Date());
		
		int count =addressService.UpdateAddress(address);
		System.out.println("count:"+count);
	}

	@Test
	public void testDeleteByPrimaryKey() {
		System.out.print("测试记录删除查询");
		IAddressService addressService = new AddressService();
		
		int count =addressService.DeleteByPrimaryKey(4);
		System.out.println("count:"+count);
	}
}
