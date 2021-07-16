package com.tushar.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class DoublyEndedQueue {

	public static int[] maximumSlidingWindow(int[] a, int length, int k){
		Deque<Integer> dq = new LinkedList<>();
		int[] res = new int[length-k+1];
		int i=0;
		for(;i<length;i++)
		{
			if(i<k) {
				while(!dq.isEmpty() && a[dq.peekLast()] < a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			} else {
				while(!dq.isEmpty() && (i - dq.peekFirst() > 4))
					dq.removeFirst();
				res[i-k] = a[dq.peekFirst()];
				while(!dq.isEmpty() && a[dq.peekLast()] < a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			}
		}
		res[i-k] = a[dq.peekFirst()];
		return res;
		
	}
	
	public static void main(String[] args) {
		int arr[] = { 8, 5, 10, 7, 9, 4, 9, 12, 90, 13 };
		int k = 4, n = arr.length;
		int[] ans = maximumSlidingWindow(arr, n, k);
		for (int i : ans) {
			System.out.print(i+" ");
		}
		
	}

}
