package com.org.ArrayProgram;

import java.util.Scanner;

public class AddEvenElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		
		int[] evenArray = new int[size];
		int count=0;
		
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			int num=sc.nextInt();
			
			if(num%2==0) {
				evenArray[count]=num;
				count++;		
			}
		}
		for(int i=0;i<count;i++) {
			System.out.print(evenArray[i]+ " ");
		}
	}
}
