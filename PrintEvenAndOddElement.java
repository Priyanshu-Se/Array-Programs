package com.org.ArrayProgram;

import java.util.Scanner;

public class PrintEvenAndOddElement {
	
	public static void printEvenElement(int[] arr,int size) {
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void printOddElement(int[] arr,int size) {
		for(int i=0;i<size;i++) {
			if(arr[i]%2>=1) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		
//		printEvenElement(arr, size);
		printOddElement(arr, size);
	}
}
