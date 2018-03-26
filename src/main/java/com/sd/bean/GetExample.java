package com.sd.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GetExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andPickCodeIsNull() {
            addCriterion("pick_code is null");
            return (Criteria) this;
        }

        public Criteria andPickCodeIsNotNull() {
            addCriterion("pick_code is not null");
            return (Criteria) this;
        }

        public Criteria andPickCodeEqualTo(String value) {
            addCriterion("pick_code =", value, "pickCode");
            return (Criteria) this;
        }

        public Criteria andPickCodeNotEqualTo(String value) {
            addCriterion("pick_code <>", value, "pickCode");
            return (Criteria) this;
        }

        public Criteria andPickCodeGreaterThan(String value) {
            addCriterion("pick_code >", value, "pickCode");
            return (Criteria) this;
        }

        public Criteria andPickCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pick_code >=", value, "pickCode");
            return (Criteria) this;
        }

        public Criteria andPickCodeLessThan(String value) {
            addCriterion("pick_code <", value, "pickCode");
            return (Criteria) this;
        }

        public Criteria andPickCodeLessThanOrEqualTo(String value) {
            addCriterion("pick_code <=", value, "pickCode");
            return (Criteria) this;
        }

        public Criteria andPickCodeLike(String value) {
            addCriterion("pick_code like", value, "pickCode");
            return (Criteria) this;
        }

        public Criteria andPickCodeNotLike(String value) {
            addCriterion("pick_code not like", value, "pickCode");
            return (Criteria) this;
        }

        public Criteria andPickCodeIn(List<String> values) {
            addCriterion("pick_code in", values, "pickCode");
            return (Criteria) this;
        }

        public Criteria andPickCodeNotIn(List<String> values) {
            addCriterion("pick_code not in", values, "pickCode");
            return (Criteria) this;
        }

        public Criteria andPickCodeBetween(String value1, String value2) {
            addCriterion("pick_code between", value1, value2, "pickCode");
            return (Criteria) this;
        }

        public Criteria andPickCodeNotBetween(String value1, String value2) {
            addCriterion("pick_code not between", value1, value2, "pickCode");
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

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andInformDateIsNull() {
            addCriterion("inform_date is null");
            return (Criteria) this;
        }

        public Criteria andInformDateIsNotNull() {
            addCriterion("inform_date is not null");
            return (Criteria) this;
        }

        public Criteria andInformDateEqualTo(Date value) {
            addCriterionForJDBCDate("inform_date =", value, "informDate");
            return (Criteria) this;
        }

        public Criteria andInformDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("inform_date <>", value, "informDate");
            return (Criteria) this;
        }

        public Criteria andInformDateGreaterThan(Date value) {
            addCriterionForJDBCDate("inform_date >", value, "informDate");
            return (Criteria) this;
        }

        public Criteria andInformDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inform_date >=", value, "informDate");
            return (Criteria) this;
        }

        public Criteria andInformDateLessThan(Date value) {
            addCriterionForJDBCDate("inform_date <", value, "informDate");
            return (Criteria) this;
        }

        public Criteria andInformDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inform_date <=", value, "informDate");
            return (Criteria) this;
        }

        public Criteria andInformDateIn(List<Date> values) {
            addCriterionForJDBCDate("inform_date in", values, "informDate");
            return (Criteria) this;
        }

        public Criteria andInformDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("inform_date not in", values, "informDate");
            return (Criteria) this;
        }

        public Criteria andInformDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inform_date between", value1, value2, "informDate");
            return (Criteria) this;
        }

        public Criteria andInformDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inform_date not between", value1, value2, "informDate");
            return (Criteria) this;
        }

        public Criteria andIsUrgentIsNull() {
            addCriterion("is_urgent is null");
            return (Criteria) this;
        }

        public Criteria andIsUrgentIsNotNull() {
            addCriterion("is_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andIsUrgentEqualTo(Byte value) {
            addCriterion("is_urgent =", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotEqualTo(Byte value) {
            addCriterion("is_urgent <>", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentGreaterThan(Byte value) {
            addCriterion("is_urgent >", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_urgent >=", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentLessThan(Byte value) {
            addCriterion("is_urgent <", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentLessThanOrEqualTo(Byte value) {
            addCriterion("is_urgent <=", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentIn(List<Byte> values) {
            addCriterion("is_urgent in", values, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotIn(List<Byte> values) {
            addCriterion("is_urgent not in", values, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentBetween(Byte value1, Byte value2) {
            addCriterion("is_urgent between", value1, value2, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotBetween(Byte value1, Byte value2) {
            addCriterion("is_urgent not between", value1, value2, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andUrgentTimeIsNull() {
            addCriterion("urgent_time is null");
            return (Criteria) this;
        }

        public Criteria andUrgentTimeIsNotNull() {
            addCriterion("urgent_time is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentTimeEqualTo(String value) {
            addCriterion("urgent_time =", value, "urgentTime");
            return (Criteria) this;
        }

        public Criteria andUrgentTimeNotEqualTo(String value) {
            addCriterion("urgent_time <>", value, "urgentTime");
            return (Criteria) this;
        }

        public Criteria andUrgentTimeGreaterThan(String value) {
            addCriterion("urgent_time >", value, "urgentTime");
            return (Criteria) this;
        }

        public Criteria andUrgentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("urgent_time >=", value, "urgentTime");
            return (Criteria) this;
        }

        public Criteria andUrgentTimeLessThan(String value) {
            addCriterion("urgent_time <", value, "urgentTime");
            return (Criteria) this;
        }

        public Criteria andUrgentTimeLessThanOrEqualTo(String value) {
            addCriterion("urgent_time <=", value, "urgentTime");
            return (Criteria) this;
        }

        public Criteria andUrgentTimeLike(String value) {
            addCriterion("urgent_time like", value, "urgentTime");
            return (Criteria) this;
        }

        public Criteria andUrgentTimeNotLike(String value) {
            addCriterion("urgent_time not like", value, "urgentTime");
            return (Criteria) this;
        }

        public Criteria andUrgentTimeIn(List<String> values) {
            addCriterion("urgent_time in", values, "urgentTime");
            return (Criteria) this;
        }

        public Criteria andUrgentTimeNotIn(List<String> values) {
            addCriterion("urgent_time not in", values, "urgentTime");
            return (Criteria) this;
        }

        public Criteria andUrgentTimeBetween(String value1, String value2) {
            addCriterion("urgent_time between", value1, value2, "urgentTime");
            return (Criteria) this;
        }

        public Criteria andUrgentTimeNotBetween(String value1, String value2) {
            addCriterion("urgent_time not between", value1, value2, "urgentTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryManIdIsNull() {
            addCriterion("delivery_man_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryManIdIsNotNull() {
            addCriterion("delivery_man_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryManIdEqualTo(Integer value) {
            addCriterion("delivery_man_id =", value, "deliveryManId");
            return (Criteria) this;
        }

        public Criteria andDeliveryManIdNotEqualTo(Integer value) {
            addCriterion("delivery_man_id <>", value, "deliveryManId");
            return (Criteria) this;
        }

        public Criteria andDeliveryManIdGreaterThan(Integer value) {
            addCriterion("delivery_man_id >", value, "deliveryManId");
            return (Criteria) this;
        }

        public Criteria andDeliveryManIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_man_id >=", value, "deliveryManId");
            return (Criteria) this;
        }

        public Criteria andDeliveryManIdLessThan(Integer value) {
            addCriterion("delivery_man_id <", value, "deliveryManId");
            return (Criteria) this;
        }

        public Criteria andDeliveryManIdLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_man_id <=", value, "deliveryManId");
            return (Criteria) this;
        }

        public Criteria andDeliveryManIdIn(List<Integer> values) {
            addCriterion("delivery_man_id in", values, "deliveryManId");
            return (Criteria) this;
        }

        public Criteria andDeliveryManIdNotIn(List<Integer> values) {
            addCriterion("delivery_man_id not in", values, "deliveryManId");
            return (Criteria) this;
        }

        public Criteria andDeliveryManIdBetween(Integer value1, Integer value2) {
            addCriterion("delivery_man_id between", value1, value2, "deliveryManId");
            return (Criteria) this;
        }

        public Criteria andDeliveryManIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_man_id not between", value1, value2, "deliveryManId");
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