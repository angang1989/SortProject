package com.angang.sort;

import com.angang.Util.PrintUtil;
import com.angang.Util.SortUtil;

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = {3,2,5,3,2,6,34,2,7,1,12,23,88,22,12,1,21};
		System.out.print("before sort:");
		PrintUtil.print(a, a.length-1);
		
		System.out.println("sorting:");
		BubbleSort.bubble(a);
		
		System.out.print("after sort:");
		PrintUtil.print(a, a.length-1);
	}
	
	private static void bubble(int a[]){
		for(int i=0; i<a.length-1; i++){
			for(int j=0; j<a.length-1-i ;j++){
				if(a[j] > a[j+1]){
					SortUtil.swap(a, j, j+1);
				}
			}
			
			PrintUtil.print(a, a.length-1);
		}
	}
}
