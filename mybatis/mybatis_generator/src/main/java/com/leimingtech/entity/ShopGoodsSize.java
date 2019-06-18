package com.leimingtech.entity;

public class ShopGoodsSize {
    private Integer id;

    private Integer jpSizeId;

    private Integer sizeId;

    private String sizeName;

    private Integer goodsId;

    private String jpSizeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJpSizeId() {
        return jpSizeId;
    }

    public void setJpSizeId(Integer jpSizeId) {
        this.jpSizeId = jpSizeId;
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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getJpSizeName() {
        return jpSizeName;
    }

    public void setJpSizeName(String jpSizeName) {
        this.jpSizeName = jpSizeName == null ? null : jpSizeName.trim();
    }
}