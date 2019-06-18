package com.hh.dome.sort;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;

/**
 * 快速排序
 * @author chenguoku
 *
 */
public class QuickSort {

//	public static void quickSort(int[] arr){
//	    qsort(arr, 0, arr.length-1);
//	}
//	private static void qsort(int[] arr, int low, int high){
//	    if (low < high){
//	        int pivot=partition(arr, low, high);        //将数组分为两部分
//	        qsort(arr, low, pivot-1);                   //递归排序左子数组
//	        qsort(arr, pivot+1, high);                  //递归排序右子数组
//	    }
//	}
//	private static int partition(int[] arr, int low, int high){
//	    int pivot = arr[low];     //枢轴记录
//	    while (low<high){
//	        while (low<high && arr[high]>=pivot) --high;
//	        arr[low]=arr[high];             //交换比枢轴小的记录到左端
//	        while (low<high && arr[low]<=pivot) ++low;
//	        arr[high] = arr[low];           //交换比枢轴大的记录到右端
//	    }
//	    //扫描完成，枢轴到位
//	    arr[low] = pivot;
//	    //返回的是枢轴的位置
//	    return low;
//	}
//
//	public static void main(String[] args) {
//		int[] arr = {3,8,2,5,7};
//		quickSort(arr);
//		IntStream stream = Arrays.stream(arr);
//		stream.forEach(System.out::print);
//	}
	
	
	
	public static void quickSort(int[] arr) {
		qsort(arr, 0, arr.length-1);
	}
	
	
	public static void qsort(int[] arr,int low, int high){
	    if (low<high){
            int middle = getMiddle(arr,low,high);
            qsort(arr,low,middle-1);
            qsort(arr,middle+1,high);
        }


	}

	public static int getMiddle(int[] arr,int low,int high){
	    int middle = arr[low];
	    while (low < high){
	        while (low<high && arr[high] >= middle) --high;
	        arr[low] = arr[high];
	        while (low < high && arr[low] <= middle) ++low;
	        arr[high] = arr[low];
        }
        arr[low] = middle;
        return low;
    }
	
	public static void main(String[] args) {
		int[] arr = {3,8,2,5,7};
		quickSort(arr);
		IntStream stream = Arrays.stream(arr);
		stream.forEach(System.out::print);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
