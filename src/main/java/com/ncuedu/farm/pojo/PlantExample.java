package com.ncuedu.farm.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PlantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlantExample() {
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

        public Criteria andPlantNameIsNull() {
            addCriterion("plant_name is null");
            return (Criteria) this;
        }

        public Criteria andPlantNameIsNotNull() {
            addCriterion("plant_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlantNameEqualTo(String value) {
            addCriterion("plant_name =", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotEqualTo(String value) {
            addCriterion("plant_name <>", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameGreaterThan(String value) {
            addCriterion("plant_name >", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameGreaterThanOrEqualTo(String value) {
            addCriterion("plant_name >=", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameLessThan(String value) {
            addCriterion("plant_name <", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameLessThanOrEqualTo(String value) {
            addCriterion("plant_name <=", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameLike(String value) {
            addCriterion("plant_name like", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotLike(String value) {
            addCriterion("plant_name not like", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameIn(List<String> values) {
            addCriterion("plant_name in", values, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotIn(List<String> values) {
            addCriterion("plant_name not in", values, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameBetween(String value1, String value2) {
            addCriterion("plant_name between", value1, value2, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotBetween(String value1, String value2) {
            addCriterion("plant_name not between", value1, value2, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantStockIsNull() {
            addCriterion("plant_stock is null");
            return (Criteria) this;
        }

        public Criteria andPlantStockIsNotNull() {
            addCriterion("plant_stock is not null");
            return (Criteria) this;
        }

        public Criteria andPlantStockEqualTo(Integer value) {
            addCriterion("plant_stock =", value, "plantStock");
            return (Criteria) this;
        }

        public Criteria andPlantStockNotEqualTo(Integer value) {
            addCriterion("plant_stock <>", value, "plantStock");
            return (Criteria) this;
        }

        public Criteria andPlantStockGreaterThan(Integer value) {
            addCriterion("plant_stock >", value, "plantStock");
            return (Criteria) this;
        }

        public Criteria andPlantStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_stock >=", value, "plantStock");
            return (Criteria) this;
        }

        public Criteria andPlantStockLessThan(Integer value) {
            addCriterion("plant_stock <", value, "plantStock");
            return (Criteria) this;
        }

        public Criteria andPlantStockLessThanOrEqualTo(Integer value) {
            addCriterion("plant_stock <=", value, "plantStock");
            return (Criteria) this;
        }

        public Criteria andPlantStockIn(List<Integer> values) {
            addCriterion("plant_stock in", values, "plantStock");
            return (Criteria) this;
        }

        public Criteria andPlantStockNotIn(List<Integer> values) {
            addCriterion("plant_stock not in", values, "plantStock");
            return (Criteria) this;
        }

        public Criteria andPlantStockBetween(Integer value1, Integer value2) {
            addCriterion("plant_stock between", value1, value2, "plantStock");
            return (Criteria) this;
        }

        public Criteria andPlantStockNotBetween(Integer value1, Integer value2) {
            addCriterion("plant_stock not between", value1, value2, "plantStock");
            return (Criteria) this;
        }

        public Criteria andPlantSalepriceIsNull() {
            addCriterion("plant_saleprice is null");
            return (Criteria) this;
        }

        public Criteria andPlantSalepriceIsNotNull() {
            addCriterion("plant_saleprice is not null");
            return (Criteria) this;
        }

        public Criteria andPlantSalepriceEqualTo(BigDecimal value) {
            addCriterion("plant_saleprice =", value, "plantSaleprice");
            return (Criteria) this;
        }

        public Criteria andPlantSalepriceNotEqualTo(BigDecimal value) {
            addCriterion("plant_saleprice <>", value, "plantSaleprice");
            return (Criteria) this;
        }

        public Criteria andPlantSalepriceGreaterThan(BigDecimal value) {
            addCriterion("plant_saleprice >", value, "plantSaleprice");
            return (Criteria) this;
        }

        public Criteria andPlantSalepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plant_saleprice >=", value, "plantSaleprice");
            return (Criteria) this;
        }

        public Criteria andPlantSalepriceLessThan(BigDecimal value) {
            addCriterion("plant_saleprice <", value, "plantSaleprice");
            return (Criteria) this;
        }

        public Criteria andPlantSalepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plant_saleprice <=", value, "plantSaleprice");
            return (Criteria) this;
        }

        public Criteria andPlantSalepriceIn(List<BigDecimal> values) {
            addCriterion("plant_saleprice in", values, "plantSaleprice");
            return (Criteria) this;
        }

        public Criteria andPlantSalepriceNotIn(List<BigDecimal> values) {
            addCriterion("plant_saleprice not in", values, "plantSaleprice");
            return (Criteria) this;
        }

        public Criteria andPlantSalepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plant_saleprice between", value1, value2, "plantSaleprice");
            return (Criteria) this;
        }

        public Criteria andPlantSalepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plant_saleprice not between", value1, value2, "plantSaleprice");
            return (Criteria) this;
        }

        public Criteria andPlantDesIsNull() {
            addCriterion("plant_des is null");
            return (Criteria) this;
        }

        public Criteria andPlantDesIsNotNull() {
            addCriterion("plant_des is not null");
            return (Criteria) this;
        }

        public Criteria andPlantDesEqualTo(String value) {
            addCriterion("plant_des =", value, "plantDes");
            return (Criteria) this;
        }

        public Criteria andPlantDesNotEqualTo(String value) {
            addCriterion("plant_des <>", value, "plantDes");
            return (Criteria) this;
        }

        public Criteria andPlantDesGreaterThan(String value) {
            addCriterion("plant_des >", value, "plantDes");
            return (Criteria) this;
        }

        public Criteria andPlantDesGreaterThanOrEqualTo(String value) {
            addCriterion("plant_des >=", value, "plantDes");
            return (Criteria) this;
        }

        public Criteria andPlantDesLessThan(String value) {
            addCriterion("plant_des <", value, "plantDes");
            return (Criteria) this;
        }

        public Criteria andPlantDesLessThanOrEqualTo(String value) {
            addCriterion("plant_des <=", value, "plantDes");
            return (Criteria) this;
        }

        public Criteria andPlantDesLike(String value) {
            addCriterion("plant_des like", value, "plantDes");
            return (Criteria) this;
        }

        public Criteria andPlantDesNotLike(String value) {
            addCriterion("plant_des not like", value, "plantDes");
            return (Criteria) this;
        }

        public Criteria andPlantDesIn(List<String> values) {
            addCriterion("plant_des in", values, "plantDes");
            return (Criteria) this;
        }

        public Criteria andPlantDesNotIn(List<String> values) {
            addCriterion("plant_des not in", values, "plantDes");
            return (Criteria) this;
        }

        public Criteria andPlantDesBetween(String value1, String value2) {
            addCriterion("plant_des between", value1, value2, "plantDes");
            return (Criteria) this;
        }

        public Criteria andPlantDesNotBetween(String value1, String value2) {
            addCriterion("plant_des not between", value1, value2, "plantDes");
            return (Criteria) this;
        }

        public Criteria andPlantOrderpriceIsNull() {
            addCriterion("plant_orderprice is null");
            return (Criteria) this;
        }

        public Criteria andPlantOrderpriceIsNotNull() {
            addCriterion("plant_orderprice is not null");
            return (Criteria) this;
        }

        public Criteria andPlantOrderpriceEqualTo(BigDecimal value) {
            addCriterion("plant_orderprice =", value, "plantOrderprice");
            return (Criteria) this;
        }

        public Criteria andPlantOrderpriceNotEqualTo(BigDecimal value) {
            addCriterion("plant_orderprice <>", value, "plantOrderprice");
            return (Criteria) this;
        }

        public Criteria andPlantOrderpriceGreaterThan(BigDecimal value) {
            addCriterion("plant_orderprice >", value, "plantOrderprice");
            return (Criteria) this;
        }

        public Criteria andPlantOrderpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plant_orderprice >=", value, "plantOrderprice");
            return (Criteria) this;
        }

        public Criteria andPlantOrderpriceLessThan(BigDecimal value) {
            addCriterion("plant_orderprice <", value, "plantOrderprice");
            return (Criteria) this;
        }

        public Criteria andPlantOrderpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plant_orderprice <=", value, "plantOrderprice");
            return (Criteria) this;
        }

        public Criteria andPlantOrderpriceIn(List<BigDecimal> values) {
            addCriterion("plant_orderprice in", values, "plantOrderprice");
            return (Criteria) this;
        }

        public Criteria andPlantOrderpriceNotIn(List<BigDecimal> values) {
            addCriterion("plant_orderprice not in", values, "plantOrderprice");
            return (Criteria) this;
        }

        public Criteria andPlantOrderpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plant_orderprice between", value1, value2, "plantOrderprice");
            return (Criteria) this;
        }

        public Criteria andPlantOrderpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plant_orderprice not between", value1, value2, "plantOrderprice");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNull() {
            addCriterion("cate_id is null");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNotNull() {
            addCriterion("cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCateIdEqualTo(Integer value) {
            addCriterion("cate_id =", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotEqualTo(Integer value) {
            addCriterion("cate_id <>", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThan(Integer value) {
            addCriterion("cate_id >", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cate_id >=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThan(Integer value) {
            addCriterion("cate_id <", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThanOrEqualTo(Integer value) {
            addCriterion("cate_id <=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdIn(List<Integer> values) {
            addCriterion("cate_id in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotIn(List<Integer> values) {
            addCriterion("cate_id not in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdBetween(Integer value1, Integer value2) {
            addCriterion("cate_id between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cate_id not between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andPlantImgIsNull() {
            addCriterion("plant_img is null");
            return (Criteria) this;
        }

        public Criteria andPlantImgIsNotNull() {
            addCriterion("plant_img is not null");
            return (Criteria) this;
        }

        public Criteria andPlantImgEqualTo(String value) {
            addCriterion("plant_img =", value, "plantImg");
            return (Criteria) this;
        }

        public Criteria andPlantImgNotEqualTo(String value) {
            addCriterion("plant_img <>", value, "plantImg");
            return (Criteria) this;
        }

        public Criteria andPlantImgGreaterThan(String value) {
            addCriterion("plant_img >", value, "plantImg");
            return (Criteria) this;
        }

        public Criteria andPlantImgGreaterThanOrEqualTo(String value) {
            addCriterion("plant_img >=", value, "plantImg");
            return (Criteria) this;
        }

        public Criteria andPlantImgLessThan(String value) {
            addCriterion("plant_img <", value, "plantImg");
            return (Criteria) this;
        }

        public Criteria andPlantImgLessThanOrEqualTo(String value) {
            addCriterion("plant_img <=", value, "plantImg");
            return (Criteria) this;
        }

        public Criteria andPlantImgLike(String value) {
            addCriterion("plant_img like", value, "plantImg");
            return (Criteria) this;
        }

        public Criteria andPlantImgNotLike(String value) {
            addCriterion("plant_img not like", value, "plantImg");
            return (Criteria) this;
        }

        public Criteria andPlantImgIn(List<String> values) {
            addCriterion("plant_img in", values, "plantImg");
            return (Criteria) this;
        }

        public Criteria andPlantImgNotIn(List<String> values) {
            addCriterion("plant_img not in", values, "plantImg");
            return (Criteria) this;
        }

        public Criteria andPlantImgBetween(String value1, String value2) {
            addCriterion("plant_img between", value1, value2, "plantImg");
            return (Criteria) this;
        }

        public Criteria andPlantImgNotBetween(String value1, String value2) {
            addCriterion("plant_img not between", value1, value2, "plantImg");
            return (Criteria) this;
        }

        public Criteria andPlantFlagIsNull() {
            addCriterion("plant_flag is null");
            return (Criteria) this;
        }

        public Criteria andPlantFlagIsNotNull() {
            addCriterion("plant_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPlantFlagEqualTo(Integer value) {
            addCriterion("plant_flag =", value, "plantFlag");
            return (Criteria) this;
        }

        public Criteria andPlantFlagNotEqualTo(Integer value) {
            addCriterion("plant_flag <>", value, "plantFlag");
            return (Criteria) this;
        }

        public Criteria andPlantFlagGreaterThan(Integer value) {
            addCriterion("plant_flag >", value, "plantFlag");
            return (Criteria) this;
        }

        public Criteria andPlantFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_flag >=", value, "plantFlag");
            return (Criteria) this;
        }

        public Criteria andPlantFlagLessThan(Integer value) {
            addCriterion("plant_flag <", value, "plantFlag");
            return (Criteria) this;
        }

        public Criteria andPlantFlagLessThanOrEqualTo(Integer value) {
            addCriterion("plant_flag <=", value, "plantFlag");
            return (Criteria) this;
        }

        public Criteria andPlantFlagIn(List<Integer> values) {
            addCriterion("plant_flag in", values, "plantFlag");
            return (Criteria) this;
        }

        public Criteria andPlantFlagNotIn(List<Integer> values) {
            addCriterion("plant_flag not in", values, "plantFlag");
            return (Criteria) this;
        }

        public Criteria andPlantFlagBetween(Integer value1, Integer value2) {
            addCriterion("plant_flag between", value1, value2, "plantFlag");
            return (Criteria) this;
        }

        public Criteria andPlantFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("plant_flag not between", value1, value2, "plantFlag");
            return (Criteria) this;
        }

        public Criteria andPlantSalenumIsNull() {
            addCriterion("plant_salenum is null");
            return (Criteria) this;
        }

        public Criteria andPlantSalenumIsNotNull() {
            addCriterion("plant_salenum is not null");
            return (Criteria) this;
        }

        public Criteria andPlantSalenumEqualTo(Integer value) {
            addCriterion("plant_salenum =", value, "plantSalenum");
            return (Criteria) this;
        }

        public Criteria andPlantSalenumNotEqualTo(Integer value) {
            addCriterion("plant_salenum <>", value, "plantSalenum");
            return (Criteria) this;
        }

        public Criteria andPlantSalenumGreaterThan(Integer value) {
            addCriterion("plant_salenum >", value, "plantSalenum");
            return (Criteria) this;
        }

        public Criteria andPlantSalenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_salenum >=", value, "plantSalenum");
            return (Criteria) this;
        }

        public Criteria andPlantSalenumLessThan(Integer value) {
            addCriterion("plant_salenum <", value, "plantSalenum");
            return (Criteria) this;
        }

        public Criteria andPlantSalenumLessThanOrEqualTo(Integer value) {
            addCriterion("plant_salenum <=", value, "plantSalenum");
            return (Criteria) this;
        }

        public Criteria andPlantSalenumIn(List<Integer> values) {
            addCriterion("plant_salenum in", values, "plantSalenum");
            return (Criteria) this;
        }

        public Criteria andPlantSalenumNotIn(List<Integer> values) {
            addCriterion("plant_salenum not in", values, "plantSalenum");
            return (Criteria) this;
        }

        public Criteria andPlantSalenumBetween(Integer value1, Integer value2) {
            addCriterion("plant_salenum between", value1, value2, "plantSalenum");
            return (Criteria) this;
        }

        public Criteria andPlantSalenumNotBetween(Integer value1, Integer value2) {
            addCriterion("plant_salenum not between", value1, value2, "plantSalenum");
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