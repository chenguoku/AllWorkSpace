package com.hh.dome;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hh.dome.async.Task;
import sun.misc.BASE64Encoder;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DomeApplicationTests {

    @Autowired
    private Task task;


    @Test
	public void contextLoads() {

        try {
            task.doTaskOne();
            task.doTaskTwo();
            task.doTaskThree();
        }catch (Exception e){
            e.printStackTrace();
        }


	}
    
    /**
     * MD5 加密
     */
    @Test
    public void testMD5() {
    	String str = "123456";
    	String newstr= null;
        try {
            //确定计算方法
            MessageDigest md5=MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            //加密后的字符串
            newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(newstr);
    }

}

