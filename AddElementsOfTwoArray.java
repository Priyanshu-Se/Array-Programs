package com.org.ArrayProgram;

import java.util.Arrays;

public class AddElementsOfTwoArray {

	public static void main(String[] args) {
		int[] arr1= {2,3,4,5,6};
		int[] arr2= {3,5,8,6,1,2,4,8};
		
		int maxLength=0;
		if(arr1.length>arr2.length) {
			maxLength=arr1.length;
		}
		else {
			maxLength=arr2.length;
		}
		int[] result=new int[maxLength];
		for(int i=0;i<maxLength;i++) {
			int val1=(i<arr1.length)?arr1[i]:0;
			int val2=(i<arr2.length)?arr2[i]:0;
			
			result[i]=val1+val2;
		}
		System.out.println(Arrays.toString(result));
	}
}
