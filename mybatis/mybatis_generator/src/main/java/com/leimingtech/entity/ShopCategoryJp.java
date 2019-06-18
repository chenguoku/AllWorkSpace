package com.leimingtech.entity;

public class ShopCategoryJp {
    private Integer id;

    private String name;

    private Integer parentCategoryId;

    private Integer sortId;

    private String globalName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Integer parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
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