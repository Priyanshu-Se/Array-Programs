package com.org.ArrayProgram;

public class NumbersToWord {

	public static String digitToWords(char digit) {
		switch(digit) {
		case '0':
			return "Zero";
		case '1':
			return "One";
		case '2':
			return "Two";
		case '3':
			return "Three";
		case '4':
			return "Four";
		case '5':
			return "Five";
		case '6':
			return "Six";
		case '7':
			return "Seven";
		case '8':
			return "Eight";
		case '9':
			return "Nine";
			default:
				return "";
		}	
	}
	public static void main(String[] args) {
			
			int[] arr= {234,45,2,6,78};
			
			for(int num:arr) {
				String string = String.valueOf(num);
				for(int i=0;i<string.length();i++) {
					char ch = string.charAt(i);					
					System.out.print(digitToWords(ch)+" ");
				}

				System.out.println();
			}					
		}
}
