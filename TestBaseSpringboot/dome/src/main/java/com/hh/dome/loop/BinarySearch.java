package com.hh.dome.loop;

/**
* <p>Title: BinarySearch</p> 
 * <p>Description: 二分法查找</p>   
 * @author chenguoku   
 * @date 2019年3月13日
 */
public class BinarySearch {

	public static int binarySearch(int[] arr,int k) {
		
		int a = 0;
		int b = arr.length;
		
		while (a<b){
			int m = a + (b-a)/2;
			if (k < arr[m]) {
				b = m;
			}else if (k > arr[m]) {
				a = m+1;
			}else {
				return m;
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {};
		System.out.println(binarySearch(arr, 1));
	}

}
