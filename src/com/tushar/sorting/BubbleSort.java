package com.tushar.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {2, 1, 8, -3, 6, 4, 12,11};
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				// sort the elements in ascending order. If you want to sort in descending order then just reverse the condition.
				if (a[j+1] < a[j]) {
					//swap the values
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted elements are:");
		for (int i : a) {
			System.out.print(i+ " ");
		}
	}

}
