package com.geekster.class12;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 4, 7, 3, 9 };
		int min = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			min = arr[i];
			int minIndex = i;
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			swap(arr[i],arr[minIndex]);
		}
		for (int a=0;a<arr.length;a++) {
			System.out.print(a);
		}
	}

	public static void swap(int a, int b) {
//		System.out.println("a = "+a+"b = "+b);
		int temp = b;
		b = a;
		a = temp;
//		System.out.println("a = "+a+"b = "+b);
	}

}
