package com.org.ArrayProgram;

public class CommonElement {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int[] arr2= {3,4,5,6};
		
		System.out.print("The common elememt in two arrays: ");
		for(int i=0;i<arr1.length;i++) {
			boolean isCommon=false;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					isCommon=true;
					break;
				}
			}
			if(isCommon) {
				System.out.print(arr1[i]+" ");
			}
		}
	}
}
