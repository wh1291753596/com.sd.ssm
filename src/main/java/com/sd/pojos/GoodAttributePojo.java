package com.sd.pojos;

import java.math.BigDecimal;
import java.util.Date;

public class GoodAttributePojo {
	private String name;
	private Date createTime;
	private Integer attributeId;
	private String imgSrc;
	private BigDecimal discountPrice;// 折扣价
	private BigDecimal shopPrice;// 本店价格
	private String attributename;
	private String author;
	private Short stock;
	private String detail;
	
	private String company;
	
	private Integer id;

	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Short getStock() {
		return stock;
	}

	public void setStock(Short stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public Integer getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
	}

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}

	public BigDecimal getShopPrice() {
		return shopPrice;
	}

	public void setShopPrice(BigDecimal shopPrice) {
		this.shopPrice = shopPrice;
	}

	public String getAttributename() {
		return attributename;
	}

	public void setAttributename(String attributename) {
		this.attributename = attributename;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubcompany() {
		return pubcompany;
	}

	public void setPubcompany(String pubcompany) {
		this.pubcompany = pubcompany;
	}

	private String pubcompany;
}
