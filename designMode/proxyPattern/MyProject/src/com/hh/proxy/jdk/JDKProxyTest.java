package com.hh.proxy.jdk;

import com.hh.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName JDKProxyTest.java
 * @Description TODO
 * @createTime 2019年11月21日 00:19:00
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        Object o = new JDKMeipo().getInstance(new Girl());
        Person instance = (Person) o;
        instance.findLove();

        // 输出代理对象，通过jad反编译 查看代理类内部情况
//        try {
//            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
//            FileOutputStream os = new FileOutputStream("F://$Proxy0.class");
//            os.write(bytes);
//            os.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
