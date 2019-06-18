package com.leimingtech.entity;

public class ShopSizeJp {
    private Integer jpId;

    private String name;

    private String shortName;

    private Integer sortId;

    private String globalName;

    public Integer getJpId() {
        return jpId;
    }

    public void setJpId(Integer jpId) {
        this.jpId = jpId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getGlobalName() {
        return globalName;
    }

    public void setGlobalName(String globalName) {
        this.globalName = globalName == null ? null : globalName.trim();
    }
}