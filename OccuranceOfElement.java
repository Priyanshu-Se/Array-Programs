package com.org.ArrayProgram;

public class OccuranceOfElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,2,4,1,5,2,3,4,6,5,6};
		boolean[] visited=new boolean[arr.length];
		int maxOccurance=0;
		int maxElement=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(visited[i]==false) {
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						visited[j]=true;
					}
				}
				visited[i]=true;
				System.out.println(arr[i]+"->"+count);
//				if(count>maxOccurance) {
//					maxOccurance=count;
//					maxElement=arr[i];
//				}
			}
		}
		
//		System.out.println(maxElement+"->"+maxOccurance);
	}
}
