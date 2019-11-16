package com.hh.single.register;

public enum EnumSingle {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingle getInstance() {
        return INSTANCE;
    }
}
