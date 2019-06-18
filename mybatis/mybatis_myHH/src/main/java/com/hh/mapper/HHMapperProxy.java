package com.hh.mapper;

import com.hh.session.HHSqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HHMapperProxy<T> implements InvocationHandler {
    public <T> HHMapperProxy(HHSqlSession hhSqlSession, Class<T> clazz) {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
