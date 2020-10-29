package com.geekster.class11;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - j - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
	}
}
