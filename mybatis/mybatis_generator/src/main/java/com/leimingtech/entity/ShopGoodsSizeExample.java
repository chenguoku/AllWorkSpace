package com.leimingtech.entity;

import java.util.ArrayList;
import java.util.List;

public class ShopGoodsSizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopGoodsSizeExample() {
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

        public Criteria andJpSizeIdIsNull() {
            addCriterion("JP_SIZE_ID is null");
            return (Criteria) this;
        }

        public Criteria andJpSizeIdIsNotNull() {
            addCriterion("JP_SIZE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJpSizeIdEqualTo(Integer value) {
            addCriterion("JP_SIZE_ID =", value, "jpSizeId");
            return (Criteria) this;
        }

        public Criteria andJpSizeIdNotEqualTo(Integer value) {
            addCriterion("JP_SIZE_ID <>", value, "jpSizeId");
            return (Criteria) this;
        }

        public Criteria andJpSizeIdGreaterThan(Integer value) {
            addCriterion("JP_SIZE_ID >", value, "jpSizeId");
            return (Criteria) this;
        }

        public Criteria andJpSizeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("JP_SIZE_ID >=", value, "jpSizeId");
            return (Criteria) this;
        }

        public Criteria andJpSizeIdLessThan(Integer value) {
            addCriterion("JP_SIZE_ID <", value, "jpSizeId");
            return (Criteria) this;
        }

        public Criteria andJpSizeIdLessThanOrEqualTo(Integer value) {
            addCriterion("JP_SIZE_ID <=", value, "jpSizeId");
            return (Criteria) this;
        }

        public Criteria andJpSizeIdIn(List<Integer> values) {
            addCriterion("JP_SIZE_ID in", values, "jpSizeId");
            return (Criteria) this;
        }

        public Criteria andJpSizeIdNotIn(List<Integer> values) {
            addCriterion("JP_SIZE_ID not in", values, "jpSizeId");
            return (Criteria) this;
        }

        public Criteria andJpSizeIdBetween(Integer value1, Integer value2) {
            addCriterion("JP_SIZE_ID between", value1, value2, "jpSizeId");
            return (Criteria) this;
        }

        public Criteria andJpSizeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("JP_SIZE_ID not between", value1, value2, "jpSizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdIsNull() {
            addCriterion("SIZE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSizeIdIsNotNull() {
            addCriterion("SIZE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSizeIdEqualTo(Integer value) {
            addCriterion("SIZE_ID =", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotEqualTo(Integer value) {
            addCriterion("SIZE_ID <>", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdGreaterThan(Integer value) {
            addCriterion("SIZE_ID >", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIZE_ID >=", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdLessThan(Integer value) {
            addCriterion("SIZE_ID <", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdLessThanOrEqualTo(Integer value) {
            addCriterion("SIZE_ID <=", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdIn(List<Integer> values) {
            addCriterion("SIZE_ID in", values, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotIn(List<Integer> values) {
            addCriterion("SIZE_ID not in", values, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdBetween(Integer value1, Integer value2) {
            addCriterion("SIZE_ID between", value1, value2, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SIZE_ID not between", value1, value2, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeNameIsNull() {
            addCriterion("SIZE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSizeNameIsNotNull() {
            addCriterion("SIZE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSizeNameEqualTo(String value) {
            addCriterion("SIZE_NAME =", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotEqualTo(String value) {
            addCriterion("SIZE_NAME <>", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameGreaterThan(String value) {
            addCriterion("SIZE_NAME >", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("SIZE_NAME >=", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLessThan(String value) {
            addCriterion("SIZE_NAME <", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLessThanOrEqualTo(String value) {
            addCriterion("SIZE_NAME <=", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLike(String value) {
            addCriterion("SIZE_NAME like", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotLike(String value) {
            addCriterion("SIZE_NAME not like", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameIn(List<String> values) {
            addCriterion("SIZE_NAME in", values, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotIn(List<String> values) {
            addCriterion("SIZE_NAME not in", values, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameBetween(String value1, String value2) {
            addCriterion("SIZE_NAME between", value1, value2, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotBetween(String value1, String value2) {
            addCriterion("SIZE_NAME not between", value1, value2, "sizeName");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("GOODS_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("GOODS_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("GOODS_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODS_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("GOODS_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("GOODS_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("GOODS_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("GOODS_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andJpSizeNameIsNull() {
            addCriterion("JP_SIZE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andJpSizeNameIsNotNull() {
            addCriterion("JP_SIZE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andJpSizeNameEqualTo(String value) {
            addCriterion("JP_SIZE_NAME =", value, "jpSizeName");
            return (Criteria) this;
        }

        public Criteria andJpSizeNameNotEqualTo(String value) {
            addCriterion("JP_SIZE_NAME <>", value, "jpSizeName");
            return (Criteria) this;
        }

        public Criteria andJpSizeNameGreaterThan(String value) {
            addCriterion("JP_SIZE_NAME >", value, "jpSizeName");
            return (Criteria) this;
        }

        public Criteria andJpSizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("JP_SIZE_NAME >=", value, "jpSizeName");
            return (Criteria) this;
        }

        public Criteria andJpSizeNameLessThan(String value) {
            addCriterion("JP_SIZE_NAME <", value, "jpSizeName");
            return (Criteria) this;
        }

        public Criteria andJpSizeNameLessThanOrEqualTo(String value) {
            addCriterion("JP_SIZE_NAME <=", value, "jpSizeName");
            return (Criteria) this;
        }

        public Criteria andJpSizeNameLike(String value) {
            addCriterion("JP_SIZE_NAME like", value, "jpSizeName");
            return (Criteria) this;
        }

        public Criteria andJpSizeNameNotLike(String value) {
            addCriterion("JP_SIZE_NAME not like", value, "jpSizeName");
            return (Criteria) this;
        }

        public Criteria andJpSizeNameIn(List<String> values) {
            addCriterion("JP_SIZE_NAME in", values, "jpSizeName");
            return (Criteria) this;
        }

        public Criteria andJpSizeNameNotIn(List<String> values) {
            addCriterion("JP_SIZE_NAME not in", values, "jpSizeName");
            return (Criteria) this;
        }

        public Criteria andJpSizeNameBetween(String value1, String value2) {
            addCriterion("JP_SIZE_NAME between", value1, value2, "jpSizeName");
            return (Criteria) this;
        }

        public Criteria andJpSizeNameNotBetween(String value1, String value2) {
            addCriterion("JP_SIZE_NAME not between", value1, value2, "jpSizeName");
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