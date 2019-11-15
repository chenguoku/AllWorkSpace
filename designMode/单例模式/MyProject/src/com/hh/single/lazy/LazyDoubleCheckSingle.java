package com.hh.single.lazy;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName LazyDoubleCheckSingleTest.java
 * @Description TODO
 * @createTime 2019年11月16日 00:04:00
 */
public class LazyDoubleCheckSingle {

    private volatile static LazyDoubleCheckSingle single;

    private static boolean flag = true;

    private LazyDoubleCheckSingle() {
        if (flag){
            flag = !flag;
        }else {
            throw new RuntimeException("不允许重复创建实例");
        }


//        if (single != null){
//            throw new RuntimeException("不允许重复创建实例");
//        }
    }

    public static LazyDoubleCheckSingle getInstance() {

        if (single == null) {
            synchronized (LazyDoubleCheckSingle.class) {
                if (single == null) {
                    single = new LazyDoubleCheckSingle();
                }
            }
        }

        return single;
    }
}
