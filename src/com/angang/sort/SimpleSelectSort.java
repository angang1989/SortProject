package com.angang.sort;

import com.angang.Util.PrintUtil;
import com.angang.Util.SortUtil;

/**
 *  简单选择排序
 *  
 * @author angang
 *
 */
public class SimpleSelectSort {
	public static void main(String[] args) {
		int a[] = {3,2,5,3,2,6,34,2,7,1,12,23,88,22,12,1,21};
		System.out.print("before sort:");
		PrintUtil.print(a, a.length-1);
		
		System.out.println("sorting:");
		SimpleSelectSort.selectSort(a);
		//SimpleSelectSort.twiceSelectSort(a);
		
		System.out.print("after sort:");
		PrintUtil.print(a, a.length-1);
	}
	
	//每次只找一个最小的数，然后当前循环的数交换
	private static void selectSort(int a[]) {
		int k = 0;
		
		for(int i=0; i<a.length; i++){
			k = i;
			for(int j=i+1; j<a.length; j++){
				if(a[k] > a[j]){
					k = j;
				}
			}
			SortUtil.swap(a, i, k);
			PrintUtil.print(a, a.length-1);
		}
	}
	
	/**
	 * 简单选择排序的改进——二元选择排序
	 * @param a
	 */
	//每次找出最大和最小的数，放到数组的两端
	private static void twiceSelectSort(int a[]) {
		int min = 0;
		int max = 0;
		
		//每次找两个数，只需循环一半的次数
		for(int i=0; i<a.length/2; i++){
			min = i;
			max = i;
			
			for(int j=i+1; j<a.length-i; j++){
				if(a[min] > a[j]){
					min = j;
					continue;
				}
				if(a[max] < a[j]){
					max = j;
				}
			}
			
			//小的数和当前循环的数互换，大的数和length-i的数交换
			SortUtil.swap(a, i, min);
			SortUtil.swap(a, max, (a.length-1)-i);
			PrintUtil.print(a, a.length-1);
		}
	}
}
