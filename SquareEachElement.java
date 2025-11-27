package com.org.ArrayProgram;

import java.util.Arrays;

public class SquareEachElement {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int[] sqr=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			sqr[i]=arr[i]*arr[i];
		}
		System.out.println(Arrays.toString(sqr));
		
	}
}
