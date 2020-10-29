package com.geekster.recursion1;

public class Fibonacci {

	public static void main(String[] args) {
		fibonacci(7);
	}

	private static void fibonacci(int num) {
//		if (i == 0) {
//			return 0;
//		}
		int first = 0, second = 1;
		for (int i = 1; i < num; i++) {
			int sum = first+second;
			first = second;
			second = sum;
		}
		// Base Case
		// Relation
		// Generalise
		System.out.println();
	}

}
