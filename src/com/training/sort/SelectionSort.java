package com.training.sort;


public class SelectionSort {
	public static int[] selectionsort(int[] arr) {
		if (arr.length < 1) {
			throw new IndexOutOfBoundsException("List can't be empty");
		} else {
			for(int i=0;i<arr.length;i++) {
				int minIndex=i;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]<arr[minIndex]) {
						minIndex=j;
					}
				}
				int temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
				
			}
			return arr;
		}
	}
}