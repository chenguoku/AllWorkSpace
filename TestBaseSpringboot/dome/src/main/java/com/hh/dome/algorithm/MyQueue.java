package com.hh.dome.algorithm;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName MyQueue.java
 * @Description 队列使用数组实现
 * @createTime 2019年11月17日 19:59:00
 */
public class MyQueue {

    private int[] array;
    private int front;
    private int rear;

    public MyQueue(int capacity) {
        this.array = new int[capacity];
    }

    /**
     * 入队
     *
     * @return:
     * @author: chenguoku
     * @date: 2019/11/17
     */
    public void enQueue(int element) throws Exception {
        if ((rear + 1) % array.length == front) {
            throw new Exception("队列已满");
        }
        array[rear] = element;
        rear = (rear + 1) % array.length;
    }

    public int deQueue() throws Exception {
        if ((rear == front)) {
            throw new Exception("队列已空");
        }

        int deQueueElement = array[front];
        front = (front + 1) % array.length;
        return deQueueElement;
    }

    public void output() {
        for (int i = front; i != rear; i = (i + 1) % array.length) {
            System.out.println(array[i]);
        }
    }
}
