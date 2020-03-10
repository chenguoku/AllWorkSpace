package com.hh.dome.algorithm;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName MyQueueTest.java
 * @Description TODO
 * @createTime 2019年11月17日 20:08:00
 */
public class MyQueueTest {
    public static void main(String[] args) throws Exception {
        MyQueue myQueue = new MyQueue(5);
        myQueue.enQueue(2);
        myQueue.enQueue(1);
        myQueue.enQueue(3);

        int i = myQueue.deQueue();
        System.out.println(i);
        myQueue.output();
    }
}
