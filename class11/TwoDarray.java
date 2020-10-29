package com.geekster.class11;

import java.util.Scanner;

public class TwoDarray {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		int left = 0;
		int right = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
				if (i == j) {
					left += arr[i][j];
				} else if (i + j == 2) {
					right += arr[i][j];
				}
			}
			System.out.println();
		}
		System.out.println(
				"Sum of left diagonal elements : " + left + '\n' + "Sum of right diagonal elements : " + right);
		scan.close();
	}
}
