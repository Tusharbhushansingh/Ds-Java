package com.tushar.slidingwindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Priorityqueue {
	 private static List<Integer> slidingwindow(int[] a, int k, int n){
		 int res;
		 PriorityQueue<Integer> pg = new PriorityQueue<>(Collections.reverseOrder());
		 ArrayList<Integer> al = new ArrayList<>();
		 int i = 0;
		 //first iterations
		 for(;i<k;i++)
			 pg.add(a[i]);
		 	 res = pg.peek();
		 	 al.add(res);
		 	 pg.remove(a[0]);
		 	 
		 //second iteration
		 	 for(;i<n;i++) {
		 		 pg.add(a[i]);
		 		 res = pg.peek();
		 		 al.add(res);
		 		 pg.remove(a[i-k+1]);
		 	 }
			 
		return al;
	 }
	
	
	public static void main(String[] args) {
        int arr[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
        int k = 4, n = arr.length;
        List<Integer> res = slidingwindow(arr,k,n);
        for (Integer ans : res) {
			System.out.print(ans+" ,");
		}
	}
}
