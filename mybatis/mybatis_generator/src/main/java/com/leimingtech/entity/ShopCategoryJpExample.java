package com.leimingtech.entity;

import java.util.ArrayList;
import java.util.List;

public class ShopCategoryJpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopCategoryJpExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIsNull() {
            addCriterion("PARENT_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIsNotNull() {
            addCriterion("PARENT_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdEqualTo(Integer value) {
            addCriterion("PARENT_CATEGORY_ID =", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotEqualTo(Integer value) {
            addCriterion("PARENT_CATEGORY_ID <>", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdGreaterThan(Integer value) {
            addCriterion("PARENT_CATEGORY_ID >", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_CATEGORY_ID >=", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLessThan(Integer value) {
            addCriterion("PARENT_CATEGORY_ID <", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_CATEGORY_ID <=", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIn(List<Integer> values) {
            addCriterion("PARENT_CATEGORY_ID in", values, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotIn(List<Integer> values) {
            addCriterion("PARENT_CATEGORY_ID not in", values, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_CATEGORY_ID between", value1, value2, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_CATEGORY_ID not between", value1, value2, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNull() {
            addCriterion("SORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNotNull() {
            addCriterion("SORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSortIdEqualTo(Integer value) {
            addCriterion("SORT_ID =", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotEqualTo(Integer value) {
            addCriterion("SORT_ID <>", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThan(Integer value) {
            addCriterion("SORT_ID >", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORT_ID >=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThan(Integer value) {
            addCriterion("SORT_ID <", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThanOrEqualTo(Integer value) {
            addCriterion("SORT_ID <=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdIn(List<Integer> values) {
            addCriterion("SORT_ID in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotIn(List<Integer> values) {
            addCriterion("SORT_ID not in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdBetween(Integer value1, Integer value2) {
            addCriterion("SORT_ID between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SORT_ID not between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andGlobalNameIsNull() {
            addCriterion("GLOBAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGlobalNameIsNotNull() {
            addCriterion("GLOBAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalNameEqualTo(String value) {
            addCriterion("GLOBAL_NAME =", value, "globalName");
            return (Criteria) this;
        }

        public Criteria andGlobalNameNotEqualTo(String value) {
            addCriterion("GLOBAL_NAME <>", value, "globalName");
            return (Criteria) this;
        }

        public Criteria andGlobalNameGreaterThan(String value) {
            addCriterion("GLOBAL_NAME >", value, "globalName");
            return (Criteria) this;
        }

        public Criteria andGlobalNameGreaterThanOrEqualTo(String value) {
            addCriterion("GLOBAL_NAME >=", value, "globalName");
            return (Criteria) this;
        }

        public Criteria andGlobalNameLessThan(String value) {
            addCriterion("GLOBAL_NAME <", value, "globalName");
            return (Criteria) this;
        }

        public Criteria andGlobalNameLessThanOrEqualTo(String value) {
            addCriterion("GLOBAL_NAME <=", value, "globalName");
            return (Criteria) this;
        }

        public Criteria andGlobalNameLike(String value) {
            addCriterion("GLOBAL_NAME like", value, "globalName");
            return (Criteria) this;
        }

        public Criteria andGlobalNameNotLike(String value) {
            addCriterion("GLOBAL_NAME not like", value, "globalName");
            return (Criteria) this;
        }

        public Criteria andGlobalNameIn(List<String> values) {
            addCriterion("GLOBAL_NAME in", values, "globalName");
            return (Criteria) this;
        }

        public Criteria andGlobalNameNotIn(List<String> values) {
            addCriterion("GLOBAL_NAME not in", values, "globalName");
            return (Criteria) this;
        }

        public Criteria andGlobalNameBetween(String value1, String value2) {
            addCriterion("GLOBAL_NAME between", value1, value2, "globalName");
            return (Criteria) this;
        }

        public Criteria andGlobalNameNotBetween(String value1, String value2) {
            addCriterion("GLOBAL_NAME not between", value1, value2, "globalName");
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