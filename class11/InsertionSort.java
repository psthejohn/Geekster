package com.geekster.class11;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i - 1; j > 0; j--) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Sorted Array");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
