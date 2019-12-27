package com.hh.dome.sort;

import java.util.Arrays;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName BubbleSort.java
 * @Description 冒泡排序
 * @createTime 2019年12月26日
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 1, 4, 5, 7, 95, 3, 56, 2, 4};
//        sortOne(arr);
//        sortTwo(arr);
//        sortThree(arr);
        sortFour(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @Description 常见的冒泡排序
     * @Param
     * @Return
     * @Date 2019/12/26
     * @Author chenguoku
     * @Exception
     */
    public static void sortOne(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    /**
     * @Description 在循环中加一个 排序标记，如果数组已经排序完毕，就跳出大循环
     * @Param
     * @Return
     * @Date 2019/12/26
     * @Author chenguoku
     * @Exception
     */
    public static void sortTwo(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            //有序标记，每一轮的初始值都是true
            boolean isSort = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //因为有元素进行交换，所以不是有序的，标记变为false
                    isSort = false;
                }
            }

            if (isSort) {
                break;
            }
        }
    }

    /**
     * @Description 这次优化，定义一个变量记录 每次更新的最后的位置， 再次循环的时候，就不循环记录位置之后的元素
     * @Param
     * @Return
     * @Date 2019/12/26
     * @Author chenguoku
     * @Exception
     */
    public static void sortThree(int[] arr) {
        //记录最后一次交换的位置
        int lastExchangeIndex = 0;
        //无序数列的边界，每次比较只需要比到这里为止
        int sortBorder = arr.length - 1;

        for (int i = 0; i < arr.length - 1; i++) {
            //有序标记，每一轮的初始值都是true
            boolean isSort = true;
            for (int j = 0; j < sortBorder; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //因为有元素进行交换，所以不是有序的，标记变为false
                    isSort = false;
                    // 更新为最后一次交换元素的位置
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;
            if (isSort) {
                break;
            }
        }
    }

    /**
     * @Description 鸡尾酒排序，适合 数组已经有大部分是有序的。 先从左到右排一次，在从右到左排一次，直到排完。
     * @Param
     * @Return
     * @Date 2019/12/26
     * @Author chenguoku
     * @Exception
     */
    public static void sortFour(int[] arr) {
        int temp = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            //有序标记，每一轮的初始值都是true
            boolean isSorted = true;
            //奇数轮，从左向右比较和交换
            for (int j = i; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }

            // 在偶数轮之前，将isSorted重新标记为true
            isSorted = true;
            //偶数轮，从右向左比较和交换
            for (int j = arr.length - i - 1; j > 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = arr[j];

                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }
        }
    }


}