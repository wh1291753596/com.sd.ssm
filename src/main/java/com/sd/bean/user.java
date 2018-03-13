package com.sd.bean;

import java.util.Date;

public class user {
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public user(Integer id, String name, String nickname, String phone, String password, Date loginTime,
			Integer defaultAddressId, Byte type, Date createTime, Date updateTime) {
		super();
		this.id = id;
		this.name = name;
		this.nickname = nickname;
		this.phone = phone;
		this.password = password;
		this.loginTime = loginTime;
		this.defaultAddressId = defaultAddressId;
		this.type = type;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	private Integer id;

	private String name;

	private String nickname;

	private String phone;

	private String password;

	private Date loginTime;

	private Integer defaultAddressId;

	private Byte type;

	private Date createTime;

	private Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname == null ? null : nickname.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Integer getDefaultAddressId() {
		return defaultAddressId;
	}

	public void setDefaultAddressId(Integer defaultAddressId) {
		this.defaultAddressId = defaultAddressId;
	}

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}