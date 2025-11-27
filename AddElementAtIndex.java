package com.org.ArrayProgram;

import java.util.Arrays;

public class AddElementAtIndex {

	public static void main(String[] args) {
		int[] arr= {1,2,3,5,6};
		int newElement=4;
		int atIndex=3;
		int[] newArr=new int[arr.length+1];
		
		for(int i=0;i<atIndex;i++) {
			newArr[i]=arr[i];
		}
		newArr[atIndex]=newElement;
		
		for(int i=atIndex;i<arr.length;i++) {
			newArr[i+1]=arr[i];
		}
		System.out.println(Arrays.toString(newArr));
	}
}
