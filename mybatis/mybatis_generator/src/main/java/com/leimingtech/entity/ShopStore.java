package com.leimingtech.entity;

public class ShopStore {
    private String id;

    private String storeName;

    private String storeNameJp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreNameJp() {
        return storeNameJp;
    }

    public void setStoreNameJp(String storeNameJp) {
        this.storeNameJp = storeNameJp == null ? null : storeNameJp.trim();
    }
}