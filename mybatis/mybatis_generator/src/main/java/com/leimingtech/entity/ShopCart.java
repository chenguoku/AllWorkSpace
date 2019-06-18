package com.leimingtech.entity;

import java.math.BigDecimal;

public class ShopCart {
    private Integer id;

    private Integer memberId;

    private Integer storeId;

    private String storeName;

    private Integer goodsCsId;

    private String goodsName;

    private Integer goodsId;

    private Integer sizeId;

    private String sizeName;

    private Integer colorId;

    private String colorName;

    private BigDecimal goodsStorePrice;

    private String goodsNum;

    private String goodsImages;

    private Integer isCheck;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Integer getGoodsCsId() {
        return goodsCsId;
    }

    public void setGoodsCsId(Integer goodsCsId) {
        this.goodsCsId = goodsCsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName == null ? null : sizeName.trim();
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName == null ? null : colorName.trim();
    }

    public BigDecimal getGoodsStorePrice() {
        return goodsStorePrice;
    }

    public void setGoodsStorePrice(BigDecimal goodsStorePrice) {
        this.goodsStorePrice = goodsStorePrice;
    }

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum == null ? null : goodsNum.trim();
    }

    public String getGoodsImages() {
        return goodsImages;
    }

    public void setGoodsImages(String goodsImages) {
        this.goodsImages = goodsImages == null ? null : goodsImages.trim();
    }

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }
}