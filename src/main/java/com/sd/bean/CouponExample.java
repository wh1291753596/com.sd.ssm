package com.sd.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public CouponExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("description is null");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("description is not null");
			return (Criteria) this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("description =", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("description <>", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("description >", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("description >=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("description <", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("description <=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("description like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("description not like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("description in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("description not in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("description between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("description not between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andMoneyIsNull() {
			addCriterion("money is null");
			return (Criteria) this;
		}

		public Criteria andMoneyIsNotNull() {
			addCriterion("money is not null");
			return (Criteria) this;
		}

		public Criteria andMoneyEqualTo(BigDecimal value) {
			addCriterion("money =", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotEqualTo(BigDecimal value) {
			addCriterion("money <>", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyGreaterThan(BigDecimal value) {
			addCriterion("money >", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("money >=", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyLessThan(BigDecimal value) {
			addCriterion("money <", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
			addCriterion("money <=", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyIn(List<BigDecimal> values) {
			addCriterion("money in", values, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotIn(List<BigDecimal> values) {
			addCriterion("money not in", values, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("money between", value1, value2, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("money not between", value1, value2, "money");
			return (Criteria) this;
		}

		public Criteria andMinMoneyIsNull() {
			addCriterion("min_money is null");
			return (Criteria) this;
		}

		public Criteria andMinMoneyIsNotNull() {
			addCriterion("min_money is not null");
			return (Criteria) this;
		}

		public Criteria andMinMoneyEqualTo(BigDecimal value) {
			addCriterion("min_money =", value, "minMoney");
			return (Criteria) this;
		}

		public Criteria andMinMoneyNotEqualTo(BigDecimal value) {
			addCriterion("min_money <>", value, "minMoney");
			return (Criteria) this;
		}

		public Criteria andMinMoneyGreaterThan(BigDecimal value) {
			addCriterion("min_money >", value, "minMoney");
			return (Criteria) this;
		}

		public Criteria andMinMoneyGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("min_money >=", value, "minMoney");
			return (Criteria) this;
		}

		public Criteria andMinMoneyLessThan(BigDecimal value) {
			addCriterion("min_money <", value, "minMoney");
			return (Criteria) this;
		}

		public Criteria andMinMoneyLessThanOrEqualTo(BigDecimal value) {
			addCriterion("min_money <=", value, "minMoney");
			return (Criteria) this;
		}

		public Criteria andMinMoneyIn(List<BigDecimal> values) {
			addCriterion("min_money in", values, "minMoney");
			return (Criteria) this;
		}

		public Criteria andMinMoneyNotIn(List<BigDecimal> values) {
			addCriterion("min_money not in", values, "minMoney");
			return (Criteria) this;
		}

		public Criteria andMinMoneyBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("min_money between", value1, value2, "minMoney");
			return (Criteria) this;
		}

		public Criteria andMinMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("min_money not between", value1, value2, "minMoney");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(Byte value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(Byte value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(Byte value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(Byte value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(Byte value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<Byte> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<Byte> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(Byte value1, Byte value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(Byte value1, Byte value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNull() {
			addCriterion("start_time is null");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNotNull() {
			addCriterion("start_time is not null");
			return (Criteria) this;
		}

		public Criteria andStartTimeEqualTo(Date value) {
			addCriterion("start_time =", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotEqualTo(Date value) {
			addCriterion("start_time <>", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThan(Date value) {
			addCriterion("start_time >", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("start_time >=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThan(Date value) {
			addCriterion("start_time <", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThanOrEqualTo(Date value) {
			addCriterion("start_time <=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeIn(List<Date> values) {
			addCriterion("start_time in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotIn(List<Date> values) {
			addCriterion("start_time not in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeBetween(Date value1, Date value2) {
			addCriterion("start_time between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotBetween(Date value1, Date value2) {
			addCriterion("start_time not between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeIsNull() {
			addCriterion("end_time is null");
			return (Criteria) this;
		}

		public Criteria andEndTimeIsNotNull() {
			addCriterion("end_time is not null");
			return (Criteria) this;
		}

		public Criteria andEndTimeEqualTo(Date value) {
			addCriterion("end_time =", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotEqualTo(Date value) {
			addCriterion("end_time <>", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeGreaterThan(Date value) {
			addCriterion("end_time >", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("end_time >=", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeLessThan(Date value) {
			addCriterion("end_time <", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeLessThanOrEqualTo(Date value) {
			addCriterion("end_time <=", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeIn(List<Date> values) {
			addCriterion("end_time in", values, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotIn(List<Date> values) {
			addCriterion("end_time not in", values, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeBetween(Date value1, Date value2) {
			addCriterion("end_time between", value1, value2, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotBetween(Date value1, Date value2) {
			addCriterion("end_time not between", value1, value2, "endTime");
			return (Criteria) this;
		}

		public Criteria andIssuedQuantityIsNull() {
			addCriterion("issued_quantity is null");
			return (Criteria) this;
		}

		public Criteria andIssuedQuantityIsNotNull() {
			addCriterion("issued_quantity is not null");
			return (Criteria) this;
		}

		public Criteria andIssuedQuantityEqualTo(Integer value) {
			addCriterion("issued_quantity =", value, "issuedQuantity");
			return (Criteria) this;
		}

		public Criteria andIssuedQuantityNotEqualTo(Integer value) {
			addCriterion("issued_quantity <>", value, "issuedQuantity");
			return (Criteria) this;
		}

		public Criteria andIssuedQuantityGreaterThan(Integer value) {
			addCriterion("issued_quantity >", value, "issuedQuantity");
			return (Criteria) this;
		}

		public Criteria andIssuedQuantityGreaterThanOrEqualTo(Integer value) {
			addCriterion("issued_quantity >=", value, "issuedQuantity");
			return (Criteria) this;
		}

		public Criteria andIssuedQuantityLessThan(Integer value) {
			addCriterion("issued_quantity <", value, "issuedQuantity");
			return (Criteria) this;
		}

		public Criteria andIssuedQuantityLessThanOrEqualTo(Integer value) {
			addCriterion("issued_quantity <=", value, "issuedQuantity");
			return (Criteria) this;
		}

		public Criteria andIssuedQuantityIn(List<Integer> values) {
			addCriterion("issued_quantity in", values, "issuedQuantity");
			return (Criteria) this;
		}

		public Criteria andIssuedQuantityNotIn(List<Integer> values) {
			addCriterion("issued_quantity not in", values, "issuedQuantity");
			return (Criteria) this;
		}

		public Criteria andIssuedQuantityBetween(Integer value1, Integer value2) {
			addCriterion("issued_quantity between", value1, value2, "issuedQuantity");
			return (Criteria) this;
		}

		public Criteria andIssuedQuantityNotBetween(Integer value1, Integer value2) {
			addCriterion("issued_quantity not between", value1, value2, "issuedQuantity");
			return (Criteria) this;
		}

		public Criteria andReceiveQuantityIsNull() {
			addCriterion("receive_quantity is null");
			return (Criteria) this;
		}

		public Criteria andReceiveQuantityIsNotNull() {
			addCriterion("receive_quantity is not null");
			return (Criteria) this;
		}

		public Criteria andReceiveQuantityEqualTo(Integer value) {
			addCriterion("receive_quantity =", value, "receiveQuantity");
			return (Criteria) this;
		}

		public Criteria andReceiveQuantityNotEqualTo(Integer value) {
			addCriterion("receive_quantity <>", value, "receiveQuantity");
			return (Criteria) this;
		}

		public Criteria andReceiveQuantityGreaterThan(Integer value) {
			addCriterion("receive_quantity >", value, "receiveQuantity");
			return (Criteria) this;
		}

		public Criteria andReceiveQuantityGreaterThanOrEqualTo(Integer value) {
			addCriterion("receive_quantity >=", value, "receiveQuantity");
			return (Criteria) this;
		}

		public Criteria andReceiveQuantityLessThan(Integer value) {
			addCriterion("receive_quantity <", value, "receiveQuantity");
			return (Criteria) this;
		}

		public Criteria andReceiveQuantityLessThanOrEqualTo(Integer value) {
			addCriterion("receive_quantity <=", value, "receiveQuantity");
			return (Criteria) this;
		}

		public Criteria andReceiveQuantityIn(List<Integer> values) {
			addCriterion("receive_quantity in", values, "receiveQuantity");
			return (Criteria) this;
		}

		public Criteria andReceiveQuantityNotIn(List<Integer> values) {
			addCriterion("receive_quantity not in", values, "receiveQuantity");
			return (Criteria) this;
		}

		public Criteria andReceiveQuantityBetween(Integer value1, Integer value2) {
			addCriterion("receive_quantity between", value1, value2, "receiveQuantity");
			return (Criteria) this;
		}

		public Criteria andReceiveQuantityNotBetween(Integer value1, Integer value2) {
			addCriterion("receive_quantity not between", value1, value2, "receiveQuantity");
			return (Criteria) this;
		}

		public Criteria andImageIdIsNull() {
			addCriterion("image_id is null");
			return (Criteria) this;
		}

		public Criteria andImageIdIsNotNull() {
			addCriterion("image_id is not null");
			return (Criteria) this;
		}

		public Criteria andImageIdEqualTo(Integer value) {
			addCriterion("image_id =", value, "imageId");
			return (Criteria) this;
		}

		public Criteria andImageIdNotEqualTo(Integer value) {
			addCriterion("image_id <>", value, "imageId");
			return (Criteria) this;
		}

		public Criteria andImageIdGreaterThan(Integer value) {
			addCriterion("image_id >", value, "imageId");
			return (Criteria) this;
		}

		public Criteria andImageIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("image_id >=", value, "imageId");
			return (Criteria) this;
		}

		public Criteria andImageIdLessThan(Integer value) {
			addCriterion("image_id <", value, "imageId");
			return (Criteria) this;
		}

		public Criteria andImageIdLessThanOrEqualTo(Integer value) {
			addCriterion("image_id <=", value, "imageId");
			return (Criteria) this;
		}

		public Criteria andImageIdIn(List<Integer> values) {
			addCriterion("image_id in", values, "imageId");
			return (Criteria) this;
		}

		public Criteria andImageIdNotIn(List<Integer> values) {
			addCriterion("image_id not in", values, "imageId");
			return (Criteria) this;
		}

		public Criteria andImageIdBetween(Integer value1, Integer value2) {
			addCriterion("image_id between", value1, value2, "imageId");
			return (Criteria) this;
		}

		public Criteria andImageIdNotBetween(Integer value1, Integer value2) {
			addCriterion("image_id not between", value1, value2, "imageId");
			return (Criteria) this;
		}

		public Criteria andFlagIsNull() {
			addCriterion("flag is null");
			return (Criteria) this;
		}

		public Criteria andFlagIsNotNull() {
			addCriterion("flag is not null");
			return (Criteria) this;
		}

		public Criteria andFlagEqualTo(Byte value) {
			addCriterion("flag =", value, "flag");
			return (Criteria) this;
		}

		public Criteria andFlagNotEqualTo(Byte value) {
			addCriterion("flag <>", value, "flag");
			return (Criteria) this;
		}

		public Criteria andFlagGreaterThan(Byte value) {
			addCriterion("flag >", value, "flag");
			return (Criteria) this;
		}

		public Criteria andFlagGreaterThanOrEqualTo(Byte value) {
			addCriterion("flag >=", value, "flag");
			return (Criteria) this;
		}

		public Criteria andFlagLessThan(Byte value) {
			addCriterion("flag <", value, "flag");
			return (Criteria) this;
		}

		public Criteria andFlagLessThanOrEqualTo(Byte value) {
			addCriterion("flag <=", value, "flag");
			return (Criteria) this;
		}

		public Criteria andFlagIn(List<Byte> values) {
			addCriterion("flag in", values, "flag");
			return (Criteria) this;
		}

		public Criteria andFlagNotIn(List<Byte> values) {
			addCriterion("flag not in", values, "flag");
			return (Criteria) this;
		}

		public Criteria andFlagBetween(Byte value1, Byte value2) {
			addCriterion("flag between", value1, value2, "flag");
			return (Criteria) this;
		}

		public Criteria andFlagNotBetween(Byte value1, Byte value2) {
			addCriterion("flag not between", value1, value2, "flag");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<Date> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<Date> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("update_time not between", value1, value2, "updateTime");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {
		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

}