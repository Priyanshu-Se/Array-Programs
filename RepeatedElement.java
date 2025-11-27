package com.org.ArrayProgram;

public class RepeatedElement {

	public static void main(String[] args) {
		int[] arr= {2,3,4,2,1,4,3,5,6};
		boolean[] visited=new boolean[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(visited[i]==false) {
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						visited[j]=true;
					}
				}
				if(count>1) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}
