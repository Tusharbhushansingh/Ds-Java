package com.tushar.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5, 3, -4, 6, 11, 2};
		int temp,j;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j=i;
			while(j > 0 && arr[j-1] > temp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
		for (int item : arr) {
			System.out.print(item+" ");
		}

	}

}
