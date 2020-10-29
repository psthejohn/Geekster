package com.geekster.day6;

import java.util.*;

class Testing {

	/*
	 * Complete the 'diagonalDifference' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY arr as parameter.
	 */

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = i; j < arr.length; j++) {
					arr[j] = arr[j + 1];
					arr[arr.length] = 0;
				}
			}
		}
	}
}