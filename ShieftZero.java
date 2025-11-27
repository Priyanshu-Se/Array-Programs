package com.org.ArrayProgram;

import java.util.Arrays;

public class ShieftZero {

	public static void shiftEnd(int[] arr,int[] result,int index) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0)
			{
				result[index++]=arr[i];
			}
		}
		while(index<result.length) {
			result[index++]=0;
		}
		System.out.println(Arrays.toString(result));
	}
	
	public static void shiftFirst(int[] arr,int[] result,int index) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				result[index++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				result[index++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(result));
	}
	
	public static void main(String[] args) {
		int[] arr= {1,0,0,1,0,1,0,1};
		int[] result=new int[arr.length];
		int index=0;
		
//		shiftEnd(arr,result, index);
		shiftFirst(arr, result, index);
	}
}
