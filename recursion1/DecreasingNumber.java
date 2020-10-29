package com.geekster.recursion1;

public class DecreasingNumber {

	public static void main(String[] args) {
		decrease(5);
	}

	private static void decrease(int i) {
		// Base case
		if (i == 0) {
			return;
		}
		// pre function
		System.out.println(i);
		// recursive statement
		decrease(i - 1);
	}

}
