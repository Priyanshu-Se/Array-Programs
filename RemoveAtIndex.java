package com.org.ArrayProgram;

import java.util.Arrays;

public class RemoveAtIndex {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] newArr=new int[arr.length-1];
		int atIndex=3;
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			if(i!=atIndex) {
				newArr[index++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(newArr));
	}
}
