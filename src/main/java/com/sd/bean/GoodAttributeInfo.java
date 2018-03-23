package com.sd.bean;

import java.math.BigDecimal;
import java.util.Date;

public class GoodAttributeInfo {

	private Integer id;
	
	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	private String name;

	private String unit;

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	private Short stock;

	private Integer salesQuantity;

	private BigDecimal discountPrice;// 折扣价

	private BigDecimal shopPrice;// 本店价格

	private Byte type;

	private Byte flag;

	private Date createTime;

	private String value;
	
	private String attributename;
	
	private String detail;

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getAttributename() {
		return attributename;
	}

	public void setAttributename(String attributename) {
		this.attributename = attributename;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private Integer imageId;// 大图id

	private Integer thumbnailId;//缩略图id

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

}
