package com.hh.dome.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * <p>Title: Combinations</p> 
 * <p>Description: 组合，从一组数中，选出几个进行组合，有多少可能</p>   
 * @author chenguoku   
 * @date 2019年3月11日
 */
public class Combinations {

	/**
	 * 
	 * @Title: combinations  
	 * @Description: Generates all combinations and output them,selecting n elements from data
	 * @param @param data
	 * @param @param n    
	 * @return void    
	 * @throws
	 */
	public void combinations(List<Integer> selected,List<Integer> data,int n) {
		
		if (n == 0) {
			//output all selected elements 
			for(Integer i:selected) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
			return;
		}
		if (data.isEmpty()) {
			return;
		}
		
		//select element 0
		selected.add(data.get(0));
		combinations(selected,data.subList(1, data.size()), n-1);
		
		//un-select element 0
		selected.remove(selected.size()-1);
		combinations(selected,data.subList(1, data.size()), n);
		
	}
	
	public static void main(String[] args) {
		
		Combinations combinations = new Combinations();
		combinations.combinations(new ArrayList<>(),Arrays.asList(1,2,3,4), 2);
		System.out.println("===========================");
		combinations.combinations(new ArrayList<>(),new ArrayList<>(), 2);
		System.out.println("===========================");
		combinations.combinations(new ArrayList<>(),new ArrayList<>(), 0);
		System.out.println("===========================");
		combinations.combinations(new ArrayList<>(),Arrays.asList(1,2,3,4), 1);
		System.out.println("===========================");
		combinations.combinations(new ArrayList<>(),Arrays.asList(1,2,3,4), 0);
		System.out.println("===========================");
		combinations.combinations(new ArrayList<>(),Arrays.asList(1,2,3,4,5,6,7,8,9,10), 4);
		
	}

}
