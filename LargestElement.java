package com.org.ArrayProgram;

public class LargestElement {

	public static void largestElement(int[] arr,int largestElement) {
		for(int i=0;i<arr.length;i++) {
			if(largestElement<arr[i]) {
				largestElement=arr[i];
			}
		}
		System.out.println("The largest element of an array: "+ largestElement);
	}
	
	public static void smallestElement(int[] arr,int smallestElement) {
		for(int i=0;i<arr.length;i++) {
			if(smallestElement>arr[i]) {
				smallestElement=arr[i];
			}
		}
		System.out.println("The smallest element of an array: "+smallestElement);
	}
	
	public static void main(String[] args) {
		int[] arr= {2,3,5,7,9};
		int largestElement=arr[0];
		int smallestElement=arr[0];
		
//		largestElement(arr, largestElement);
		smallestElement(arr, smallestElement);
	}
}
