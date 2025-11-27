package com.org.ArrayProgram;

import java.util.Arrays;

public class ReverseEachElement {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6};
		int[] temp=new int[arr.length];
		int index=0;
		
		for(int i=arr.length-1;i>=0;i--) {
			temp[index++]=arr[i];
		}
		System.out.println(Arrays.toString(temp));
	}
}
