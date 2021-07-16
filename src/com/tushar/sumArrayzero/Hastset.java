package com.tushar.sumArrayzero;

import java.util.HashSet;

public class Hastset {

	private static Boolean sumArrayZero(int[] a, int n, int k) {
		int sum=0;
		Boolean found = false;
		HashSet<Integer> hs = new HashSet<>();
		for (Integer element : a) {
			hs.add(sum);
			sum += element;
			if(hs.contains(sum - k)) {
				found = true;
				break;
			}
		}
		return found;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,6,3,-8,4,5,12,22};
		int n = arr.length;
		int search = -3;
		Boolean res = sumArrayZero(arr,n,search);
		System.out.println("found "+res);

	}

}
