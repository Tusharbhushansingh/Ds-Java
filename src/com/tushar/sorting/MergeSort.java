package com.tushar.sorting;

public class MergeSort {

	int[] array;
	int[] tempMergeArr;
	int length;
	public static void main(String[] args) {
		int[] inputArr = {48, 36, 13, 52, 19, 94, 21};
		MergeSort ms = new MergeSort();
		ms.sort(inputArr);
		for (int i : inputArr) {
			System.out.print(i+ ", ");
		}

	}

	private void sort(int[] inputArr) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArr = new int[length];
		divideArray(0,length-1);
		
	}

	private void divideArray(int lowerindex, int higherindex) {
		if (lowerindex < higherindex) {
			int middleindex = lowerindex + (higherindex-lowerindex)/2;
			
			//left divide the array
			divideArray(lowerindex, middleindex);
			
			//right divide the array
		    divideArray(middleindex+1, higherindex);
			
			mergeArray(lowerindex,middleindex,higherindex);
		}
	}

	private void mergeArray(int lowerindex, int middleindex, int higherindex) {
		for (int i = lowerindex; i <= higherindex; i++) {
			tempMergeArr[i] = array[i];
		}		
		int i = lowerindex;
		int j = middleindex + 1;
		int k = lowerindex;
		while(i<=middleindex && j<=higherindex) {
			if (tempMergeArr[i] <= tempMergeArr[j]) {
				array[k] = tempMergeArr[i];
				i++;
			}else {
				array[k] = tempMergeArr[j];
				j++;
			}
			k++;	
		}
		
		while(i<=middleindex) {
			array[k] = tempMergeArr[i];
			i++;
			k++;
		}
		
	}
}
