package com.ncuedu.farm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderDowndateIsNull() {
            addCriterion("order_downdate is null");
            return (Criteria) this;
        }

        public Criteria andOrderDowndateIsNotNull() {
            addCriterion("order_downdate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDowndateEqualTo(Date value) {
            addCriterion("order_downdate =", value, "orderDowndate");
            return (Criteria) this;
        }

        public Criteria andOrderDowndateNotEqualTo(Date value) {
            addCriterion("order_downdate <>", value, "orderDowndate");
            return (Criteria) this;
        }

        public Criteria andOrderDowndateGreaterThan(Date value) {
            addCriterion("order_downdate >", value, "orderDowndate");
            return (Criteria) this;
        }

        public Criteria andOrderDowndateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_downdate >=", value, "orderDowndate");
            return (Criteria) this;
        }

        public Criteria andOrderDowndateLessThan(Date value) {
            addCriterion("order_downdate <", value, "orderDowndate");
            return (Criteria) this;
        }

        public Criteria andOrderDowndateLessThanOrEqualTo(Date value) {
            addCriterion("order_downdate <=", value, "orderDowndate");
            return (Criteria) this;
        }

        public Criteria andOrderDowndateIn(List<Date> values) {
            addCriterion("order_downdate in", values, "orderDowndate");
            return (Criteria) this;
        }

        public Criteria andOrderDowndateNotIn(List<Date> values) {
            addCriterion("order_downdate not in", values, "orderDowndate");
            return (Criteria) this;
        }

        public Criteria andOrderDowndateBetween(Date value1, Date value2) {
            addCriterion("order_downdate between", value1, value2, "orderDowndate");
            return (Criteria) this;
        }

        public Criteria andOrderDowndateNotBetween(Date value1, Date value2) {
            addCriterion("order_downdate not between", value1, value2, "orderDowndate");
            return (Criteria) this;
        }

        public Criteria andCropIdIsNull() {
            addCriterion("crop_id is null");
            return (Criteria) this;
        }

        public Criteria andCropIdIsNotNull() {
            addCriterion("crop_id is not null");
            return (Criteria) this;
        }

        public Criteria andCropIdEqualTo(Integer value) {
            addCriterion("crop_id =", value, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdNotEqualTo(Integer value) {
            addCriterion("crop_id <>", value, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdGreaterThan(Integer value) {
            addCriterion("crop_id >", value, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("crop_id >=", value, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdLessThan(Integer value) {
            addCriterion("crop_id <", value, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdLessThanOrEqualTo(Integer value) {
            addCriterion("crop_id <=", value, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdIn(List<Integer> values) {
            addCriterion("crop_id in", values, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdNotIn(List<Integer> values) {
            addCriterion("crop_id not in", values, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdBetween(Integer value1, Integer value2) {
            addCriterion("crop_id between", value1, value2, "cropId");
            return (Criteria) this;
        }

        public Criteria andCropIdNotBetween(Integer value1, Integer value2) {
            addCriterion("crop_id not between", value1, value2, "cropId");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNull() {
            addCriterion("order_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNotNull() {
            addCriterion("order_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNameEqualTo(String value) {
            addCriterion("order_name =", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotEqualTo(String value) {
            addCriterion("order_name <>", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThan(String value) {
            addCriterion("order_name >", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_name >=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThan(String value) {
            addCriterion("order_name <", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThanOrEqualTo(String value) {
            addCriterion("order_name <=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLike(String value) {
            addCriterion("order_name like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotLike(String value) {
            addCriterion("order_name not like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameIn(List<String> values) {
            addCriterion("order_name in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotIn(List<String> values) {
            addCriterion("order_name not in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameBetween(String value1, String value2) {
            addCriterion("order_name between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotBetween(String value1, String value2) {
            addCriterion("order_name not between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderTelIsNull() {
            addCriterion("order_tel is null");
            return (Criteria) this;
        }

        public Criteria andOrderTelIsNotNull() {
            addCriterion("order_tel is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTelEqualTo(String value) {
            addCriterion("order_tel =", value, "orderTel");
            return (Criteria) this;
        }

        public Criteria andOrderTelNotEqualTo(String value) {
            addCriterion("order_tel <>", value, "orderTel");
            return (Criteria) this;
        }

        public Criteria andOrderTelGreaterThan(String value) {
            addCriterion("order_tel >", value, "orderTel");
            return (Criteria) this;
        }

        public Criteria andOrderTelGreaterThanOrEqualTo(String value) {
            addCriterion("order_tel >=", value, "orderTel");
            return (Criteria) this;
        }

        public Criteria andOrderTelLessThan(String value) {
            addCriterion("order_tel <", value, "orderTel");
            return (Criteria) this;
        }

        public Criteria andOrderTelLessThanOrEqualTo(String value) {
            addCriterion("order_tel <=", value, "orderTel");
            return (Criteria) this;
        }

        public Criteria andOrderTelLike(String value) {
            addCriterion("order_tel like", value, "orderTel");
            return (Criteria) this;
        }

        public Criteria andOrderTelNotLike(String value) {
            addCriterion("order_tel not like", value, "orderTel");
            return (Criteria) this;
        }

        public Criteria andOrderTelIn(List<String> values) {
            addCriterion("order_tel in", values, "orderTel");
            return (Criteria) this;
        }

        public Criteria andOrderTelNotIn(List<String> values) {
            addCriterion("order_tel not in", values, "orderTel");
            return (Criteria) this;
        }

        public Criteria andOrderTelBetween(String value1, String value2) {
            addCriterion("order_tel between", value1, value2, "orderTel");
            return (Criteria) this;
        }

        public Criteria andOrderTelNotBetween(String value1, String value2) {
            addCriterion("order_tel not between", value1, value2, "orderTel");
            return (Criteria) this;
        }

        public Criteria andOrderAddrIsNull() {
            addCriterion("order_addr is null");
            return (Criteria) this;
        }

        public Criteria andOrderAddrIsNotNull() {
            addCriterion("order_addr is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAddrEqualTo(String value) {
            addCriterion("order_addr =", value, "orderAddr");
            return (Criteria) this;
        }

        public Criteria andOrderAddrNotEqualTo(String value) {
            addCriterion("order_addr <>", value, "orderAddr");
            return (Criteria) this;
        }

        public Criteria andOrderAddrGreaterThan(String value) {
            addCriterion("order_addr >", value, "orderAddr");
            return (Criteria) this;
        }

        public Criteria andOrderAddrGreaterThanOrEqualTo(String value) {
            addCriterion("order_addr >=", value, "orderAddr");
            return (Criteria) this;
        }

        public Criteria andOrderAddrLessThan(String value) {
            addCriterion("order_addr <", value, "orderAddr");
            return (Criteria) this;
        }

        public Criteria andOrderAddrLessThanOrEqualTo(String value) {
            addCriterion("order_addr <=", value, "orderAddr");
            return (Criteria) this;
        }

        public Criteria andOrderAddrLike(String value) {
            addCriterion("order_addr like", value, "orderAddr");
            return (Criteria) this;
        }

        public Criteria andOrderAddrNotLike(String value) {
            addCriterion("order_addr not like", value, "orderAddr");
            return (Criteria) this;
        }

        public Criteria andOrderAddrIn(List<String> values) {
            addCriterion("order_addr in", values, "orderAddr");
            return (Criteria) this;
        }

        public Criteria andOrderAddrNotIn(List<String> values) {
            addCriterion("order_addr not in", values, "orderAddr");
            return (Criteria) this;
        }

        public Criteria andOrderAddrBetween(String value1, String value2) {
            addCriterion("order_addr between", value1, value2, "orderAddr");
            return (Criteria) this;
        }

        public Criteria andOrderAddrNotBetween(String value1, String value2) {
            addCriterion("order_addr not between", value1, value2, "orderAddr");
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