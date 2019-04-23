package com.ncuedu.farm.pojo;

import java.util.ArrayList;
import java.util.List;

public class EssayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EssayExample() {
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

        public Criteria andEssayIdIsNull() {
            addCriterion("essay_id is null");
            return (Criteria) this;
        }

        public Criteria andEssayIdIsNotNull() {
            addCriterion("essay_id is not null");
            return (Criteria) this;
        }

        public Criteria andEssayIdEqualTo(Integer value) {
            addCriterion("essay_id =", value, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdNotEqualTo(Integer value) {
            addCriterion("essay_id <>", value, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdGreaterThan(Integer value) {
            addCriterion("essay_id >", value, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("essay_id >=", value, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdLessThan(Integer value) {
            addCriterion("essay_id <", value, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdLessThanOrEqualTo(Integer value) {
            addCriterion("essay_id <=", value, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdIn(List<Integer> values) {
            addCriterion("essay_id in", values, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdNotIn(List<Integer> values) {
            addCriterion("essay_id not in", values, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdBetween(Integer value1, Integer value2) {
            addCriterion("essay_id between", value1, value2, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("essay_id not between", value1, value2, "essayId");
            return (Criteria) this;
        }

        public Criteria andEssayTitleIsNull() {
            addCriterion("essay_title is null");
            return (Criteria) this;
        }

        public Criteria andEssayTitleIsNotNull() {
            addCriterion("essay_title is not null");
            return (Criteria) this;
        }

        public Criteria andEssayTitleEqualTo(String value) {
            addCriterion("essay_title =", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleNotEqualTo(String value) {
            addCriterion("essay_title <>", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleGreaterThan(String value) {
            addCriterion("essay_title >", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleGreaterThanOrEqualTo(String value) {
            addCriterion("essay_title >=", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleLessThan(String value) {
            addCriterion("essay_title <", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleLessThanOrEqualTo(String value) {
            addCriterion("essay_title <=", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleLike(String value) {
            addCriterion("essay_title like", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleNotLike(String value) {
            addCriterion("essay_title not like", value, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleIn(List<String> values) {
            addCriterion("essay_title in", values, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleNotIn(List<String> values) {
            addCriterion("essay_title not in", values, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleBetween(String value1, String value2) {
            addCriterion("essay_title between", value1, value2, "essayTitle");
            return (Criteria) this;
        }

        public Criteria andEssayTitleNotBetween(String value1, String value2) {
            addCriterion("essay_title not between", value1, value2, "essayTitle");
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

        public Criteria andEssayContentIsNull() {
            addCriterion("essay_content is null");
            return (Criteria) this;
        }

        public Criteria andEssayContentIsNotNull() {
            addCriterion("essay_content is not null");
            return (Criteria) this;
        }

        public Criteria andEssayContentEqualTo(String value) {
            addCriterion("essay_content =", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentNotEqualTo(String value) {
            addCriterion("essay_content <>", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentGreaterThan(String value) {
            addCriterion("essay_content >", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentGreaterThanOrEqualTo(String value) {
            addCriterion("essay_content >=", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentLessThan(String value) {
            addCriterion("essay_content <", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentLessThanOrEqualTo(String value) {
            addCriterion("essay_content <=", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentLike(String value) {
            addCriterion("essay_content like", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentNotLike(String value) {
            addCriterion("essay_content not like", value, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentIn(List<String> values) {
            addCriterion("essay_content in", values, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentNotIn(List<String> values) {
            addCriterion("essay_content not in", values, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentBetween(String value1, String value2) {
            addCriterion("essay_content between", value1, value2, "essayContent");
            return (Criteria) this;
        }

        public Criteria andEssayContentNotBetween(String value1, String value2) {
            addCriterion("essay_content not between", value1, value2, "essayContent");
            return (Criteria) this;
        }

        public Criteria andPraiseNumIsNull() {
            addCriterion("praise_num is null");
            return (Criteria) this;
        }

        public Criteria andPraiseNumIsNotNull() {
            addCriterion("praise_num is not null");
            return (Criteria) this;
        }

        public Criteria andPraiseNumEqualTo(Integer value) {
            addCriterion("praise_num =", value, "praiseNum");
            return (Criteria) this;
        }

        public Criteria andPraiseNumNotEqualTo(Integer value) {
            addCriterion("praise_num <>", value, "praiseNum");
            return (Criteria) this;
        }

        public Criteria andPraiseNumGreaterThan(Integer value) {
            addCriterion("praise_num >", value, "praiseNum");
            return (Criteria) this;
        }

        public Criteria andPraiseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("praise_num >=", value, "praiseNum");
            return (Criteria) this;
        }

        public Criteria andPraiseNumLessThan(Integer value) {
            addCriterion("praise_num <", value, "praiseNum");
            return (Criteria) this;
        }

        public Criteria andPraiseNumLessThanOrEqualTo(Integer value) {
            addCriterion("praise_num <=", value, "praiseNum");
            return (Criteria) this;
        }

        public Criteria andPraiseNumIn(List<Integer> values) {
            addCriterion("praise_num in", values, "praiseNum");
            return (Criteria) this;
        }

        public Criteria andPraiseNumNotIn(List<Integer> values) {
            addCriterion("praise_num not in", values, "praiseNum");
            return (Criteria) this;
        }

        public Criteria andPraiseNumBetween(Integer value1, Integer value2) {
            addCriterion("praise_num between", value1, value2, "praiseNum");
            return (Criteria) this;
        }

        public Criteria andPraiseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("praise_num not between", value1, value2, "praiseNum");
            return (Criteria) this;
        }

        public Criteria andEssayImg1IsNull() {
            addCriterion("essay_img1 is null");
            return (Criteria) this;
        }

        public Criteria andEssayImg1IsNotNull() {
            addCriterion("essay_img1 is not null");
            return (Criteria) this;
        }

        public Criteria andEssayImg1EqualTo(String value) {
            addCriterion("essay_img1 =", value, "essayImg1");
            return (Criteria) this;
        }

        public Criteria andEssayImg1NotEqualTo(String value) {
            addCriterion("essay_img1 <>", value, "essayImg1");
            return (Criteria) this;
        }

        public Criteria andEssayImg1GreaterThan(String value) {
            addCriterion("essay_img1 >", value, "essayImg1");
            return (Criteria) this;
        }

        public Criteria andEssayImg1GreaterThanOrEqualTo(String value) {
            addCriterion("essay_img1 >=", value, "essayImg1");
            return (Criteria) this;
        }

        public Criteria andEssayImg1LessThan(String value) {
            addCriterion("essay_img1 <", value, "essayImg1");
            return (Criteria) this;
        }

        public Criteria andEssayImg1LessThanOrEqualTo(String value) {
            addCriterion("essay_img1 <=", value, "essayImg1");
            return (Criteria) this;
        }

        public Criteria andEssayImg1Like(String value) {
            addCriterion("essay_img1 like", value, "essayImg1");
            return (Criteria) this;
        }

        public Criteria andEssayImg1NotLike(String value) {
            addCriterion("essay_img1 not like", value, "essayImg1");
            return (Criteria) this;
        }

        public Criteria andEssayImg1In(List<String> values) {
            addCriterion("essay_img1 in", values, "essayImg1");
            return (Criteria) this;
        }

        public Criteria andEssayImg1NotIn(List<String> values) {
            addCriterion("essay_img1 not in", values, "essayImg1");
            return (Criteria) this;
        }

        public Criteria andEssayImg1Between(String value1, String value2) {
            addCriterion("essay_img1 between", value1, value2, "essayImg1");
            return (Criteria) this;
        }

        public Criteria andEssayImg1NotBetween(String value1, String value2) {
            addCriterion("essay_img1 not between", value1, value2, "essayImg1");
            return (Criteria) this;
        }

        public Criteria andEssayImg2IsNull() {
            addCriterion("essay_img2 is null");
            return (Criteria) this;
        }

        public Criteria andEssayImg2IsNotNull() {
            addCriterion("essay_img2 is not null");
            return (Criteria) this;
        }

        public Criteria andEssayImg2EqualTo(String value) {
            addCriterion("essay_img2 =", value, "essayImg2");
            return (Criteria) this;
        }

        public Criteria andEssayImg2NotEqualTo(String value) {
            addCriterion("essay_img2 <>", value, "essayImg2");
            return (Criteria) this;
        }

        public Criteria andEssayImg2GreaterThan(String value) {
            addCriterion("essay_img2 >", value, "essayImg2");
            return (Criteria) this;
        }

        public Criteria andEssayImg2GreaterThanOrEqualTo(String value) {
            addCriterion("essay_img2 >=", value, "essayImg2");
            return (Criteria) this;
        }

        public Criteria andEssayImg2LessThan(String value) {
            addCriterion("essay_img2 <", value, "essayImg2");
            return (Criteria) this;
        }

        public Criteria andEssayImg2LessThanOrEqualTo(String value) {
            addCriterion("essay_img2 <=", value, "essayImg2");
            return (Criteria) this;
        }

        public Criteria andEssayImg2Like(String value) {
            addCriterion("essay_img2 like", value, "essayImg2");
            return (Criteria) this;
        }

        public Criteria andEssayImg2NotLike(String value) {
            addCriterion("essay_img2 not like", value, "essayImg2");
            return (Criteria) this;
        }

        public Criteria andEssayImg2In(List<String> values) {
            addCriterion("essay_img2 in", values, "essayImg2");
            return (Criteria) this;
        }

        public Criteria andEssayImg2NotIn(List<String> values) {
            addCriterion("essay_img2 not in", values, "essayImg2");
            return (Criteria) this;
        }

        public Criteria andEssayImg2Between(String value1, String value2) {
            addCriterion("essay_img2 between", value1, value2, "essayImg2");
            return (Criteria) this;
        }

        public Criteria andEssayImg2NotBetween(String value1, String value2) {
            addCriterion("essay_img2 not between", value1, value2, "essayImg2");
            return (Criteria) this;
        }

        public Criteria andEssayImg3IsNull() {
            addCriterion("essay_img3 is null");
            return (Criteria) this;
        }

        public Criteria andEssayImg3IsNotNull() {
            addCriterion("essay_img3 is not null");
            return (Criteria) this;
        }

        public Criteria andEssayImg3EqualTo(String value) {
            addCriterion("essay_img3 =", value, "essayImg3");
            return (Criteria) this;
        }

        public Criteria andEssayImg3NotEqualTo(String value) {
            addCriterion("essay_img3 <>", value, "essayImg3");
            return (Criteria) this;
        }

        public Criteria andEssayImg3GreaterThan(String value) {
            addCriterion("essay_img3 >", value, "essayImg3");
            return (Criteria) this;
        }

        public Criteria andEssayImg3GreaterThanOrEqualTo(String value) {
            addCriterion("essay_img3 >=", value, "essayImg3");
            return (Criteria) this;
        }

        public Criteria andEssayImg3LessThan(String value) {
            addCriterion("essay_img3 <", value, "essayImg3");
            return (Criteria) this;
        }

        public Criteria andEssayImg3LessThanOrEqualTo(String value) {
            addCriterion("essay_img3 <=", value, "essayImg3");
            return (Criteria) this;
        }

        public Criteria andEssayImg3Like(String value) {
            addCriterion("essay_img3 like", value, "essayImg3");
            return (Criteria) this;
        }

        public Criteria andEssayImg3NotLike(String value) {
            addCriterion("essay_img3 not like", value, "essayImg3");
            return (Criteria) this;
        }

        public Criteria andEssayImg3In(List<String> values) {
            addCriterion("essay_img3 in", values, "essayImg3");
            return (Criteria) this;
        }

        public Criteria andEssayImg3NotIn(List<String> values) {
            addCriterion("essay_img3 not in", values, "essayImg3");
            return (Criteria) this;
        }

        public Criteria andEssayImg3Between(String value1, String value2) {
            addCriterion("essay_img3 between", value1, value2, "essayImg3");
            return (Criteria) this;
        }

        public Criteria andEssayImg3NotBetween(String value1, String value2) {
            addCriterion("essay_img3 not between", value1, value2, "essayImg3");
            return (Criteria) this;
        }

        public Criteria andEssayImg4IsNull() {
            addCriterion("essay_img4 is null");
            return (Criteria) this;
        }

        public Criteria andEssayImg4IsNotNull() {
            addCriterion("essay_img4 is not null");
            return (Criteria) this;
        }

        public Criteria andEssayImg4EqualTo(String value) {
            addCriterion("essay_img4 =", value, "essayImg4");
            return (Criteria) this;
        }

        public Criteria andEssayImg4NotEqualTo(String value) {
            addCriterion("essay_img4 <>", value, "essayImg4");
            return (Criteria) this;
        }

        public Criteria andEssayImg4GreaterThan(String value) {
            addCriterion("essay_img4 >", value, "essayImg4");
            return (Criteria) this;
        }

        public Criteria andEssayImg4GreaterThanOrEqualTo(String value) {
            addCriterion("essay_img4 >=", value, "essayImg4");
            return (Criteria) this;
        }

        public Criteria andEssayImg4LessThan(String value) {
            addCriterion("essay_img4 <", value, "essayImg4");
            return (Criteria) this;
        }

        public Criteria andEssayImg4LessThanOrEqualTo(String value) {
            addCriterion("essay_img4 <=", value, "essayImg4");
            return (Criteria) this;
        }

        public Criteria andEssayImg4Like(String value) {
            addCriterion("essay_img4 like", value, "essayImg4");
            return (Criteria) this;
        }

        public Criteria andEssayImg4NotLike(String value) {
            addCriterion("essay_img4 not like", value, "essayImg4");
            return (Criteria) this;
        }

        public Criteria andEssayImg4In(List<String> values) {
            addCriterion("essay_img4 in", values, "essayImg4");
            return (Criteria) this;
        }

        public Criteria andEssayImg4NotIn(List<String> values) {
            addCriterion("essay_img4 not in", values, "essayImg4");
            return (Criteria) this;
        }

        public Criteria andEssayImg4Between(String value1, String value2) {
            addCriterion("essay_img4 between", value1, value2, "essayImg4");
            return (Criteria) this;
        }

        public Criteria andEssayImg4NotBetween(String value1, String value2) {
            addCriterion("essay_img4 not between", value1, value2, "essayImg4");
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