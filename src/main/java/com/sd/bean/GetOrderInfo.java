package com.sd.bean;

import java.math.BigDecimal;
import java.util.Date;

public class GetOrderInfo {
	private String company;				//快递公司
	
	private String pickCode;			//取货码
	
	private int accepterId;				//收件人id
	
	private String detail;				//详细收货地址
	
	private String accepterName;		//收件人姓名
	
	private String accepterPhone;		//收件人电话
	
	private String accepterAddress;		//收件地址
	
	private int orderId;				//订单id
	
	private Date time;					//下单时间
	
	private String note;				//备注
	
	private BigDecimal totalPrice;		//订单总价

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPickName() {
		return pickCode;
	}

	public void setPickName(String pickName) {
		this.pickCode = pickName;
	}

	public int getAccepterId() {
		return accepterId;
	}

	public void setAccepterId(int accepterId) {
		this.accepterId = accepterId;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getAccepterName() {
		return accepterName;
	}

	public void setAccepterName(String accepterName) {
		this.accepterName = accepterName;
	}

	public String getAccepterPhone() {
		return accepterPhone;
	}

	public void setAccepterPhone(String accepterPhone) {
		this.accepterPhone = accepterPhone;
	}

	public String getAccepterAddress() {
		return accepterAddress;
	}

	public void setAccepterAddress(String accepterAddress) {
		this.accepterAddress = accepterAddress;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
}
