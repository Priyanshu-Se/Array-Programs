package com.org.ArrayProgram;

public class SumOfEachElementUptoSingleDigit {

	public static void main(String[] args) {
		int[] arr= {888,9999,4,2,34,10};
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			
			while(num>=10) {
				int sum=0;
				while(num>0) {
					int rem=num%10;
					sum+=rem;
					num/=10;
				}
				num=sum;
//				if(num>=10) {
//					num/=10;
//				}
			}
			System.out.print(num+" ");
		}
	}
}
