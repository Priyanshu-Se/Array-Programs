package com.org.ArrayProgram;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr= {1,3,2,1,3,2,5,4,7};
		boolean[] visited =new boolean[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(visited[i]==false) {
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						visited[j]=true;
						}
				}
				if(count==1) {
				 System.out.print(arr[i]+" ");
				}
			}
		}
	}
}
