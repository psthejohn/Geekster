package com.geekster.class11;

import java.util.Scanner;

public class TwoDReverseWave {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		boolean x = false;
		System.out.println("Original Matrix " + '\n' + "========================");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		for (int j = arr.length; j >= 0; j--) {
			if (x == false) {
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i][j]);
				}
				x = true;
			} else {
				for (int i = arr.length; i >= 0; i++) {
					System.out.print(arr[i][j]);
				}
				x = false;
			}
			System.out.println();
		}

	}
}
