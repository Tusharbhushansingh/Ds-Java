package com.tushar.sorting;

public class SelectionSort {

	public static void main(String[] args) {
	
		int[] arr = {5, 2, -1, 6, 3};
		
		for (int i = 0; i < arr.length; i++) {
			int midIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[midIndex]) {
					midIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[midIndex];
			arr[midIndex] = temp;
		}
		
		for (int i : arr) {
			System.out.print(i+ " ");
		}
		
	}

}
