package com.geekster.class11;

import java.util.Scanner;

public class TwoDArray2 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		boolean x = false;

		for (int i = 0; i < 3; i++) {
			if (x == false) {
				for (int j = 0; j < 3; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
				x = true;
			} else {
				for (int j = 2; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
				x = false;
			}
			scan.close();
		}

	}
}
