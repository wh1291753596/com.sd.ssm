package com.sd.bean;

public class AddressKeyInfo {
	private String accepterName;
	
	private String accepterPhone;
	
	private String adressDetail;
	
	public void setName(String name) {
		this.accepterName=name;
	}
	
	public String getName() {
		return accepterName;
	}
	
	public void setPhone(String phone) {
		this.accepterPhone=phone;
	}
	
	public String getPhone() {
		return accepterPhone;
	}
	
	public void setDetail(String detail) {
		this.adressDetail=detail;
	}
	
	public String getDetail() {
		return adressDetail;
	}
	
	@Override
	public String toString() {
		String info = "�ռ���������"+accepterName+"    �ռ�����ϵ��ʽ��"+accepterPhone+"      �ռ�����ϸ��ַ��"+adressDetail;
		return info;
	}
}
