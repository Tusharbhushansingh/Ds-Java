package com.tushar.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Greatest3Element {

	public static void main(String[] args) {
		int[] arr = {3,5,90,11,23,54,66,23,67,18,87};
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of greatest element you want to retrieve");
		int k = sc.nextInt();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(i<k) {
				pq.add(arr[i]);
			}else {
				if(arr[i] > pq.peek()) {
					pq.remove();
					pq.add(arr[i]);
				}
			}	
		}
		ArrayList<Integer> al = new ArrayList<>(pq);
		Collections.sort(al);
		for (Integer integer : al) {
			System.out.print(integer+" ");
		}

	}

}
