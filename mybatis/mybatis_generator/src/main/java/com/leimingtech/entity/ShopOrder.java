package com.leimingtech.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ShopOrder {
    private Long id;

    private String orderSn;

    private Long memberId;

    private String memberName;

    private String memberEmail;

    private String paymentName;

    private String paymentCode;

    private Integer payId;

    private Long paymentId;

    private Boolean paymentState;

    private Date paymentTime;

    private String orderMessage;

    private Integer goodsNum;

    private BigDecimal orderAmount;

    private BigDecimal discountAmount;

    private BigDecimal goodsAmount;

    private Boolean orderStatus;

    private BigDecimal refundAmount;

    private Date completeTime;

    private Integer addressId;

    private Integer daddressId;

    private Integer transportCompanyId;

    private String transportCode;

    private String transportExpressCode;

    private String paySn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail == null ? null : memberEmail.trim();
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName == null ? null : paymentName.trim();
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode == null ? null : paymentCode.trim();
    }

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Boolean getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(Boolean paymentState) {
        this.paymentState = paymentState;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getOrderMessage() {
        return orderMessage;
    }

    public void setOrderMessage(String orderMessage) {
        this.orderMessage = orderMessage == null ? null : orderMessage.trim();
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getDaddressId() {
        return daddressId;
    }

    public void setDaddressId(Integer daddressId) {
        this.daddressId = daddressId;
    }

    public Integer getTransportCompanyId() {
        return transportCompanyId;
    }

    public void setTransportCompanyId(Integer transportCompanyId) {
        this.transportCompanyId = transportCompanyId;
    }

    public String getTransportCode() {
        return transportCode;
    }

    public void setTransportCode(String transportCode) {
        this.transportCode = transportCode == null ? null : transportCode.trim();
    }

    public String getTransportExpressCode() {
        return transportExpressCode;
    }

    public void setTransportExpressCode(String transportExpressCode) {
        this.transportExpressCode = transportExpressCode == null ? null : transportExpressCode.trim();
    }

    public String getPaySn() {
        return paySn;
    }

    public void setPaySn(String paySn) {
        this.paySn = paySn == null ? null : paySn.trim();
    }
}