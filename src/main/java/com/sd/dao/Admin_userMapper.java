package com.sd.dao;

import com.sd.bean.Admin_user;
import com.sd.bean.Admin_userExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Admin_userMapper {
    long countByExample(Admin_userExample example);

    int deleteByExample(Admin_userExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Admin_user record);

    int insertSelective(Admin_user record);

    List<Admin_user> selectByExample(Admin_userExample example);

    Admin_user selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Admin_user record, @Param("example") Admin_userExample example);

    int updateByExample(@Param("record") Admin_user record, @Param("example") Admin_userExample example);

    int updateByPrimaryKeySelective(Admin_user record);

    int updateByPrimaryKey(Admin_user record);
}