package com.org.ArrayProgram;

import java.util.Scanner;

public class StoreCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		char[] ch = new char[size];
		System.out.println("Enter the character");
		for(int i=0;i<size;i++) {
			ch[i]=sc.next().charAt(0);
		}
		
		System.out.println("Original Array : ");
		for(char c:ch) {
			System.out.print(c+" ");
		}
		
		System.out.println();
		
		System.out.println("Reversed Array: ");
		for(int i=size-1;i>=0;i--) {
			char c = ch[i];
			System.out.print(c+" ");
		}
	}
}
