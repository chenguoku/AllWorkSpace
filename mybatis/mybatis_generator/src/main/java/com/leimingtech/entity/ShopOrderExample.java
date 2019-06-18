package com.leimingtech.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopOrderExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("ORDER_SN is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("ORDER_SN is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("ORDER_SN =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("ORDER_SN <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("ORDER_SN >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_SN >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("ORDER_SN <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("ORDER_SN <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("ORDER_SN like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("ORDER_SN not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("ORDER_SN in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("ORDER_SN not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("ORDER_SN between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("ORDER_SN not between", value1, value2, "orderSn");
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

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("MEMBER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("MEMBER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("MEMBER_NAME =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("MEMBER_NAME <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("MEMBER_NAME >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("MEMBER_NAME <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("MEMBER_NAME like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("MEMBER_NAME not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("MEMBER_NAME in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("MEMBER_NAME not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNull() {
            addCriterion("MEMBER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNotNull() {
            addCriterion("MEMBER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailEqualTo(String value) {
            addCriterion("MEMBER_EMAIL =", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotEqualTo(String value) {
            addCriterion("MEMBER_EMAIL <>", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThan(String value) {
            addCriterion("MEMBER_EMAIL >", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_EMAIL >=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThan(String value) {
            addCriterion("MEMBER_EMAIL <", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_EMAIL <=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLike(String value) {
            addCriterion("MEMBER_EMAIL like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotLike(String value) {
            addCriterion("MEMBER_EMAIL not like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIn(List<String> values) {
            addCriterion("MEMBER_EMAIL in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotIn(List<String> values) {
            addCriterion("MEMBER_EMAIL not in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailBetween(String value1, String value2) {
            addCriterion("MEMBER_EMAIL between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotBetween(String value1, String value2) {
            addCriterion("MEMBER_EMAIL not between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andPaymentNameIsNull() {
            addCriterion("PAYMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPaymentNameIsNotNull() {
            addCriterion("PAYMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentNameEqualTo(String value) {
            addCriterion("PAYMENT_NAME =", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameNotEqualTo(String value) {
            addCriterion("PAYMENT_NAME <>", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameGreaterThan(String value) {
            addCriterion("PAYMENT_NAME >", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_NAME >=", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameLessThan(String value) {
            addCriterion("PAYMENT_NAME <", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_NAME <=", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameLike(String value) {
            addCriterion("PAYMENT_NAME like", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameNotLike(String value) {
            addCriterion("PAYMENT_NAME not like", value, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameIn(List<String> values) {
            addCriterion("PAYMENT_NAME in", values, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameNotIn(List<String> values) {
            addCriterion("PAYMENT_NAME not in", values, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameBetween(String value1, String value2) {
            addCriterion("PAYMENT_NAME between", value1, value2, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentNameNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_NAME not between", value1, value2, "paymentName");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIsNull() {
            addCriterion("PAYMENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIsNotNull() {
            addCriterion("PAYMENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeEqualTo(String value) {
            addCriterion("PAYMENT_CODE =", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotEqualTo(String value) {
            addCriterion("PAYMENT_CODE <>", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeGreaterThan(String value) {
            addCriterion("PAYMENT_CODE >", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_CODE >=", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLessThan(String value) {
            addCriterion("PAYMENT_CODE <", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_CODE <=", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLike(String value) {
            addCriterion("PAYMENT_CODE like", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotLike(String value) {
            addCriterion("PAYMENT_CODE not like", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIn(List<String> values) {
            addCriterion("PAYMENT_CODE in", values, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotIn(List<String> values) {
            addCriterion("PAYMENT_CODE not in", values, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeBetween(String value1, String value2) {
            addCriterion("PAYMENT_CODE between", value1, value2, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_CODE not between", value1, value2, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNull() {
            addCriterion("PAY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("PAY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(Integer value) {
            addCriterion("PAY_ID =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(Integer value) {
            addCriterion("PAY_ID <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(Integer value) {
            addCriterion("PAY_ID >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAY_ID >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(Integer value) {
            addCriterion("PAY_ID <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAY_ID <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<Integer> values) {
            addCriterion("PAY_ID in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<Integer> values) {
            addCriterion("PAY_ID not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(Integer value1, Integer value2) {
            addCriterion("PAY_ID between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAY_ID not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNull() {
            addCriterion("PAYMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("PAYMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(Long value) {
            addCriterion("PAYMENT_ID =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(Long value) {
            addCriterion("PAYMENT_ID <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(Long value) {
            addCriterion("PAYMENT_ID >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PAYMENT_ID >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(Long value) {
            addCriterion("PAYMENT_ID <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(Long value) {
            addCriterion("PAYMENT_ID <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<Long> values) {
            addCriterion("PAYMENT_ID in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<Long> values) {
            addCriterion("PAYMENT_ID not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(Long value1, Long value2) {
            addCriterion("PAYMENT_ID between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(Long value1, Long value2) {
            addCriterion("PAYMENT_ID not between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIsNull() {
            addCriterion("PAYMENT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIsNotNull() {
            addCriterion("PAYMENT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateEqualTo(Boolean value) {
            addCriterion("PAYMENT_STATE =", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotEqualTo(Boolean value) {
            addCriterion("PAYMENT_STATE <>", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThan(Boolean value) {
            addCriterion("PAYMENT_STATE >", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PAYMENT_STATE >=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThan(Boolean value) {
            addCriterion("PAYMENT_STATE <", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThanOrEqualTo(Boolean value) {
            addCriterion("PAYMENT_STATE <=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIn(List<Boolean> values) {
            addCriterion("PAYMENT_STATE in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotIn(List<Boolean> values) {
            addCriterion("PAYMENT_STATE not in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateBetween(Boolean value1, Boolean value2) {
            addCriterion("PAYMENT_STATE between", value1, value2, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PAYMENT_STATE not between", value1, value2, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("PAYMENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("PAYMENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("PAYMENT_TIME =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("PAYMENT_TIME <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("PAYMENT_TIME >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAYMENT_TIME >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("PAYMENT_TIME <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("PAYMENT_TIME <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("PAYMENT_TIME in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("PAYMENT_TIME not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("PAYMENT_TIME between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("PAYMENT_TIME not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andOrderMessageIsNull() {
            addCriterion("ORDER_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andOrderMessageIsNotNull() {
            addCriterion("ORDER_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMessageEqualTo(String value) {
            addCriterion("ORDER_MESSAGE =", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageNotEqualTo(String value) {
            addCriterion("ORDER_MESSAGE <>", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageGreaterThan(String value) {
            addCriterion("ORDER_MESSAGE >", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_MESSAGE >=", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageLessThan(String value) {
            addCriterion("ORDER_MESSAGE <", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageLessThanOrEqualTo(String value) {
            addCriterion("ORDER_MESSAGE <=", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageLike(String value) {
            addCriterion("ORDER_MESSAGE like", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageNotLike(String value) {
            addCriterion("ORDER_MESSAGE not like", value, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageIn(List<String> values) {
            addCriterion("ORDER_MESSAGE in", values, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageNotIn(List<String> values) {
            addCriterion("ORDER_MESSAGE not in", values, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageBetween(String value1, String value2) {
            addCriterion("ORDER_MESSAGE between", value1, value2, "orderMessage");
            return (Criteria) this;
        }

        public Criteria andOrderMessageNotBetween(String value1, String value2) {
            addCriterion("ORDER_MESSAGE not between", value1, value2, "orderMessage");
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

        public Criteria andGoodsNumEqualTo(Integer value) {
            addCriterion("GOODS_NUM =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(Integer value) {
            addCriterion("GOODS_NUM <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(Integer value) {
            addCriterion("GOODS_NUM >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODS_NUM >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(Integer value) {
            addCriterion("GOODS_NUM <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("GOODS_NUM <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<Integer> values) {
            addCriterion("GOODS_NUM in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<Integer> values) {
            addCriterion("GOODS_NUM not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_NUM between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_NUM not between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("ORDER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("ORDER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("ORDER_AMOUNT >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMOUNT in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMOUNT not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMOUNT between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMOUNT not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("DISCOUNT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("DISCOUNT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_AMOUNT in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_AMOUNT not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_AMOUNT between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_AMOUNT not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNull() {
            addCriterion("GOODS_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNotNull() {
            addCriterion("GOODS_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountEqualTo(BigDecimal value) {
            addCriterion("GOODS_AMOUNT =", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotEqualTo(BigDecimal value) {
            addCriterion("GOODS_AMOUNT <>", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThan(BigDecimal value) {
            addCriterion("GOODS_AMOUNT >", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_AMOUNT >=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThan(BigDecimal value) {
            addCriterion("GOODS_AMOUNT <", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_AMOUNT <=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIn(List<BigDecimal> values) {
            addCriterion("GOODS_AMOUNT in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotIn(List<BigDecimal> values) {
            addCriterion("GOODS_AMOUNT not in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_AMOUNT between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_AMOUNT not between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Boolean value) {
            addCriterion("ORDER_STATUS =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Boolean value) {
            addCriterion("ORDER_STATUS <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Boolean value) {
            addCriterion("ORDER_STATUS >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ORDER_STATUS >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Boolean value) {
            addCriterion("ORDER_STATUS <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("ORDER_STATUS <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Boolean> values) {
            addCriterion("ORDER_STATUS in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Boolean> values) {
            addCriterion("ORDER_STATUS not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("REFUND_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("REFUND_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(BigDecimal value) {
            addCriterion("REFUND_AMOUNT =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(BigDecimal value) {
            addCriterion("REFUND_AMOUNT <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(BigDecimal value) {
            addCriterion("REFUND_AMOUNT >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUND_AMOUNT >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(BigDecimal value) {
            addCriterion("REFUND_AMOUNT <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUND_AMOUNT <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<BigDecimal> values) {
            addCriterion("REFUND_AMOUNT in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<BigDecimal> values) {
            addCriterion("REFUND_AMOUNT not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUND_AMOUNT between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUND_AMOUNT not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNull() {
            addCriterion("COMPLETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNotNull() {
            addCriterion("COMPLETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualTo(Date value) {
            addCriterion("COMPLETE_TIME =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualTo(Date value) {
            addCriterion("COMPLETE_TIME <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThan(Date value) {
            addCriterion("COMPLETE_TIME >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("COMPLETE_TIME >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThan(Date value) {
            addCriterion("COMPLETE_TIME <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("COMPLETE_TIME <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIn(List<Date> values) {
            addCriterion("COMPLETE_TIME in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotIn(List<Date> values) {
            addCriterion("COMPLETE_TIME not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("COMPLETE_TIME between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("COMPLETE_TIME not between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("ADDRESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("ADDRESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("ADDRESS_ID =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("ADDRESS_ID <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("ADDRESS_ID >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADDRESS_ID >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("ADDRESS_ID <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("ADDRESS_ID <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("ADDRESS_ID in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("ADDRESS_ID not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("ADDRESS_ID between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ADDRESS_ID not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdIsNull() {
            addCriterion("DADDRESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andDaddressIdIsNotNull() {
            addCriterion("DADDRESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDaddressIdEqualTo(Integer value) {
            addCriterion("DADDRESS_ID =", value, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdNotEqualTo(Integer value) {
            addCriterion("DADDRESS_ID <>", value, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdGreaterThan(Integer value) {
            addCriterion("DADDRESS_ID >", value, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DADDRESS_ID >=", value, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdLessThan(Integer value) {
            addCriterion("DADDRESS_ID <", value, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("DADDRESS_ID <=", value, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdIn(List<Integer> values) {
            addCriterion("DADDRESS_ID in", values, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdNotIn(List<Integer> values) {
            addCriterion("DADDRESS_ID not in", values, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdBetween(Integer value1, Integer value2) {
            addCriterion("DADDRESS_ID between", value1, value2, "daddressId");
            return (Criteria) this;
        }

        public Criteria andDaddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DADDRESS_ID not between", value1, value2, "daddressId");
            return (Criteria) this;
        }

        public Criteria andTransportCompanyIdIsNull() {
            addCriterion("TRANSPORT_COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransportCompanyIdIsNotNull() {
            addCriterion("TRANSPORT_COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransportCompanyIdEqualTo(Integer value) {
            addCriterion("TRANSPORT_COMPANY_ID =", value, "transportCompanyId");
            return (Criteria) this;
        }

        public Criteria andTransportCompanyIdNotEqualTo(Integer value) {
            addCriterion("TRANSPORT_COMPANY_ID <>", value, "transportCompanyId");
            return (Criteria) this;
        }

        public Criteria andTransportCompanyIdGreaterThan(Integer value) {
            addCriterion("TRANSPORT_COMPANY_ID >", value, "transportCompanyId");
            return (Criteria) this;
        }

        public Criteria andTransportCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSPORT_COMPANY_ID >=", value, "transportCompanyId");
            return (Criteria) this;
        }

        public Criteria andTransportCompanyIdLessThan(Integer value) {
            addCriterion("TRANSPORT_COMPANY_ID <", value, "transportCompanyId");
            return (Criteria) this;
        }

        public Criteria andTransportCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSPORT_COMPANY_ID <=", value, "transportCompanyId");
            return (Criteria) this;
        }

        public Criteria andTransportCompanyIdIn(List<Integer> values) {
            addCriterion("TRANSPORT_COMPANY_ID in", values, "transportCompanyId");
            return (Criteria) this;
        }

        public Criteria andTransportCompanyIdNotIn(List<Integer> values) {
            addCriterion("TRANSPORT_COMPANY_ID not in", values, "transportCompanyId");
            return (Criteria) this;
        }

        public Criteria andTransportCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("TRANSPORT_COMPANY_ID between", value1, value2, "transportCompanyId");
            return (Criteria) this;
        }

        public Criteria andTransportCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSPORT_COMPANY_ID not between", value1, value2, "transportCompanyId");
            return (Criteria) this;
        }

        public Criteria andTransportCodeIsNull() {
            addCriterion("TRANSPORT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTransportCodeIsNotNull() {
            addCriterion("TRANSPORT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransportCodeEqualTo(String value) {
            addCriterion("TRANSPORT_CODE =", value, "transportCode");
            return (Criteria) this;
        }

        public Criteria andTransportCodeNotEqualTo(String value) {
            addCriterion("TRANSPORT_CODE <>", value, "transportCode");
            return (Criteria) this;
        }

        public Criteria andTransportCodeGreaterThan(String value) {
            addCriterion("TRANSPORT_CODE >", value, "transportCode");
            return (Criteria) this;
        }

        public Criteria andTransportCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSPORT_CODE >=", value, "transportCode");
            return (Criteria) this;
        }

        public Criteria andTransportCodeLessThan(String value) {
            addCriterion("TRANSPORT_CODE <", value, "transportCode");
            return (Criteria) this;
        }

        public Criteria andTransportCodeLessThanOrEqualTo(String value) {
            addCriterion("TRANSPORT_CODE <=", value, "transportCode");
            return (Criteria) this;
        }

        public Criteria andTransportCodeLike(String value) {
            addCriterion("TRANSPORT_CODE like", value, "transportCode");
            return (Criteria) this;
        }

        public Criteria andTransportCodeNotLike(String value) {
            addCriterion("TRANSPORT_CODE not like", value, "transportCode");
            return (Criteria) this;
        }

        public Criteria andTransportCodeIn(List<String> values) {
            addCriterion("TRANSPORT_CODE in", values, "transportCode");
            return (Criteria) this;
        }

        public Criteria andTransportCodeNotIn(List<String> values) {
            addCriterion("TRANSPORT_CODE not in", values, "transportCode");
            return (Criteria) this;
        }

        public Criteria andTransportCodeBetween(String value1, String value2) {
            addCriterion("TRANSPORT_CODE between", value1, value2, "transportCode");
            return (Criteria) this;
        }

        public Criteria andTransportCodeNotBetween(String value1, String value2) {
            addCriterion("TRANSPORT_CODE not between", value1, value2, "transportCode");
            return (Criteria) this;
        }

        public Criteria andTransportExpressCodeIsNull() {
            addCriterion("TRANSPORT_EXPRESS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTransportExpressCodeIsNotNull() {
            addCriterion("TRANSPORT_EXPRESS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransportExpressCodeEqualTo(String value) {
            addCriterion("TRANSPORT_EXPRESS_CODE =", value, "transportExpressCode");
            return (Criteria) this;
        }

        public Criteria andTransportExpressCodeNotEqualTo(String value) {
            addCriterion("TRANSPORT_EXPRESS_CODE <>", value, "transportExpressCode");
            return (Criteria) this;
        }

        public Criteria andTransportExpressCodeGreaterThan(String value) {
            addCriterion("TRANSPORT_EXPRESS_CODE >", value, "transportExpressCode");
            return (Criteria) this;
        }

        public Criteria andTransportExpressCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSPORT_EXPRESS_CODE >=", value, "transportExpressCode");
            return (Criteria) this;
        }

        public Criteria andTransportExpressCodeLessThan(String value) {
            addCriterion("TRANSPORT_EXPRESS_CODE <", value, "transportExpressCode");
            return (Criteria) this;
        }

        public Criteria andTransportExpressCodeLessThanOrEqualTo(String value) {
            addCriterion("TRANSPORT_EXPRESS_CODE <=", value, "transportExpressCode");
            return (Criteria) this;
        }

        public Criteria andTransportExpressCodeLike(String value) {
            addCriterion("TRANSPORT_EXPRESS_CODE like", value, "transportExpressCode");
            return (Criteria) this;
        }

        public Criteria andTransportExpressCodeNotLike(String value) {
            addCriterion("TRANSPORT_EXPRESS_CODE not like", value, "transportExpressCode");
            return (Criteria) this;
        }

        public Criteria andTransportExpressCodeIn(List<String> values) {
            addCriterion("TRANSPORT_EXPRESS_CODE in", values, "transportExpressCode");
            return (Criteria) this;
        }

        public Criteria andTransportExpressCodeNotIn(List<String> values) {
            addCriterion("TRANSPORT_EXPRESS_CODE not in", values, "transportExpressCode");
            return (Criteria) this;
        }

        public Criteria andTransportExpressCodeBetween(String value1, String value2) {
            addCriterion("TRANSPORT_EXPRESS_CODE between", value1, value2, "transportExpressCode");
            return (Criteria) this;
        }

        public Criteria andTransportExpressCodeNotBetween(String value1, String value2) {
            addCriterion("TRANSPORT_EXPRESS_CODE not between", value1, value2, "transportExpressCode");
            return (Criteria) this;
        }

        public Criteria andPaySnIsNull() {
            addCriterion("PAY_SN is null");
            return (Criteria) this;
        }

        public Criteria andPaySnIsNotNull() {
            addCriterion("PAY_SN is not null");
            return (Criteria) this;
        }

        public Criteria andPaySnEqualTo(String value) {
            addCriterion("PAY_SN =", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotEqualTo(String value) {
            addCriterion("PAY_SN <>", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThan(String value) {
            addCriterion("PAY_SN >", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_SN >=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThan(String value) {
            addCriterion("PAY_SN <", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThanOrEqualTo(String value) {
            addCriterion("PAY_SN <=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLike(String value) {
            addCriterion("PAY_SN like", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotLike(String value) {
            addCriterion("PAY_SN not like", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnIn(List<String> values) {
            addCriterion("PAY_SN in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotIn(List<String> values) {
            addCriterion("PAY_SN not in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnBetween(String value1, String value2) {
            addCriterion("PAY_SN between", value1, value2, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotBetween(String value1, String value2) {
            addCriterion("PAY_SN not between", value1, value2, "paySn");
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