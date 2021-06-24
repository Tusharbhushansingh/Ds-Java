package com.tushar.searching;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] inputArr = {34, 65, 1, 11 ,8, 12, 87, 45};
        Arrays.sort(inputArr);
        for (int i : inputArr) {
			System.out.print(i+" ");
		}
        System.out.println("\n");
		
		int lowerindex = 0,item = 11;
		int higherindex = inputArr.length -1;
		int middleindex;
		while(lowerindex <= higherindex) {
			middleindex = (lowerindex + higherindex) / 2;
			if (inputArr[middleindex]  == item) {
				System.out.println("element is at " + middleindex + " index position");
				break;
			}else if(inputArr[middleindex] < item) {
				lowerindex = middleindex + 1;
			} else {
				higherindex = middleindex - 1;
			}
			
		}
	}

}
