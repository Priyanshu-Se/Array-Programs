package com.org.ArrayProgram;

public class PrimeNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 12, 3, 23, 9, 7, 24 };

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			boolean isPrime = true;

			if (num <= 1) {
				isPrime = false;
			} else {
				for (int j = 2; j <= num / 2; j++) {
					if (num % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) {
				System.out.print(num + " ");
			}
		}
	}
}
