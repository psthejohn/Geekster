package com.geekster.class12;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 4, 6, 3, 1, 7, 9, 8 };
		// compare two elements if left>right replace
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 2; j++) {
				if (arr[i] > arr[j]) {
					System.out.println("i enter"+arr[i]);
					swap(arr[i], arr[j]);
				}
			}
		}
		for (int a : arr) {
			System.out.print(a);
		}
	}

	public static void swap(int a, int b) {
		int temp = b;
		b = a;
		a = temp;
	}
}