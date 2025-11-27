package com.org.java;

public class ThirdHighestNumber {
	public static void main(String[] args) {
	
		int[] arr= {2,4,1,6,7,8};
		
		if(arr.length<3) {
			return;
		}
		
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		
		for(int num:arr) {
			if(num>first) {
				third=second;
				second=first;
				first=num;
			}
			else if(num>second && num<first) {
				third=second;
				second=num;
			}
			else if(num>third && num<second) {
				third=num;
			}
		}
		System.out.println("Third highest number:"+third);
	}
	
}
