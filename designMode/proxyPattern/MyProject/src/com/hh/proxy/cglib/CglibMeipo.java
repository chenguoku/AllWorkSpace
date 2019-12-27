package com.hh.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName CglibMeipo.java
 * @Description TODO
 * @createTime 2019年11月21日 00:59:00
 */
public class CglibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {
        //相当于Proxy，代理的工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before();
        Object obj = methodProxy.invokeSuper(o, objects);
        after();

        return obj;
    }

    private void before() {
        System.out.println("开始物色");
    }

    private void after() {
        System.out.println("寻找完毕");
    }
}
