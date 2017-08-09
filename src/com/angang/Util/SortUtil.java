package com.angang.Util;

public class SortUtil {
	//交换数组中下标为i和k的位置
	public static void swap(int a[], int i, int k) {
		if(i == k){
			return;
		}
		
		//交换通过临时变量交换两下标的数字
//		int temp = 0;
//		temp = a[i];
//		a[i] = a[k];
//		a[k] = temp;
		
		//通过自身运算交换两下标的数字
		a[i] = a[i] + a[k];
		a[k] = a[i] - a[k];
		a[i] = a[i] - a[k];
	}
}
