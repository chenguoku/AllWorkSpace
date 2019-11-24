package com.hh.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName JDKMeipo.java
 * @Description TODO
 * @createTime 2019年11月21日 00:13:00
 */
public class JDKMeipo implements InvocationHandler {
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;

        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object object = method.invoke(this.target, args);
        after();

        return object;
    }

    private void before() {
        System.out.println("开始物色");
    }

    private void after() {
        System.out.println("寻找完毕");
    }
}
