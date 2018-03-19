/**
 * 
 */
package com.sd.service.imp;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sd.bean.Address;
import com.sd.service.IAddressService;
import com.sd.service.SqlSessionTool;

/**
 * @author 刘泰
 *
 */
public class AddressService implements IAddressService {

	@Override
	public Address GetdefaultAddressByUserId(int userId) {
		
		SqlSession session = SqlSessionTool.CreateSqlSession();
		Address addrress=session.selectOne("com.sd.dao.AddressMapper.selectDefaultAddressByUserId", userId);
		session.commit();
		session.close();
		
		return addrress;
	}

	@Override
	public List<Address> GetNondefaultAddressByUserId(int userId) {
		
		SqlSession session = SqlSessionTool.CreateSqlSession();
		List<Address> addrresses=session.selectList("com.sd.dao.AddressMapper.selectNonDefaultAddressByUserId", userId);
		session.commit();
		session.close();
		
		return addrresses;
	}

	@Override
	public Address selectByTime(Date createTime)
	{
		SqlSession session = SqlSessionTool.CreateSqlSession();
		Address addrress=session.selectOne("com.sd.dao.AddressMapper.selectByTime", createTime);
		session.commit();
		session.close();
		return addrress;
	}
	
	@Override
	public  Address selectByAddressId(int addressId)
	{
		SqlSession session = SqlSessionTool.CreateSqlSession();
		Address addrress=session.selectOne("com.sd.dao.AddressMapper.selectByAddressId", addressId);
		session.commit();
		session.close();
		return addrress;
	}
	@Override
	public int Insert(Address address) {
		
		SqlSession session = SqlSessionTool.CreateSqlSession();
		int count = session.insert("com.sd.dao.AddressMapper.insert", address);
		session.commit();
		session.close();
		
		return count;
	}

	@Override
	public int UpdateAddress(Address address) {
		
		SqlSession session = SqlSessionTool.CreateSqlSession();
		int count = session.update("com.sd.dao.AddressMapper.updateByPrimaryKey", address);
		session.commit();
		session.close();
		
		return count;
	}
	
	@Override
	public int DeleteByPrimaryKey(int addressId) {
		
		SqlSession session = SqlSessionTool.CreateSqlSession();
		int count = session.delete("com.sd.dao.AddressMapper.deleteByPrimaryKey", addressId);
		session.commit();
		session.close();
		
		return count;
	}
}
