package com.tushar.sumArrayzero;

public class BruteForce {

	private static Boolean sumArrayZero(int[] a, int n) {
		int max;
		Boolean found = false;
		for (int i = 0; i < n; i++) {
			max=0;
			for(int j=i;j<n;j++) {
				max = max + a[j];
				if (max == 0) { 
					found = true;
				}
			}
		}
		return found;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,6,3,-9,4,-4,12,22};
		int n = arr.length;
		Boolean res = sumArrayZero(arr,n);
		System.out.println("found "+res);
	}

}
