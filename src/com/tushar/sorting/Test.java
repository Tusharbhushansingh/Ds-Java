package com.tushar.sorting;

public class Test {

	int[] tempArray;
	int[] arr;
	int lengths;
	
	public static void main(String[] args) {
		int[] a = {23,42,11,22,12,35};
		Test t = new Test();
		t.quickSort(a);
		for (int i : a) {
			System.out.print(i+", ");
		}
	}

	private void quickSort(int[] a) {
		this.arr = a;
		this.lengths = a.length;
		divide(0,lengths-1);
	}

	private void divide(int low, int high) {
		int pi = partition(low,high);
		if(low<pi-1)
			divide(low, pi-1);
		if(pi<high)
			divide(pi, high);
	}

	private int partition(int low, int high) {
		int pivot = (low+high)/2;
		while(low<=high) {
			while(arr[low] < pivot)
				low++;
			while(arr[high] > pivot)
				high--;
			if(low<=high) {
				int temp = arr[high];
				arr[high]= arr[low];
				arr[low] = temp;
				low++;
				high--;
			}
		}
		return low;
	}
}
