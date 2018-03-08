package com.sd.bean;

import java.util.Date;

public class Send {
    public Send() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Send(Integer id, String takeTime, String company, Date createTime, Date updateTime) {
		super();
		this.id = id;
		this.takeTime = takeTime;
		this.company = company;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	private Integer id;

    private String takeTime;

    private String company;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTakeTime() {
        return takeTime;
    }

    public void setTakeTime(String takeTime) {
        this.takeTime = takeTime == null ? null : takeTime.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
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