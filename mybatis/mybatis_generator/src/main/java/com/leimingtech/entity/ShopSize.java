package com.leimingtech.entity;

public class ShopSize {
    private Integer id;

    private Integer jpId;

    private String name;

    private String sortId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getSortId() {
        return sortId;
    }

    public void setSortId(String sortId) {
        this.sortId = sortId == null ? null : sortId.trim();
    }
}