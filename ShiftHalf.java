package com.org.ArrayProgram;

import java.util.Arrays;

public class ShiftHalf {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int[] result=new int[arr.length];
		
		int index=0;
			
			int mid=arr.length/2;
			
			for(int i=mid;i<arr.length;i++) {
				result[index++]=arr[i];
			}
			for(int i=0;i<mid;i++) {
				result[index++]=arr[i];
			}
			System.out.println(Arrays.toString(result));
		
	}
}
