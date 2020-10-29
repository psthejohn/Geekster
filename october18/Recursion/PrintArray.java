package com.geekster.october18.Recursion;

import java.util.ArrayList;

public class PrintArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		printArray(a);
		printArray1(a, a.length);
	}

	private static void printArray(int[] arr) {
		if (arr.length == 0) {
			return;
		}
		int[] newArr = new int[arr.length - 1];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i + 1];
		}
		System.out.println(arr[0]);
		printArray(newArr);
	}

	private static void printArray1(int[] arr, int vidx) {
		
	}
}