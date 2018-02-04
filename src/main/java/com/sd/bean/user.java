package com.sd.bean;

public class user {
    public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public user(String shenfenzh, String name, Integer age, String address) {
		super();
		this.shenfenzh = shenfenzh;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	private String shenfenzh;

    private String name;

    private Integer age;

    private String address;

    public String getShenfenzh() {
        return shenfenzh;
    }

    public void setShenfenzh(String shenfenzh) {
        this.shenfenzh = shenfenzh == null ? null : shenfenzh.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}