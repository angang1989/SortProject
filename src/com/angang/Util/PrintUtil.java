package com.angang.Util;

public class PrintUtil {
	
	/**
	 * 排序过程中输出排序结果
	 * @param a
	 * @param count
	 */
	public static void print(int a[], int count){
		String result = "";
		
		for(int i=0; i<=count; i++){
			result = result + a[i] + " ";
		}
		
		System.out.println(result);
	}
}
