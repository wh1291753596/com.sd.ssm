package com.sd.pojos;

import java.math.BigDecimal;
import java.util.Date;

public class GoodAttributeBooksInfo {

	private String name;

	private String unit;
	
	private Integer imageId;

	private Integer thumbnailId;
	
	private Integer id;

	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	public Integer getImageId() {
		return imageId;
	}

	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

	public Integer getThumbnailId() {
		return thumbnailId;
	}

	public void setThumbnailId(Integer thumbnailId) {
		this.thumbnailId = thumbnailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Short getStock() {
		return stock;
	}

	public void setStock(Short stock) {
		this.stock = stock;
	}

	public Integer getSalesQuantity() {
		return salesQuantity;
	}

	public void setSalesQuantity(Integer salesQuantity) {
		this.salesQuantity = salesQuantity;
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

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Byte getFlag() {
		return flag;
	}

	public void setFlag(Byte flag) {
		this.flag = flag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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

	private Short stock;

	private Integer salesQuantity;

	private BigDecimal discountPrice;// 折扣价

	private BigDecimal shopPrice;// 本店价格

	private Byte type;

	private Byte flag;

	private Date createTime;

	private String attributename;

	private String author;

	private String pubcompany;
	
	private String detail;

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
