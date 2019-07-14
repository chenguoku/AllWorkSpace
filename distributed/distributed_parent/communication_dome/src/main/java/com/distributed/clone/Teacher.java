package com.distributed.clone;

import java.io.Serializable;

public class Teacher implements Serializable {
    private static final long serialVersionUID = 5043793371834843535L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
