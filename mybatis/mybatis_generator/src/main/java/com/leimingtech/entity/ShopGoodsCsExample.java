package com.leimingtech.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopGoodsCsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopGoodsCsExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andGoodsCsPartNumberIsNull() {
            addCriterion("GOODS_CS_PART_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCsPartNumberIsNotNull() {
            addCriterion("GOODS_CS_PART_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCsPartNumberEqualTo(Integer value) {
            addCriterion("GOODS_CS_PART_NUMBER =", value, "goodsCsPartNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCsPartNumberNotEqualTo(Integer value) {
            addCriterion("GOODS_CS_PART_NUMBER <>", value, "goodsCsPartNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCsPartNumberGreaterThan(Integer value) {
            addCriterion("GOODS_CS_PART_NUMBER >", value, "goodsCsPartNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCsPartNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODS_CS_PART_NUMBER >=", value, "goodsCsPartNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCsPartNumberLessThan(Integer value) {
            addCriterion("GOODS_CS_PART_NUMBER <", value, "goodsCsPartNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCsPartNumberLessThanOrEqualTo(Integer value) {
            addCriterion("GOODS_CS_PART_NUMBER <=", value, "goodsCsPartNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCsPartNumberIn(List<Integer> values) {
            addCriterion("GOODS_CS_PART_NUMBER in", values, "goodsCsPartNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCsPartNumberNotIn(List<Integer> values) {
            addCriterion("GOODS_CS_PART_NUMBER not in", values, "goodsCsPartNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCsPartNumberBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_CS_PART_NUMBER between", value1, value2, "goodsCsPartNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCsPartNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_CS_PART_NUMBER not between", value1, value2, "goodsCsPartNumber");
            return (Criteria) this;
        }

        public Criteria andSellTypeIsNull() {
            addCriterion("SELL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSellTypeIsNotNull() {
            addCriterion("SELL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSellTypeEqualTo(String value) {
            addCriterion("SELL_TYPE =", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeNotEqualTo(String value) {
            addCriterion("SELL_TYPE <>", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeGreaterThan(String value) {
            addCriterion("SELL_TYPE >", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SELL_TYPE >=", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeLessThan(String value) {
            addCriterion("SELL_TYPE <", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeLessThanOrEqualTo(String value) {
            addCriterion("SELL_TYPE <=", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeLike(String value) {
            addCriterion("SELL_TYPE like", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeNotLike(String value) {
            addCriterion("SELL_TYPE not like", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeIn(List<String> values) {
            addCriterion("SELL_TYPE in", values, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeNotIn(List<String> values) {
            addCriterion("SELL_TYPE not in", values, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeBetween(String value1, String value2) {
            addCriterion("SELL_TYPE between", value1, value2, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeNotBetween(String value1, String value2) {
            addCriterion("SELL_TYPE not between", value1, value2, "sellType");
            return (Criteria) this;
        }

        public Criteria andIsNewArrivalIsNull() {
            addCriterion("IS_NEW_ARRIVAL is null");
            return (Criteria) this;
        }

        public Criteria andIsNewArrivalIsNotNull() {
            addCriterion("IS_NEW_ARRIVAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewArrivalEqualTo(Boolean value) {
            addCriterion("IS_NEW_ARRIVAL =", value, "isNewArrival");
            return (Criteria) this;
        }

        public Criteria andIsNewArrivalNotEqualTo(Boolean value) {
            addCriterion("IS_NEW_ARRIVAL <>", value, "isNewArrival");
            return (Criteria) this;
        }

        public Criteria andIsNewArrivalGreaterThan(Boolean value) {
            addCriterion("IS_NEW_ARRIVAL >", value, "isNewArrival");
            return (Criteria) this;
        }

        public Criteria andIsNewArrivalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_NEW_ARRIVAL >=", value, "isNewArrival");
            return (Criteria) this;
        }

        public Criteria andIsNewArrivalLessThan(Boolean value) {
            addCriterion("IS_NEW_ARRIVAL <", value, "isNewArrival");
            return (Criteria) this;
        }

        public Criteria andIsNewArrivalLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_NEW_ARRIVAL <=", value, "isNewArrival");
            return (Criteria) this;
        }

        public Criteria andIsNewArrivalIn(List<Boolean> values) {
            addCriterion("IS_NEW_ARRIVAL in", values, "isNewArrival");
            return (Criteria) this;
        }

        public Criteria andIsNewArrivalNotIn(List<Boolean> values) {
            addCriterion("IS_NEW_ARRIVAL not in", values, "isNewArrival");
            return (Criteria) this;
        }

        public Criteria andIsNewArrivalBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_NEW_ARRIVAL between", value1, value2, "isNewArrival");
            return (Criteria) this;
        }

        public Criteria andIsNewArrivalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_NEW_ARRIVAL not between", value1, value2, "isNewArrival");
            return (Criteria) this;
        }

        public Criteria andIsMainIsNull() {
            addCriterion("IS_MAIN is null");
            return (Criteria) this;
        }

        public Criteria andIsMainIsNotNull() {
            addCriterion("IS_MAIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsMainEqualTo(Boolean value) {
            addCriterion("IS_MAIN =", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainNotEqualTo(Boolean value) {
            addCriterion("IS_MAIN <>", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainGreaterThan(Boolean value) {
            addCriterion("IS_MAIN >", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_MAIN >=", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainLessThan(Boolean value) {
            addCriterion("IS_MAIN <", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_MAIN <=", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainIn(List<Boolean> values) {
            addCriterion("IS_MAIN in", values, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainNotIn(List<Boolean> values) {
            addCriterion("IS_MAIN not in", values, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_MAIN between", value1, value2, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_MAIN not between", value1, value2, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsSubIsNull() {
            addCriterion("IS_SUB is null");
            return (Criteria) this;
        }

        public Criteria andIsSubIsNotNull() {
            addCriterion("IS_SUB is not null");
            return (Criteria) this;
        }

        public Criteria andIsSubEqualTo(Boolean value) {
            addCriterion("IS_SUB =", value, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubNotEqualTo(Boolean value) {
            addCriterion("IS_SUB <>", value, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubGreaterThan(Boolean value) {
            addCriterion("IS_SUB >", value, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_SUB >=", value, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubLessThan(Boolean value) {
            addCriterion("IS_SUB <", value, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_SUB <=", value, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubIn(List<Boolean> values) {
            addCriterion("IS_SUB in", values, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubNotIn(List<Boolean> values) {
            addCriterion("IS_SUB not in", values, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_SUB between", value1, value2, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_SUB not between", value1, value2, "isSub");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNull() {
            addCriterion("PRICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNotNull() {
            addCriterion("PRICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeEqualTo(String value) {
            addCriterion("PRICE_TYPE =", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotEqualTo(String value) {
            addCriterion("PRICE_TYPE <>", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThan(String value) {
            addCriterion("PRICE_TYPE >", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_TYPE >=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThan(String value) {
            addCriterion("PRICE_TYPE <", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThanOrEqualTo(String value) {
            addCriterion("PRICE_TYPE <=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLike(String value) {
            addCriterion("PRICE_TYPE like", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotLike(String value) {
            addCriterion("PRICE_TYPE not like", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIn(List<String> values) {
            addCriterion("PRICE_TYPE in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotIn(List<String> values) {
            addCriterion("PRICE_TYPE not in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeBetween(String value1, String value2) {
            addCriterion("PRICE_TYPE between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotBetween(String value1, String value2) {
            addCriterion("PRICE_TYPE not between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andProperPriceIsNull() {
            addCriterion("PROPER_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andProperPriceIsNotNull() {
            addCriterion("PROPER_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProperPriceEqualTo(BigDecimal value) {
            addCriterion("PROPER_PRICE =", value, "properPrice");
            return (Criteria) this;
        }

        public Criteria andProperPriceNotEqualTo(BigDecimal value) {
            addCriterion("PROPER_PRICE <>", value, "properPrice");
            return (Criteria) this;
        }

        public Criteria andProperPriceGreaterThan(BigDecimal value) {
            addCriterion("PROPER_PRICE >", value, "properPrice");
            return (Criteria) this;
        }

        public Criteria andProperPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROPER_PRICE >=", value, "properPrice");
            return (Criteria) this;
        }

        public Criteria andProperPriceLessThan(BigDecimal value) {
            addCriterion("PROPER_PRICE <", value, "properPrice");
            return (Criteria) this;
        }

        public Criteria andProperPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROPER_PRICE <=", value, "properPrice");
            return (Criteria) this;
        }

        public Criteria andProperPriceIn(List<BigDecimal> values) {
            addCriterion("PROPER_PRICE in", values, "properPrice");
            return (Criteria) this;
        }

        public Criteria andProperPriceNotIn(List<BigDecimal> values) {
            addCriterion("PROPER_PRICE not in", values, "properPrice");
            return (Criteria) this;
        }

        public Criteria andProperPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROPER_PRICE between", value1, value2, "properPrice");
            return (Criteria) this;
        }

        public Criteria andProperPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROPER_PRICE not between", value1, value2, "properPrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("SALE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("SALE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(BigDecimal value) {
            addCriterion("SALE_PRICE =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(BigDecimal value) {
            addCriterion("SALE_PRICE <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(BigDecimal value) {
            addCriterion("SALE_PRICE >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_PRICE >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(BigDecimal value) {
            addCriterion("SALE_PRICE <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_PRICE <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<BigDecimal> values) {
            addCriterion("SALE_PRICE in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<BigDecimal> values) {
            addCriterion("SALE_PRICE not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_PRICE between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_PRICE not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("DISCOUNT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("DISCOUNT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_PRICE =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_PRICE <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT_PRICE >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_PRICE >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(BigDecimal value) {
            addCriterion("DISCOUNT_PRICE <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_PRICE <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_PRICE in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_PRICE not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_PRICE between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_PRICE not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andZozoPriceIsNull() {
            addCriterion("ZOZO_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andZozoPriceIsNotNull() {
            addCriterion("ZOZO_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andZozoPriceEqualTo(BigDecimal value) {
            addCriterion("ZOZO_PRICE =", value, "zozoPrice");
            return (Criteria) this;
        }

        public Criteria andZozoPriceNotEqualTo(BigDecimal value) {
            addCriterion("ZOZO_PRICE <>", value, "zozoPrice");
            return (Criteria) this;
        }

        public Criteria andZozoPriceGreaterThan(BigDecimal value) {
            addCriterion("ZOZO_PRICE >", value, "zozoPrice");
            return (Criteria) this;
        }

        public Criteria andZozoPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZOZO_PRICE >=", value, "zozoPrice");
            return (Criteria) this;
        }

        public Criteria andZozoPriceLessThan(BigDecimal value) {
            addCriterion("ZOZO_PRICE <", value, "zozoPrice");
            return (Criteria) this;
        }

        public Criteria andZozoPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZOZO_PRICE <=", value, "zozoPrice");
            return (Criteria) this;
        }

        public Criteria andZozoPriceIn(List<BigDecimal> values) {
            addCriterion("ZOZO_PRICE in", values, "zozoPrice");
            return (Criteria) this;
        }

        public Criteria andZozoPriceNotIn(List<BigDecimal> values) {
            addCriterion("ZOZO_PRICE not in", values, "zozoPrice");
            return (Criteria) this;
        }

        public Criteria andZozoPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZOZO_PRICE between", value1, value2, "zozoPrice");
            return (Criteria) this;
        }

        public Criteria andZozoPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZOZO_PRICE not between", value1, value2, "zozoPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceIsNull() {
            addCriterion("REAL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andRealPriceIsNotNull() {
            addCriterion("REAL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andRealPriceEqualTo(BigDecimal value) {
            addCriterion("REAL_PRICE =", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotEqualTo(BigDecimal value) {
            addCriterion("REAL_PRICE <>", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceGreaterThan(BigDecimal value) {
            addCriterion("REAL_PRICE >", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_PRICE >=", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceLessThan(BigDecimal value) {
            addCriterion("REAL_PRICE <", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_PRICE <=", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceIn(List<BigDecimal> values) {
            addCriterion("REAL_PRICE in", values, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotIn(List<BigDecimal> values) {
            addCriterion("REAL_PRICE not in", values, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_PRICE between", value1, value2, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_PRICE not between", value1, value2, "realPrice");
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

        public Criteria andColorCategoryIdIsNull() {
            addCriterion("COLOR_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andColorCategoryIdIsNotNull() {
            addCriterion("COLOR_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andColorCategoryIdEqualTo(Integer value) {
            addCriterion("COLOR_CATEGORY_ID =", value, "colorCategoryId");
            return (Criteria) this;
        }

        public Criteria andColorCategoryIdNotEqualTo(Integer value) {
            addCriterion("COLOR_CATEGORY_ID <>", value, "colorCategoryId");
            return (Criteria) this;
        }

        public Criteria andColorCategoryIdGreaterThan(Integer value) {
            addCriterion("COLOR_CATEGORY_ID >", value, "colorCategoryId");
            return (Criteria) this;
        }

        public Criteria andColorCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COLOR_CATEGORY_ID >=", value, "colorCategoryId");
            return (Criteria) this;
        }

        public Criteria andColorCategoryIdLessThan(Integer value) {
            addCriterion("COLOR_CATEGORY_ID <", value, "colorCategoryId");
            return (Criteria) this;
        }

        public Criteria andColorCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("COLOR_CATEGORY_ID <=", value, "colorCategoryId");
            return (Criteria) this;
        }

        public Criteria andColorCategoryIdIn(List<Integer> values) {
            addCriterion("COLOR_CATEGORY_ID in", values, "colorCategoryId");
            return (Criteria) this;
        }

        public Criteria andColorCategoryIdNotIn(List<Integer> values) {
            addCriterion("COLOR_CATEGORY_ID not in", values, "colorCategoryId");
            return (Criteria) this;
        }

        public Criteria andColorCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("COLOR_CATEGORY_ID between", value1, value2, "colorCategoryId");
            return (Criteria) this;
        }

        public Criteria andColorCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COLOR_CATEGORY_ID not between", value1, value2, "colorCategoryId");
            return (Criteria) this;
        }

        public Criteria andColorCategoryNameIsNull() {
            addCriterion("COLOR_CATEGORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andColorCategoryNameIsNotNull() {
            addCriterion("COLOR_CATEGORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andColorCategoryNameEqualTo(String value) {
            addCriterion("COLOR_CATEGORY_NAME =", value, "colorCategoryName");
            return (Criteria) this;
        }

        public Criteria andColorCategoryNameNotEqualTo(String value) {
            addCriterion("COLOR_CATEGORY_NAME <>", value, "colorCategoryName");
            return (Criteria) this;
        }

        public Criteria andColorCategoryNameGreaterThan(String value) {
            addCriterion("COLOR_CATEGORY_NAME >", value, "colorCategoryName");
            return (Criteria) this;
        }

        public Criteria andColorCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR_CATEGORY_NAME >=", value, "colorCategoryName");
            return (Criteria) this;
        }

        public Criteria andColorCategoryNameLessThan(String value) {
            addCriterion("COLOR_CATEGORY_NAME <", value, "colorCategoryName");
            return (Criteria) this;
        }

        public Criteria andColorCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("COLOR_CATEGORY_NAME <=", value, "colorCategoryName");
            return (Criteria) this;
        }

        public Criteria andColorCategoryNameLike(String value) {
            addCriterion("COLOR_CATEGORY_NAME like", value, "colorCategoryName");
            return (Criteria) this;
        }

        public Criteria andColorCategoryNameNotLike(String value) {
            addCriterion("COLOR_CATEGORY_NAME not like", value, "colorCategoryName");
            return (Criteria) this;
        }

        public Criteria andColorCategoryNameIn(List<String> values) {
            addCriterion("COLOR_CATEGORY_NAME in", values, "colorCategoryName");
            return (Criteria) this;
        }

        public Criteria andColorCategoryNameNotIn(List<String> values) {
            addCriterion("COLOR_CATEGORY_NAME not in", values, "colorCategoryName");
            return (Criteria) this;
        }

        public Criteria andColorCategoryNameBetween(String value1, String value2) {
            addCriterion("COLOR_CATEGORY_NAME between", value1, value2, "colorCategoryName");
            return (Criteria) this;
        }

        public Criteria andColorCategoryNameNotBetween(String value1, String value2) {
            addCriterion("COLOR_CATEGORY_NAME not between", value1, value2, "colorCategoryName");
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

        public Criteria andCartLimitIsNull() {
            addCriterion("CART_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andCartLimitIsNotNull() {
            addCriterion("CART_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andCartLimitEqualTo(Integer value) {
            addCriterion("CART_LIMIT =", value, "cartLimit");
            return (Criteria) this;
        }

        public Criteria andCartLimitNotEqualTo(Integer value) {
            addCriterion("CART_LIMIT <>", value, "cartLimit");
            return (Criteria) this;
        }

        public Criteria andCartLimitGreaterThan(Integer value) {
            addCriterion("CART_LIMIT >", value, "cartLimit");
            return (Criteria) this;
        }

        public Criteria andCartLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("CART_LIMIT >=", value, "cartLimit");
            return (Criteria) this;
        }

        public Criteria andCartLimitLessThan(Integer value) {
            addCriterion("CART_LIMIT <", value, "cartLimit");
            return (Criteria) this;
        }

        public Criteria andCartLimitLessThanOrEqualTo(Integer value) {
            addCriterion("CART_LIMIT <=", value, "cartLimit");
            return (Criteria) this;
        }

        public Criteria andCartLimitIn(List<Integer> values) {
            addCriterion("CART_LIMIT in", values, "cartLimit");
            return (Criteria) this;
        }

        public Criteria andCartLimitNotIn(List<Integer> values) {
            addCriterion("CART_LIMIT not in", values, "cartLimit");
            return (Criteria) this;
        }

        public Criteria andCartLimitBetween(Integer value1, Integer value2) {
            addCriterion("CART_LIMIT between", value1, value2, "cartLimit");
            return (Criteria) this;
        }

        public Criteria andCartLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("CART_LIMIT not between", value1, value2, "cartLimit");
            return (Criteria) this;
        }

        public Criteria andLimitPerCustomerIsNull() {
            addCriterion("LIMIT_PER_CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andLimitPerCustomerIsNotNull() {
            addCriterion("LIMIT_PER_CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andLimitPerCustomerEqualTo(String value) {
            addCriterion("LIMIT_PER_CUSTOMER =", value, "limitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andLimitPerCustomerNotEqualTo(String value) {
            addCriterion("LIMIT_PER_CUSTOMER <>", value, "limitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andLimitPerCustomerGreaterThan(String value) {
            addCriterion("LIMIT_PER_CUSTOMER >", value, "limitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andLimitPerCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("LIMIT_PER_CUSTOMER >=", value, "limitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andLimitPerCustomerLessThan(String value) {
            addCriterion("LIMIT_PER_CUSTOMER <", value, "limitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andLimitPerCustomerLessThanOrEqualTo(String value) {
            addCriterion("LIMIT_PER_CUSTOMER <=", value, "limitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andLimitPerCustomerLike(String value) {
            addCriterion("LIMIT_PER_CUSTOMER like", value, "limitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andLimitPerCustomerNotLike(String value) {
            addCriterion("LIMIT_PER_CUSTOMER not like", value, "limitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andLimitPerCustomerIn(List<String> values) {
            addCriterion("LIMIT_PER_CUSTOMER in", values, "limitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andLimitPerCustomerNotIn(List<String> values) {
            addCriterion("LIMIT_PER_CUSTOMER not in", values, "limitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andLimitPerCustomerBetween(String value1, String value2) {
            addCriterion("LIMIT_PER_CUSTOMER between", value1, value2, "limitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andLimitPerCustomerNotBetween(String value1, String value2) {
            addCriterion("LIMIT_PER_CUSTOMER not between", value1, value2, "limitPerCustomer");
            return (Criteria) this;
        }

        public Criteria andStockQuantityIsNull() {
            addCriterion("STOCK_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andStockQuantityIsNotNull() {
            addCriterion("STOCK_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andStockQuantityEqualTo(Integer value) {
            addCriterion("STOCK_QUANTITY =", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityNotEqualTo(Integer value) {
            addCriterion("STOCK_QUANTITY <>", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityGreaterThan(Integer value) {
            addCriterion("STOCK_QUANTITY >", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCK_QUANTITY >=", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityLessThan(Integer value) {
            addCriterion("STOCK_QUANTITY <", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("STOCK_QUANTITY <=", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityIn(List<Integer> values) {
            addCriterion("STOCK_QUANTITY in", values, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityNotIn(List<Integer> values) {
            addCriterion("STOCK_QUANTITY not in", values, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_QUANTITY between", value1, value2, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_QUANTITY not between", value1, value2, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockExternalQuantityIsNull() {
            addCriterion("STOCK_EXTERNAL_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andStockExternalQuantityIsNotNull() {
            addCriterion("STOCK_EXTERNAL_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andStockExternalQuantityEqualTo(Integer value) {
            addCriterion("STOCK_EXTERNAL_QUANTITY =", value, "stockExternalQuantity");
            return (Criteria) this;
        }

        public Criteria andStockExternalQuantityNotEqualTo(Integer value) {
            addCriterion("STOCK_EXTERNAL_QUANTITY <>", value, "stockExternalQuantity");
            return (Criteria) this;
        }

        public Criteria andStockExternalQuantityGreaterThan(Integer value) {
            addCriterion("STOCK_EXTERNAL_QUANTITY >", value, "stockExternalQuantity");
            return (Criteria) this;
        }

        public Criteria andStockExternalQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCK_EXTERNAL_QUANTITY >=", value, "stockExternalQuantity");
            return (Criteria) this;
        }

        public Criteria andStockExternalQuantityLessThan(Integer value) {
            addCriterion("STOCK_EXTERNAL_QUANTITY <", value, "stockExternalQuantity");
            return (Criteria) this;
        }

        public Criteria andStockExternalQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("STOCK_EXTERNAL_QUANTITY <=", value, "stockExternalQuantity");
            return (Criteria) this;
        }

        public Criteria andStockExternalQuantityIn(List<Integer> values) {
            addCriterion("STOCK_EXTERNAL_QUANTITY in", values, "stockExternalQuantity");
            return (Criteria) this;
        }

        public Criteria andStockExternalQuantityNotIn(List<Integer> values) {
            addCriterion("STOCK_EXTERNAL_QUANTITY not in", values, "stockExternalQuantity");
            return (Criteria) this;
        }

        public Criteria andStockExternalQuantityBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_EXTERNAL_QUANTITY between", value1, value2, "stockExternalQuantity");
            return (Criteria) this;
        }

        public Criteria andStockExternalQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_EXTERNAL_QUANTITY not between", value1, value2, "stockExternalQuantity");
            return (Criteria) this;
        }

        public Criteria andStockUnlimitedIsNull() {
            addCriterion("STOCK_UNLIMITED is null");
            return (Criteria) this;
        }

        public Criteria andStockUnlimitedIsNotNull() {
            addCriterion("STOCK_UNLIMITED is not null");
            return (Criteria) this;
        }

        public Criteria andStockUnlimitedEqualTo(Boolean value) {
            addCriterion("STOCK_UNLIMITED =", value, "stockUnlimited");
            return (Criteria) this;
        }

        public Criteria andStockUnlimitedNotEqualTo(Boolean value) {
            addCriterion("STOCK_UNLIMITED <>", value, "stockUnlimited");
            return (Criteria) this;
        }

        public Criteria andStockUnlimitedGreaterThan(Boolean value) {
            addCriterion("STOCK_UNLIMITED >", value, "stockUnlimited");
            return (Criteria) this;
        }

        public Criteria andStockUnlimitedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("STOCK_UNLIMITED >=", value, "stockUnlimited");
            return (Criteria) this;
        }

        public Criteria andStockUnlimitedLessThan(Boolean value) {
            addCriterion("STOCK_UNLIMITED <", value, "stockUnlimited");
            return (Criteria) this;
        }

        public Criteria andStockUnlimitedLessThanOrEqualTo(Boolean value) {
            addCriterion("STOCK_UNLIMITED <=", value, "stockUnlimited");
            return (Criteria) this;
        }

        public Criteria andStockUnlimitedIn(List<Boolean> values) {
            addCriterion("STOCK_UNLIMITED in", values, "stockUnlimited");
            return (Criteria) this;
        }

        public Criteria andStockUnlimitedNotIn(List<Boolean> values) {
            addCriterion("STOCK_UNLIMITED not in", values, "stockUnlimited");
            return (Criteria) this;
        }

        public Criteria andStockUnlimitedBetween(Boolean value1, Boolean value2) {
            addCriterion("STOCK_UNLIMITED between", value1, value2, "stockUnlimited");
            return (Criteria) this;
        }

        public Criteria andStockUnlimitedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("STOCK_UNLIMITED not between", value1, value2, "stockUnlimited");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("LABEL is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(Boolean value) {
            addCriterion("LABEL =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(Boolean value) {
            addCriterion("LABEL <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(Boolean value) {
            addCriterion("LABEL >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("LABEL >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(Boolean value) {
            addCriterion("LABEL <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(Boolean value) {
            addCriterion("LABEL <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<Boolean> values) {
            addCriterion("LABEL in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<Boolean> values) {
            addCriterion("LABEL not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(Boolean value1, Boolean value2) {
            addCriterion("LABEL between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("LABEL not between", value1, value2, "label");
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