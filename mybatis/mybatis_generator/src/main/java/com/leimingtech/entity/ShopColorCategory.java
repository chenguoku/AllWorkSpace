package com.leimingtech.entity;

public class ShopColorCategory {
    private Integer id;

    private String name;

    private String nameJp;

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

    public String getNameJp() {
        return nameJp;
    }

    public void setNameJp(String nameJp) {
        this.nameJp = nameJp == null ? null : nameJp.trim();
    }

    public String getGlobalName() {
        return globalName;
    }

    public void setGlobalName(String globalName) {
        this.globalName = globalName == null ? null : globalName.trim();
    }
}