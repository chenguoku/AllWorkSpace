package com.hh.single.register;

import java.io.Serializable;

public enum EnumSingle implements Serializable {
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
