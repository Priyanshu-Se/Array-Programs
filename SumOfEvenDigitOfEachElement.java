package com.org.ArrayProgram;

import java.util.Arrays;

public class SumOfEvenDigitOfEachElement {

	public static void main(String[] args) {
	
		int[] arr= {234,56,44,68,12,11};
		int[] temp= new int[arr.length];
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			
				int sum=0;
				while(num>0) {
	
					int rem=num%10;
					if(rem%2==0) {
						sum+=rem;
					}
					num/=10;
				}
				temp[i]=sum;
		}
		System.out.println(Arrays.toString(temp));
	}
}

