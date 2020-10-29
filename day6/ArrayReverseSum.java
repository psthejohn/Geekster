package com.geekster.day6;

import java.util.Scanner;

public class ArrayReverseSum {

	public static void main(String[] args) {
//		int[] arr = new int[5];
//		System.out.println("Please input 5 array elements :: ");
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		for (int i = arr.length-1; i >= 0; i--) {
//			System.out.print(arr[i]);
//		}
		int[] arr2 = { 2, 4, 6, 6, 10, 3, 5, 7, 8, 2, 4, 6, 5, 0, -1 };
		targetSum(arr2, 12);
	}

	public static void targetSum(int[] arr, int target) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > 1; j--) {
				if(i!=j) {
				if (arr[i] + arr[j] == target) {
					counter++;
					System.out.println(i + "," + j);
				}

			}}
		}
		if (counter > 0) {
			System.out.print("target exists");
		}
	}

}
