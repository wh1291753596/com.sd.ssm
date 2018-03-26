package com.sd.bean;

import java.util.Date;

public class Get {
    private Integer id;

    private String pickCode;

    private String type;

    private String company;

    private Date informDate;

    private Byte isUrgent;

    private String urgentTime;

    private Integer deliveryManId;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPickCode() {
        return pickCode;
    }

    public void setPickCode(String pickCode) {
        this.pickCode = pickCode == null ? null : pickCode.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public Date getInformDate() {
        return informDate;
    }

    public void setInformDate(Date informDate) {
        this.informDate = informDate;
    }

    public Byte getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(Byte isUrgent) {
        this.isUrgent = isUrgent;
    }

    public String getUrgentTime() {
        return urgentTime;
    }

    public void setUrgentTime(String urgentTime) {
        this.urgentTime = urgentTime == null ? null : urgentTime.trim();
    }

    public Integer getDeliveryManId() {
        return deliveryManId;
    }

    public void setDeliveryManId(Integer deliveryManId) {
        this.deliveryManId = deliveryManId;
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