package com.hh.test;

import com.hh.single.lazy.LazyDoubleCheckSingle;

import java.lang.reflect.Constructor;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName LazyDoubleCheckSingleTest.java
 * @Description TODO
 * @createTime 2019年11月16日 00:23:00
 */
public class LazyDoubleCheckSingleTest {

    public static void main(String[] args) {
        try {
//        LazyDoubleCheckSingle instance = LazyDoubleCheckSingle.getInstance();
//        LazyDoubleCheckSingle instance1 = LazyDoubleCheckSingle.getInstance();
//        System.out.println(instance);
//        System.out.println(instance1);


            Class<LazyDoubleCheckSingle> clazz = LazyDoubleCheckSingle.class;
            Constructor<LazyDoubleCheckSingle> declaredConstructor = clazz.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            LazyDoubleCheckSingle lazyDoubleCheckSingle = declaredConstructor.newInstance();

            LazyDoubleCheckSingle instance = LazyDoubleCheckSingle.getInstance();
            System.out.println(instance);
            System.out.println(lazyDoubleCheckSingle);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
