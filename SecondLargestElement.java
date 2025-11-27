package com.org.ArrayProgram;

public class SecondLargestElement {

	public static void secondLargest(int[] arr,int largest,int secondlargest)
	{
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondlargest=largest;
				largest=arr[i];
			}
			if(secondlargest>arr[i] && arr[i]!=largest) {
				secondlargest=arr[i];
			}
		}
		System.out.println("The 2nd largest element: "+secondlargest);
		
	}
	public static void secondSmallest(int[] arr,int smallest,int secondSmallest) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondSmallest=smallest;
				smallest=arr[i];
			}
			if(secondSmallest>arr[i] && arr[i]!=smallest) {
				secondSmallest=arr[i];
			}
		}
		System.out.println("The 2nd smallest element: "+secondSmallest);
	}
	
	public static void main(String[] args) {
		int[] arr= {2,4,6,8,9};
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
//		secondLargest(arr, largest, secondLargest);
		secondSmallest(arr, smallest, secondSmallest);
		
	}
}
