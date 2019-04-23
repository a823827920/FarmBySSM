package com.ncuedu.farm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiaryExample() {
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

        public Criteria andDiaryIdIsNull() {
            addCriterion("diary_id is null");
            return (Criteria) this;
        }

        public Criteria andDiaryIdIsNotNull() {
            addCriterion("diary_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryIdEqualTo(Integer value) {
            addCriterion("diary_id =", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdNotEqualTo(Integer value) {
            addCriterion("diary_id <>", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdGreaterThan(Integer value) {
            addCriterion("diary_id >", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("diary_id >=", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdLessThan(Integer value) {
            addCriterion("diary_id <", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdLessThanOrEqualTo(Integer value) {
            addCriterion("diary_id <=", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdIn(List<Integer> values) {
            addCriterion("diary_id in", values, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdNotIn(List<Integer> values) {
            addCriterion("diary_id not in", values, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdBetween(Integer value1, Integer value2) {
            addCriterion("diary_id between", value1, value2, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("diary_id not between", value1, value2, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeIsNull() {
            addCriterion("diary_time is null");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeIsNotNull() {
            addCriterion("diary_time is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeEqualTo(Date value) {
            addCriterion("diary_time =", value, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeNotEqualTo(Date value) {
            addCriterion("diary_time <>", value, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeGreaterThan(Date value) {
            addCriterion("diary_time >", value, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("diary_time >=", value, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeLessThan(Date value) {
            addCriterion("diary_time <", value, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeLessThanOrEqualTo(Date value) {
            addCriterion("diary_time <=", value, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeIn(List<Date> values) {
            addCriterion("diary_time in", values, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeNotIn(List<Date> values) {
            addCriterion("diary_time not in", values, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeBetween(Date value1, Date value2) {
            addCriterion("diary_time between", value1, value2, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeNotBetween(Date value1, Date value2) {
            addCriterion("diary_time not between", value1, value2, "diaryTime");
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

        public Criteria andPlantHeightIsNull() {
            addCriterion("plant_height is null");
            return (Criteria) this;
        }

        public Criteria andPlantHeightIsNotNull() {
            addCriterion("plant_height is not null");
            return (Criteria) this;
        }

        public Criteria andPlantHeightEqualTo(String value) {
            addCriterion("plant_height =", value, "plantHeight");
            return (Criteria) this;
        }

        public Criteria andPlantHeightNotEqualTo(String value) {
            addCriterion("plant_height <>", value, "plantHeight");
            return (Criteria) this;
        }

        public Criteria andPlantHeightGreaterThan(String value) {
            addCriterion("plant_height >", value, "plantHeight");
            return (Criteria) this;
        }

        public Criteria andPlantHeightGreaterThanOrEqualTo(String value) {
            addCriterion("plant_height >=", value, "plantHeight");
            return (Criteria) this;
        }

        public Criteria andPlantHeightLessThan(String value) {
            addCriterion("plant_height <", value, "plantHeight");
            return (Criteria) this;
        }

        public Criteria andPlantHeightLessThanOrEqualTo(String value) {
            addCriterion("plant_height <=", value, "plantHeight");
            return (Criteria) this;
        }

        public Criteria andPlantHeightLike(String value) {
            addCriterion("plant_height like", value, "plantHeight");
            return (Criteria) this;
        }

        public Criteria andPlantHeightNotLike(String value) {
            addCriterion("plant_height not like", value, "plantHeight");
            return (Criteria) this;
        }

        public Criteria andPlantHeightIn(List<String> values) {
            addCriterion("plant_height in", values, "plantHeight");
            return (Criteria) this;
        }

        public Criteria andPlantHeightNotIn(List<String> values) {
            addCriterion("plant_height not in", values, "plantHeight");
            return (Criteria) this;
        }

        public Criteria andPlantHeightBetween(String value1, String value2) {
            addCriterion("plant_height between", value1, value2, "plantHeight");
            return (Criteria) this;
        }

        public Criteria andPlantHeightNotBetween(String value1, String value2) {
            addCriterion("plant_height not between", value1, value2, "plantHeight");
            return (Criteria) this;
        }

        public Criteria andFieldStateIsNull() {
            addCriterion("field_state is null");
            return (Criteria) this;
        }

        public Criteria andFieldStateIsNotNull() {
            addCriterion("field_state is not null");
            return (Criteria) this;
        }

        public Criteria andFieldStateEqualTo(String value) {
            addCriterion("field_state =", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateNotEqualTo(String value) {
            addCriterion("field_state <>", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateGreaterThan(String value) {
            addCriterion("field_state >", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateGreaterThanOrEqualTo(String value) {
            addCriterion("field_state >=", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateLessThan(String value) {
            addCriterion("field_state <", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateLessThanOrEqualTo(String value) {
            addCriterion("field_state <=", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateLike(String value) {
            addCriterion("field_state like", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateNotLike(String value) {
            addCriterion("field_state not like", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateIn(List<String> values) {
            addCriterion("field_state in", values, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateNotIn(List<String> values) {
            addCriterion("field_state not in", values, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateBetween(String value1, String value2) {
            addCriterion("field_state between", value1, value2, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateNotBetween(String value1, String value2) {
            addCriterion("field_state not between", value1, value2, "fieldState");
            return (Criteria) this;
        }

        public Criteria andInsectStateIsNull() {
            addCriterion("insect_state is null");
            return (Criteria) this;
        }

        public Criteria andInsectStateIsNotNull() {
            addCriterion("insect_state is not null");
            return (Criteria) this;
        }

        public Criteria andInsectStateEqualTo(String value) {
            addCriterion("insect_state =", value, "insectState");
            return (Criteria) this;
        }

        public Criteria andInsectStateNotEqualTo(String value) {
            addCriterion("insect_state <>", value, "insectState");
            return (Criteria) this;
        }

        public Criteria andInsectStateGreaterThan(String value) {
            addCriterion("insect_state >", value, "insectState");
            return (Criteria) this;
        }

        public Criteria andInsectStateGreaterThanOrEqualTo(String value) {
            addCriterion("insect_state >=", value, "insectState");
            return (Criteria) this;
        }

        public Criteria andInsectStateLessThan(String value) {
            addCriterion("insect_state <", value, "insectState");
            return (Criteria) this;
        }

        public Criteria andInsectStateLessThanOrEqualTo(String value) {
            addCriterion("insect_state <=", value, "insectState");
            return (Criteria) this;
        }

        public Criteria andInsectStateLike(String value) {
            addCriterion("insect_state like", value, "insectState");
            return (Criteria) this;
        }

        public Criteria andInsectStateNotLike(String value) {
            addCriterion("insect_state not like", value, "insectState");
            return (Criteria) this;
        }

        public Criteria andInsectStateIn(List<String> values) {
            addCriterion("insect_state in", values, "insectState");
            return (Criteria) this;
        }

        public Criteria andInsectStateNotIn(List<String> values) {
            addCriterion("insect_state not in", values, "insectState");
            return (Criteria) this;
        }

        public Criteria andInsectStateBetween(String value1, String value2) {
            addCriterion("insect_state between", value1, value2, "insectState");
            return (Criteria) this;
        }

        public Criteria andInsectStateNotBetween(String value1, String value2) {
            addCriterion("insect_state not between", value1, value2, "insectState");
            return (Criteria) this;
        }

        public Criteria andGrassStateIsNull() {
            addCriterion("grass_state is null");
            return (Criteria) this;
        }

        public Criteria andGrassStateIsNotNull() {
            addCriterion("grass_state is not null");
            return (Criteria) this;
        }

        public Criteria andGrassStateEqualTo(String value) {
            addCriterion("grass_state =", value, "grassState");
            return (Criteria) this;
        }

        public Criteria andGrassStateNotEqualTo(String value) {
            addCriterion("grass_state <>", value, "grassState");
            return (Criteria) this;
        }

        public Criteria andGrassStateGreaterThan(String value) {
            addCriterion("grass_state >", value, "grassState");
            return (Criteria) this;
        }

        public Criteria andGrassStateGreaterThanOrEqualTo(String value) {
            addCriterion("grass_state >=", value, "grassState");
            return (Criteria) this;
        }

        public Criteria andGrassStateLessThan(String value) {
            addCriterion("grass_state <", value, "grassState");
            return (Criteria) this;
        }

        public Criteria andGrassStateLessThanOrEqualTo(String value) {
            addCriterion("grass_state <=", value, "grassState");
            return (Criteria) this;
        }

        public Criteria andGrassStateLike(String value) {
            addCriterion("grass_state like", value, "grassState");
            return (Criteria) this;
        }

        public Criteria andGrassStateNotLike(String value) {
            addCriterion("grass_state not like", value, "grassState");
            return (Criteria) this;
        }

        public Criteria andGrassStateIn(List<String> values) {
            addCriterion("grass_state in", values, "grassState");
            return (Criteria) this;
        }

        public Criteria andGrassStateNotIn(List<String> values) {
            addCriterion("grass_state not in", values, "grassState");
            return (Criteria) this;
        }

        public Criteria andGrassStateBetween(String value1, String value2) {
            addCriterion("grass_state between", value1, value2, "grassState");
            return (Criteria) this;
        }

        public Criteria andGrassStateNotBetween(String value1, String value2) {
            addCriterion("grass_state not between", value1, value2, "grassState");
            return (Criteria) this;
        }

        public Criteria andPlantGrowdayIsNull() {
            addCriterion("plant_growday is null");
            return (Criteria) this;
        }

        public Criteria andPlantGrowdayIsNotNull() {
            addCriterion("plant_growday is not null");
            return (Criteria) this;
        }

        public Criteria andPlantGrowdayEqualTo(Integer value) {
            addCriterion("plant_growday =", value, "plantGrowday");
            return (Criteria) this;
        }

        public Criteria andPlantGrowdayNotEqualTo(Integer value) {
            addCriterion("plant_growday <>", value, "plantGrowday");
            return (Criteria) this;
        }

        public Criteria andPlantGrowdayGreaterThan(Integer value) {
            addCriterion("plant_growday >", value, "plantGrowday");
            return (Criteria) this;
        }

        public Criteria andPlantGrowdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_growday >=", value, "plantGrowday");
            return (Criteria) this;
        }

        public Criteria andPlantGrowdayLessThan(Integer value) {
            addCriterion("plant_growday <", value, "plantGrowday");
            return (Criteria) this;
        }

        public Criteria andPlantGrowdayLessThanOrEqualTo(Integer value) {
            addCriterion("plant_growday <=", value, "plantGrowday");
            return (Criteria) this;
        }

        public Criteria andPlantGrowdayIn(List<Integer> values) {
            addCriterion("plant_growday in", values, "plantGrowday");
            return (Criteria) this;
        }

        public Criteria andPlantGrowdayNotIn(List<Integer> values) {
            addCriterion("plant_growday not in", values, "plantGrowday");
            return (Criteria) this;
        }

        public Criteria andPlantGrowdayBetween(Integer value1, Integer value2) {
            addCriterion("plant_growday between", value1, value2, "plantGrowday");
            return (Criteria) this;
        }

        public Criteria andPlantGrowdayNotBetween(Integer value1, Integer value2) {
            addCriterion("plant_growday not between", value1, value2, "plantGrowday");
            return (Criteria) this;
        }

        public Criteria andDiaryImg1IsNull() {
            addCriterion("diary_img1 is null");
            return (Criteria) this;
        }

        public Criteria andDiaryImg1IsNotNull() {
            addCriterion("diary_img1 is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryImg1EqualTo(String value) {
            addCriterion("diary_img1 =", value, "diaryImg1");
            return (Criteria) this;
        }

        public Criteria andDiaryImg1NotEqualTo(String value) {
            addCriterion("diary_img1 <>", value, "diaryImg1");
            return (Criteria) this;
        }

        public Criteria andDiaryImg1GreaterThan(String value) {
            addCriterion("diary_img1 >", value, "diaryImg1");
            return (Criteria) this;
        }

        public Criteria andDiaryImg1GreaterThanOrEqualTo(String value) {
            addCriterion("diary_img1 >=", value, "diaryImg1");
            return (Criteria) this;
        }

        public Criteria andDiaryImg1LessThan(String value) {
            addCriterion("diary_img1 <", value, "diaryImg1");
            return (Criteria) this;
        }

        public Criteria andDiaryImg1LessThanOrEqualTo(String value) {
            addCriterion("diary_img1 <=", value, "diaryImg1");
            return (Criteria) this;
        }

        public Criteria andDiaryImg1Like(String value) {
            addCriterion("diary_img1 like", value, "diaryImg1");
            return (Criteria) this;
        }

        public Criteria andDiaryImg1NotLike(String value) {
            addCriterion("diary_img1 not like", value, "diaryImg1");
            return (Criteria) this;
        }

        public Criteria andDiaryImg1In(List<String> values) {
            addCriterion("diary_img1 in", values, "diaryImg1");
            return (Criteria) this;
        }

        public Criteria andDiaryImg1NotIn(List<String> values) {
            addCriterion("diary_img1 not in", values, "diaryImg1");
            return (Criteria) this;
        }

        public Criteria andDiaryImg1Between(String value1, String value2) {
            addCriterion("diary_img1 between", value1, value2, "diaryImg1");
            return (Criteria) this;
        }

        public Criteria andDiaryImg1NotBetween(String value1, String value2) {
            addCriterion("diary_img1 not between", value1, value2, "diaryImg1");
            return (Criteria) this;
        }

        public Criteria andDiaryImg2IsNull() {
            addCriterion("diary_img2 is null");
            return (Criteria) this;
        }

        public Criteria andDiaryImg2IsNotNull() {
            addCriterion("diary_img2 is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryImg2EqualTo(String value) {
            addCriterion("diary_img2 =", value, "diaryImg2");
            return (Criteria) this;
        }

        public Criteria andDiaryImg2NotEqualTo(String value) {
            addCriterion("diary_img2 <>", value, "diaryImg2");
            return (Criteria) this;
        }

        public Criteria andDiaryImg2GreaterThan(String value) {
            addCriterion("diary_img2 >", value, "diaryImg2");
            return (Criteria) this;
        }

        public Criteria andDiaryImg2GreaterThanOrEqualTo(String value) {
            addCriterion("diary_img2 >=", value, "diaryImg2");
            return (Criteria) this;
        }

        public Criteria andDiaryImg2LessThan(String value) {
            addCriterion("diary_img2 <", value, "diaryImg2");
            return (Criteria) this;
        }

        public Criteria andDiaryImg2LessThanOrEqualTo(String value) {
            addCriterion("diary_img2 <=", value, "diaryImg2");
            return (Criteria) this;
        }

        public Criteria andDiaryImg2Like(String value) {
            addCriterion("diary_img2 like", value, "diaryImg2");
            return (Criteria) this;
        }

        public Criteria andDiaryImg2NotLike(String value) {
            addCriterion("diary_img2 not like", value, "diaryImg2");
            return (Criteria) this;
        }

        public Criteria andDiaryImg2In(List<String> values) {
            addCriterion("diary_img2 in", values, "diaryImg2");
            return (Criteria) this;
        }

        public Criteria andDiaryImg2NotIn(List<String> values) {
            addCriterion("diary_img2 not in", values, "diaryImg2");
            return (Criteria) this;
        }

        public Criteria andDiaryImg2Between(String value1, String value2) {
            addCriterion("diary_img2 between", value1, value2, "diaryImg2");
            return (Criteria) this;
        }

        public Criteria andDiaryImg2NotBetween(String value1, String value2) {
            addCriterion("diary_img2 not between", value1, value2, "diaryImg2");
            return (Criteria) this;
        }

        public Criteria andDiaryImg3IsNull() {
            addCriterion("diary_img3 is null");
            return (Criteria) this;
        }

        public Criteria andDiaryImg3IsNotNull() {
            addCriterion("diary_img3 is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryImg3EqualTo(String value) {
            addCriterion("diary_img3 =", value, "diaryImg3");
            return (Criteria) this;
        }

        public Criteria andDiaryImg3NotEqualTo(String value) {
            addCriterion("diary_img3 <>", value, "diaryImg3");
            return (Criteria) this;
        }

        public Criteria andDiaryImg3GreaterThan(String value) {
            addCriterion("diary_img3 >", value, "diaryImg3");
            return (Criteria) this;
        }

        public Criteria andDiaryImg3GreaterThanOrEqualTo(String value) {
            addCriterion("diary_img3 >=", value, "diaryImg3");
            return (Criteria) this;
        }

        public Criteria andDiaryImg3LessThan(String value) {
            addCriterion("diary_img3 <", value, "diaryImg3");
            return (Criteria) this;
        }

        public Criteria andDiaryImg3LessThanOrEqualTo(String value) {
            addCriterion("diary_img3 <=", value, "diaryImg3");
            return (Criteria) this;
        }

        public Criteria andDiaryImg3Like(String value) {
            addCriterion("diary_img3 like", value, "diaryImg3");
            return (Criteria) this;
        }

        public Criteria andDiaryImg3NotLike(String value) {
            addCriterion("diary_img3 not like", value, "diaryImg3");
            return (Criteria) this;
        }

        public Criteria andDiaryImg3In(List<String> values) {
            addCriterion("diary_img3 in", values, "diaryImg3");
            return (Criteria) this;
        }

        public Criteria andDiaryImg3NotIn(List<String> values) {
            addCriterion("diary_img3 not in", values, "diaryImg3");
            return (Criteria) this;
        }

        public Criteria andDiaryImg3Between(String value1, String value2) {
            addCriterion("diary_img3 between", value1, value2, "diaryImg3");
            return (Criteria) this;
        }

        public Criteria andDiaryImg3NotBetween(String value1, String value2) {
            addCriterion("diary_img3 not between", value1, value2, "diaryImg3");
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