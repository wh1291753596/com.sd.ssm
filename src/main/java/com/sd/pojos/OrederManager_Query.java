package com.sd.pojos;

import java.math.BigDecimal;
import java.util.Date;

/*
 * Author:WangHao
 * Time:2018/03/25
 * OrderManager_query的实体类
 */

public class OrederManager_Query {

	private Integer orderStatusId;// 状态id

	private Date createTime;// 下单时间

	private BigDecimal totalSettlementPrice;// 最后结算价格

	private String expressNumber;// 快递单号

	private String remark;// 备注

	private String goodName;// 订单名称

	private Integer id;// orderid

	private Integer goodId;

	private Integer userId;
	
	private String status;//表示状态

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getGoodId() {
		return goodId;
	}

	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderStatusId() {
		return orderStatusId;
	}

	public void setOrderStatusId(Integer orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigDecimal getTotalSettlementPrice() {
		return totalSettlementPrice;
	}

	public void setTotalSettlementPrice(BigDecimal totalSettlementPrice) {
		this.totalSettlementPrice = totalSettlementPrice;
	}

	public String getExpressNumber() {
		return expressNumber;
	}

	public void setExpressNumber(String expressNumber) {
		this.expressNumber = expressNumber;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

}
