package com.leimingtech.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopCartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopCartExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("STORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("STORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("STORE_ID =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("STORE_ID <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("STORE_ID >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STORE_ID >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("STORE_ID <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("STORE_ID <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("STORE_ID in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("STORE_ID not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("STORE_ID between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STORE_ID not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("STORE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("STORE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("STORE_NAME =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("STORE_NAME <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("STORE_NAME >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_NAME >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("STORE_NAME <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("STORE_NAME <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("STORE_NAME like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("STORE_NAME not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("STORE_NAME in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("STORE_NAME not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("STORE_NAME between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("STORE_NAME not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andGoodsCsIdIsNull() {
            addCriterion("GOODS_CS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCsIdIsNotNull() {
            addCriterion("GOODS_CS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCsIdEqualTo(Integer value) {
            addCriterion("GOODS_CS_ID =", value, "goodsCsId");
            return (Criteria) this;
        }

        public Criteria andGoodsCsIdNotEqualTo(Integer value) {
            addCriterion("GOODS_CS_ID <>", value, "goodsCsId");
            return (Criteria) this;
        }

        public Criteria andGoodsCsIdGreaterThan(Integer value) {
            addCriterion("GOODS_CS_ID >", value, "goodsCsId");
            return (Criteria) this;
        }

        public Criteria andGoodsCsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODS_CS_ID >=", value, "goodsCsId");
            return (Criteria) this;
        }

        public Criteria andGoodsCsIdLessThan(Integer value) {
            addCriterion("GOODS_CS_ID <", value, "goodsCsId");
            return (Criteria) this;
        }

        public Criteria andGoodsCsIdLessThanOrEqualTo(Integer value) {
            addCriterion("GOODS_CS_ID <=", value, "goodsCsId");
            return (Criteria) this;
        }

        public Criteria andGoodsCsIdIn(List<Integer> values) {
            addCriterion("GOODS_CS_ID in", values, "goodsCsId");
            return (Criteria) this;
        }

        public Criteria andGoodsCsIdNotIn(List<Integer> values) {
            addCriterion("GOODS_CS_ID not in", values, "goodsCsId");
            return (Criteria) this;
        }

        public Criteria andGoodsCsIdBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_CS_ID between", value1, value2, "goodsCsId");
            return (Criteria) this;
        }

        public Criteria andGoodsCsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_CS_ID not between", value1, value2, "goodsCsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("GOODS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("GOODS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("GOODS_NAME =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("GOODS_NAME <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("GOODS_NAME >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("GOODS_NAME <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("GOODS_NAME like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("GOODS_NAME not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("GOODS_NAME in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("GOODS_NAME not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("GOODS_NAME between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("GOODS_NAME not between", value1, value2, "goodsName");
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

        public Criteria andColorIdIsNull() {
            addCriterion("COLOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andColorIdIsNotNull() {
            addCriterion("COLOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andColorIdEqualTo(Integer value) {
            addCriterion("COLOR_ID =", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotEqualTo(Integer value) {
            addCriterion("COLOR_ID <>", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThan(Integer value) {
            addCriterion("COLOR_ID >", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COLOR_ID >=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThan(Integer value) {
            addCriterion("COLOR_ID <", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThanOrEqualTo(Integer value) {
            addCriterion("COLOR_ID <=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdIn(List<Integer> values) {
            addCriterion("COLOR_ID in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotIn(List<Integer> values) {
            addCriterion("COLOR_ID not in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdBetween(Integer value1, Integer value2) {
            addCriterion("COLOR_ID between", value1, value2, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COLOR_ID not between", value1, value2, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorNameIsNull() {
            addCriterion("COLOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andColorNameIsNotNull() {
            addCriterion("COLOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andColorNameEqualTo(String value) {
            addCriterion("COLOR_NAME =", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotEqualTo(String value) {
            addCriterion("COLOR_NAME <>", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameGreaterThan(String value) {
            addCriterion("COLOR_NAME >", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR_NAME >=", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLessThan(String value) {
            addCriterion("COLOR_NAME <", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLessThanOrEqualTo(String value) {
            addCriterion("COLOR_NAME <=", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLike(String value) {
            addCriterion("COLOR_NAME like", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotLike(String value) {
            addCriterion("COLOR_NAME not like", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameIn(List<String> values) {
            addCriterion("COLOR_NAME in", values, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotIn(List<String> values) {
            addCriterion("COLOR_NAME not in", values, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameBetween(String value1, String value2) {
            addCriterion("COLOR_NAME between", value1, value2, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotBetween(String value1, String value2) {
            addCriterion("COLOR_NAME not between", value1, value2, "colorName");
            return (Criteria) this;
        }

        public Criteria andGoodsStorePriceIsNull() {
            addCriterion("GOODS_STORE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStorePriceIsNotNull() {
            addCriterion("GOODS_STORE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStorePriceEqualTo(BigDecimal value) {
            addCriterion("GOODS_STORE_PRICE =", value, "goodsStorePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStorePriceNotEqualTo(BigDecimal value) {
            addCriterion("GOODS_STORE_PRICE <>", value, "goodsStorePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStorePriceGreaterThan(BigDecimal value) {
            addCriterion("GOODS_STORE_PRICE >", value, "goodsStorePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStorePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_STORE_PRICE >=", value, "goodsStorePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStorePriceLessThan(BigDecimal value) {
            addCriterion("GOODS_STORE_PRICE <", value, "goodsStorePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStorePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_STORE_PRICE <=", value, "goodsStorePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStorePriceIn(List<BigDecimal> values) {
            addCriterion("GOODS_STORE_PRICE in", values, "goodsStorePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStorePriceNotIn(List<BigDecimal> values) {
            addCriterion("GOODS_STORE_PRICE not in", values, "goodsStorePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStorePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_STORE_PRICE between", value1, value2, "goodsStorePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStorePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_STORE_PRICE not between", value1, value2, "goodsStorePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNull() {
            addCriterion("GOODS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNotNull() {
            addCriterion("GOODS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumEqualTo(String value) {
            addCriterion("GOODS_NUM =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(String value) {
            addCriterion("GOODS_NUM <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(String value) {
            addCriterion("GOODS_NUM >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NUM >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(String value) {
            addCriterion("GOODS_NUM <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NUM <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLike(String value) {
            addCriterion("GOODS_NUM like", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotLike(String value) {
            addCriterion("GOODS_NUM not like", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<String> values) {
            addCriterion("GOODS_NUM in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<String> values) {
            addCriterion("GOODS_NUM not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(String value1, String value2) {
            addCriterion("GOODS_NUM between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(String value1, String value2) {
            addCriterion("GOODS_NUM not between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesIsNull() {
            addCriterion("GOODS_IMAGES is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesIsNotNull() {
            addCriterion("GOODS_IMAGES is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesEqualTo(String value) {
            addCriterion("GOODS_IMAGES =", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesNotEqualTo(String value) {
            addCriterion("GOODS_IMAGES <>", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesGreaterThan(String value) {
            addCriterion("GOODS_IMAGES >", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_IMAGES >=", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesLessThan(String value) {
            addCriterion("GOODS_IMAGES <", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesLessThanOrEqualTo(String value) {
            addCriterion("GOODS_IMAGES <=", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesLike(String value) {
            addCriterion("GOODS_IMAGES like", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesNotLike(String value) {
            addCriterion("GOODS_IMAGES not like", value, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesIn(List<String> values) {
            addCriterion("GOODS_IMAGES in", values, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesNotIn(List<String> values) {
            addCriterion("GOODS_IMAGES not in", values, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesBetween(String value1, String value2) {
            addCriterion("GOODS_IMAGES between", value1, value2, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andGoodsImagesNotBetween(String value1, String value2) {
            addCriterion("GOODS_IMAGES not between", value1, value2, "goodsImages");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("IS_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("IS_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(Integer value) {
            addCriterion("IS_CHECK =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(Integer value) {
            addCriterion("IS_CHECK <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(Integer value) {
            addCriterion("IS_CHECK >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_CHECK >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(Integer value) {
            addCriterion("IS_CHECK <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(Integer value) {
            addCriterion("IS_CHECK <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<Integer> values) {
            addCriterion("IS_CHECK in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<Integer> values) {
            addCriterion("IS_CHECK not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(Integer value1, Integer value2) {
            addCriterion("IS_CHECK between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_CHECK not between", value1, value2, "isCheck");
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