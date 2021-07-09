package com.tushar.algorithm;

public class TwoAlgorithm {

	public static void main(String[] args) {

		int[] arr = {43,-9,55,11,66,23,98};
		int search = 346;
		
		int i = 0, j = arr.length -1;
	    while(i < j) {
			if(arr[i]+arr[j]>search)
			{
				j--;
			}	
			else if(arr[i]+arr[j]<search)
			{	
				i++;
			}	
			else
			{	
				System.out.println("Found");
				break;
			}	
		}

	}

}
