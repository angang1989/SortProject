package com.angang.sort;

import com.angang.Util.PrintUtil;

/**
 * 希尔排序
 * @author angang
 * 基本思想：
	先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。
	
         操作方法：
	    1.选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
	    2.按增量序列个数k，对序列进行k 趟排序；
	    3.每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 */
public class ShellSort {
	public static void main(String[] args) {
		int a[] = {3,2,5,3,2,6,34,2,7,1,12,23,88,22,12,1};
		System.out.print("before sort:");
		PrintUtil.print(a, a.length-1);
		
		System.out.println("sorting:");
		ShellSort.shellSort(a);
		
		System.out.print("after sort:");
		PrintUtil.print(a, a.length-1);
	}
	
	private static void shellSort(int a[]){
		int dk = a.length/2;
		while(dk >= 1){
			ShellSort.shellInsertSort(a, dk);
			
			PrintUtil.print(a, a.length-1);
			
			dk = dk/2;
		}
	}
	
	private static void shellInsertSort(int a[], int dk){
		int size = a.length;
		int temp = 0;
		int j = 0;
		
		for(int i=dk; i<size; i++){
			temp = a[i];
			for(j=i; (j-dk)>=0 && temp<a[j-dk]; j=j-dk){
				a[j] = a[j-dk];
			}
			
			a[j] = temp;
		}
	}
}
