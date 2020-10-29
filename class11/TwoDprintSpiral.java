package com.geekster.class11;

import java.util.HashSet;
import java.util.Scanner;

public class TwoDprintSpiral {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println("Original Matrix " + '\n' + "========================");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			for(int k=0;k<arr.length;k++) {
				
			}
		}
	}

}
