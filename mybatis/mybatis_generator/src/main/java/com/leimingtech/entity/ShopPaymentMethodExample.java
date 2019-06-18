package com.leimingtech.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopPaymentMethodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopPaymentMethodExample() {
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

        public Criteria andPaymentMethodCodeIsNull() {
            addCriterion("PAYMENT_METHOD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodCodeIsNotNull() {
            addCriterion("PAYMENT_METHOD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodCodeEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_CODE =", value, "paymentMethodCode");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodCodeNotEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_CODE <>", value, "paymentMethodCode");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodCodeGreaterThan(String value) {
            addCriterion("PAYMENT_METHOD_CODE >", value, "paymentMethodCode");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_CODE >=", value, "paymentMethodCode");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodCodeLessThan(String value) {
            addCriterion("PAYMENT_METHOD_CODE <", value, "paymentMethodCode");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodCodeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_CODE <=", value, "paymentMethodCode");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodCodeLike(String value) {
            addCriterion("PAYMENT_METHOD_CODE like", value, "paymentMethodCode");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodCodeNotLike(String value) {
            addCriterion("PAYMENT_METHOD_CODE not like", value, "paymentMethodCode");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodCodeIn(List<String> values) {
            addCriterion("PAYMENT_METHOD_CODE in", values, "paymentMethodCode");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodCodeNotIn(List<String> values) {
            addCriterion("PAYMENT_METHOD_CODE not in", values, "paymentMethodCode");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodCodeBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD_CODE between", value1, value2, "paymentMethodCode");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodCodeNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD_CODE not between", value1, value2, "paymentMethodCode");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameIsNull() {
            addCriterion("PAYMENT_METHOD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameIsNotNull() {
            addCriterion("PAYMENT_METHOD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_NAME =", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameNotEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_NAME <>", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameGreaterThan(String value) {
            addCriterion("PAYMENT_METHOD_NAME >", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_NAME >=", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameLessThan(String value) {
            addCriterion("PAYMENT_METHOD_NAME <", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_NAME <=", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameLike(String value) {
            addCriterion("PAYMENT_METHOD_NAME like", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameNotLike(String value) {
            addCriterion("PAYMENT_METHOD_NAME not like", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameIn(List<String> values) {
            addCriterion("PAYMENT_METHOD_NAME in", values, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameNotIn(List<String> values) {
            addCriterion("PAYMENT_METHOD_NAME not in", values, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD_NAME between", value1, value2, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD_NAME not between", value1, value2, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodStateIsNull() {
            addCriterion("PAYMENT_METHOD_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodStateIsNotNull() {
            addCriterion("PAYMENT_METHOD_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodStateEqualTo(Integer value) {
            addCriterion("PAYMENT_METHOD_STATE =", value, "paymentMethodState");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodStateNotEqualTo(Integer value) {
            addCriterion("PAYMENT_METHOD_STATE <>", value, "paymentMethodState");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodStateGreaterThan(Integer value) {
            addCriterion("PAYMENT_METHOD_STATE >", value, "paymentMethodState");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_METHOD_STATE >=", value, "paymentMethodState");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodStateLessThan(Integer value) {
            addCriterion("PAYMENT_METHOD_STATE <", value, "paymentMethodState");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodStateLessThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_METHOD_STATE <=", value, "paymentMethodState");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodStateIn(List<Integer> values) {
            addCriterion("PAYMENT_METHOD_STATE in", values, "paymentMethodState");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodStateNotIn(List<Integer> values) {
            addCriterion("PAYMENT_METHOD_STATE not in", values, "paymentMethodState");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodStateBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_METHOD_STATE between", value1, value2, "paymentMethodState");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodStateNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_METHOD_STATE not between", value1, value2, "paymentMethodState");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLogoIsNull() {
            addCriterion("PAYMENT_METHOD_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLogoIsNotNull() {
            addCriterion("PAYMENT_METHOD_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLogoEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_LOGO =", value, "paymentMethodLogo");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLogoNotEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_LOGO <>", value, "paymentMethodLogo");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLogoGreaterThan(String value) {
            addCriterion("PAYMENT_METHOD_LOGO >", value, "paymentMethodLogo");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLogoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_LOGO >=", value, "paymentMethodLogo");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLogoLessThan(String value) {
            addCriterion("PAYMENT_METHOD_LOGO <", value, "paymentMethodLogo");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLogoLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_LOGO <=", value, "paymentMethodLogo");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLogoLike(String value) {
            addCriterion("PAYMENT_METHOD_LOGO like", value, "paymentMethodLogo");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLogoNotLike(String value) {
            addCriterion("PAYMENT_METHOD_LOGO not like", value, "paymentMethodLogo");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLogoIn(List<String> values) {
            addCriterion("PAYMENT_METHOD_LOGO in", values, "paymentMethodLogo");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLogoNotIn(List<String> values) {
            addCriterion("PAYMENT_METHOD_LOGO not in", values, "paymentMethodLogo");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLogoBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD_LOGO between", value1, value2, "paymentMethodLogo");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLogoNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD_LOGO not between", value1, value2, "paymentMethodLogo");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("UPDATER is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("UPDATER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("UPDATER =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("UPDATER <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("UPDATER >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATER >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("UPDATER <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("UPDATER <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("UPDATER like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("UPDATER not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("UPDATER in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("UPDATER not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("UPDATER between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("UPDATER not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("DEL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("DEL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Boolean value) {
            addCriterion("DEL_FLAG =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Boolean value) {
            addCriterion("DEL_FLAG <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Boolean value) {
            addCriterion("DEL_FLAG >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DEL_FLAG >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Boolean value) {
            addCriterion("DEL_FLAG <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("DEL_FLAG <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Boolean> values) {
            addCriterion("DEL_FLAG in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Boolean> values) {
            addCriterion("DEL_FLAG not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("DEL_FLAG between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DEL_FLAG not between", value1, value2, "delFlag");
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