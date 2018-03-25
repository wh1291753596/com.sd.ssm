package com.sd.bean;

import java.math.BigDecimal;
import java.util.Date;

public class SendOrderInfo {
	
	private String company;				//快递公司
	
	private int senderId;				//寄件人id
	
	private String sendrName;			//寄件人姓名
	
	private String senderPhone;			//寄件人电话
	
	private String sendrAddress;		//寄件人地址
	
	private String accepterName;		//收件人姓名
	
	private String accepterPhone;		//收件人电话
	
	private String accepterAddress;		//收件地址
	
	private int orderId;				//订单id
	
	private String expressNumber;		//订单号
	
	private Date time;					//下单时间
	
	private String note;				//备注
	
	private BigDecimal totalPrice;		//订单总价

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public String getSendrName() {
		return sendrName;
	}

	public void setSendrName(String sendrName) {
		this.sendrName = sendrName;
	}

	public String getSenderPhone() {
		return senderPhone;
	}

	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}

	public String getSendrAddress() {
		return sendrAddress;
	}

	public void setSendrAddress(String sendrAddress) {
		this.sendrAddress = sendrAddress;
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

	public String getExpressNumber() {
		return expressNumber;
	}

	public void setExpressNumber(String expressNumber) {
		this.expressNumber = expressNumber;
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
