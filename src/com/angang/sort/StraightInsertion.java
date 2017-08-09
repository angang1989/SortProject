package com.angang.sort;

import com.angang.Util.PrintUtil;

/**
 * 插入排序  时间复杂度 O(n^2)
 * @author angang
 *
 */
public class StraightInsertion{
	public static void main(String[] args){
		int a[] = {3,2,5,3,2,6,34,2,7,1,12,28};
		System.out.print("before sort:");
		PrintUtil.print(a, a.length-1);
		
		System.out.println("sorting:");
		StraightInsertion.insertSort(a);
		
		System.out.print("after sort:");
		PrintUtil.print(a, a.length-1);
	}
	
	/**
     * 插入排序
     * 从第一个元素开始，该元素可以认为已经被排序
     * 取出下一个元素，在已经排序的元素序列中从后向前扫描 
     * 如果该元素（已排序）大于新元素，将该元素移到下一位置  
     * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置  
     * 将新元素插入到该位置中  
     * 重复步骤2
	 * @param a 待排序数组
	 */
	private static void insertSort(int a[]){
		int size = a.length;
		int temp = 0;
		int j = 0;
		
		// 实现方法1：用for循环实现
		for(int i=0; i<size; i++){
			temp = a[i];
			
			// 从当前位置向前比较，直到找到比当前值小的位置后面插入
			for(j=i; j>0 && temp<a[j-1]; j--){
				a[j] = a[j-1];
			}
			
			a[j] = temp;
			
			PrintUtil.print(a, i);
		}
		
		// 实现方法2：for循环+while循环实现
//		for(int i=0; i<size; i++){
//			temp = a[i];
//			
//			j=i;
//			
//			while(j>=0 && temp<a[j-1]){
//				a[j] = a[j-1];
//				j--;
//			}
//			
//			a[j] = temp;
//			
//			PrintUtil.print(a, i);
//		}
	}
}
