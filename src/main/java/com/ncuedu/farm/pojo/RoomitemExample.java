package com.ncuedu.farm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomitemExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andPlantIdIsNull() {
            addCriterion("plant_id is null");
            return (Criteria) this;
        }

        public Criteria andPlantIdIsNotNull() {
            addCriterion("plant_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlantIdEqualTo(Integer value) {
            addCriterion("plant_id =", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotEqualTo(Integer value) {
            addCriterion("plant_id <>", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThan(Integer value) {
            addCriterion("plant_id >", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_id >=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThan(Integer value) {
            addCriterion("plant_id <", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThanOrEqualTo(Integer value) {
            addCriterion("plant_id <=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdIn(List<Integer> values) {
            addCriterion("plant_id in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotIn(List<Integer> values) {
            addCriterion("plant_id not in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdBetween(Integer value1, Integer value2) {
            addCriterion("plant_id between", value1, value2, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plant_id not between", value1, value2, "plantId");
            return (Criteria) this;
        }

        public Criteria andFieldIdIsNull() {
            addCriterion("field_id is null");
            return (Criteria) this;
        }

        public Criteria andFieldIdIsNotNull() {
            addCriterion("field_id is not null");
            return (Criteria) this;
        }

        public Criteria andFieldIdEqualTo(Integer value) {
            addCriterion("field_id =", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotEqualTo(Integer value) {
            addCriterion("field_id <>", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdGreaterThan(Integer value) {
            addCriterion("field_id >", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("field_id >=", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLessThan(Integer value) {
            addCriterion("field_id <", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLessThanOrEqualTo(Integer value) {
            addCriterion("field_id <=", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdIn(List<Integer> values) {
            addCriterion("field_id in", values, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotIn(List<Integer> values) {
            addCriterion("field_id not in", values, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdBetween(Integer value1, Integer value2) {
            addCriterion("field_id between", value1, value2, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotBetween(Integer value1, Integer value2) {
            addCriterion("field_id not between", value1, value2, "fieldId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andItemFlagIsNull() {
            addCriterion("item_flag is null");
            return (Criteria) this;
        }

        public Criteria andItemFlagIsNotNull() {
            addCriterion("item_flag is not null");
            return (Criteria) this;
        }

        public Criteria andItemFlagEqualTo(Byte value) {
            addCriterion("item_flag =", value, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagNotEqualTo(Byte value) {
            addCriterion("item_flag <>", value, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagGreaterThan(Byte value) {
            addCriterion("item_flag >", value, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("item_flag >=", value, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagLessThan(Byte value) {
            addCriterion("item_flag <", value, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagLessThanOrEqualTo(Byte value) {
            addCriterion("item_flag <=", value, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagIn(List<Byte> values) {
            addCriterion("item_flag in", values, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagNotIn(List<Byte> values) {
            addCriterion("item_flag not in", values, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagBetween(Byte value1, Byte value2) {
            addCriterion("item_flag between", value1, value2, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("item_flag not between", value1, value2, "itemFlag");
            return (Criteria) this;
        }

        public Criteria andItemDateIsNull() {
            addCriterion("item_date is null");
            return (Criteria) this;
        }

        public Criteria andItemDateIsNotNull() {
            addCriterion("item_date is not null");
            return (Criteria) this;
        }

        public Criteria andItemDateEqualTo(Date value) {
            addCriterion("item_date =", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateNotEqualTo(Date value) {
            addCriterion("item_date <>", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateGreaterThan(Date value) {
            addCriterion("item_date >", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateGreaterThanOrEqualTo(Date value) {
            addCriterion("item_date >=", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateLessThan(Date value) {
            addCriterion("item_date <", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateLessThanOrEqualTo(Date value) {
            addCriterion("item_date <=", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateIn(List<Date> values) {
            addCriterion("item_date in", values, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateNotIn(List<Date> values) {
            addCriterion("item_date not in", values, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateBetween(Date value1, Date value2) {
            addCriterion("item_date between", value1, value2, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateNotBetween(Date value1, Date value2) {
            addCriterion("item_date not between", value1, value2, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemStartIsNull() {
            addCriterion("item_start is null");
            return (Criteria) this;
        }

        public Criteria andItemStartIsNotNull() {
            addCriterion("item_start is not null");
            return (Criteria) this;
        }

        public Criteria andItemStartEqualTo(Date value) {
            addCriterion("item_start =", value, "itemStart");
            return (Criteria) this;
        }

        public Criteria andItemStartNotEqualTo(Date value) {
            addCriterion("item_start <>", value, "itemStart");
            return (Criteria) this;
        }

        public Criteria andItemStartGreaterThan(Date value) {
            addCriterion("item_start >", value, "itemStart");
            return (Criteria) this;
        }

        public Criteria andItemStartGreaterThanOrEqualTo(Date value) {
            addCriterion("item_start >=", value, "itemStart");
            return (Criteria) this;
        }

        public Criteria andItemStartLessThan(Date value) {
            addCriterion("item_start <", value, "itemStart");
            return (Criteria) this;
        }

        public Criteria andItemStartLessThanOrEqualTo(Date value) {
            addCriterion("item_start <=", value, "itemStart");
            return (Criteria) this;
        }

        public Criteria andItemStartIn(List<Date> values) {
            addCriterion("item_start in", values, "itemStart");
            return (Criteria) this;
        }

        public Criteria andItemStartNotIn(List<Date> values) {
            addCriterion("item_start not in", values, "itemStart");
            return (Criteria) this;
        }

        public Criteria andItemStartBetween(Date value1, Date value2) {
            addCriterion("item_start between", value1, value2, "itemStart");
            return (Criteria) this;
        }

        public Criteria andItemStartNotBetween(Date value1, Date value2) {
            addCriterion("item_start not between", value1, value2, "itemStart");
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