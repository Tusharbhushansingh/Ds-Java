package com.tushar.sorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {15, 9, 7, 13, 12, 16, 4, 18, 11};
		int len = arr.length;
		QuickSort quicksort = new QuickSort();
		quicksort.quickRecusion(arr,0,len-1);
		for (int i : arr) {
			System.out.print(i+ " ");
		}
	}

	private void quickRecusion(int[] arr, int low, int high) {
		int pi = partition(arr, low, high);
		if (low < pi-1)
			quickRecusion(arr, low, pi-1);
		
		if (pi < high) 
			quickRecusion(arr, pi, high);
	}

	private int partition(int[] arr, int low, int high) {
		int pivot = arr[(low+high)/2];
		while(low<=high) {
			
			while(arr[low] < pivot)
				low++;
			
			while(arr[high] > pivot)
				high--;
			
			if (low<=high) {
				int temp = arr[high];
				arr[high] = arr[low];
				arr[low] = temp;
				low++;
				high--;
			}
		}
		return low;
	}

}
