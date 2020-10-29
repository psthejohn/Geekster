package com.geekster.october17.Recursion;

public class Class1 {

	public static void main(String[] args) {
//		printIncreasing(5);
//		printDecreasing(5);
//		printIncreasingDecreasing(5);
//		printOddtoEven(6);
//		System.out.println(factorial(4));
//		System.out.println(printPower(2, 4));
//		System.out.println(printPower(2, 5));
		System.out.println(fibonacci(5));
	}

	private static void printIncreasing(int num) {
		// BASE CONDITION
		if (num == 0) {
			return;
		}
		// PRE AREA
		// Recursion Call
		printIncreasing(num - 1);
		// POST AREA
		System.out.println(num);
	}

	private static void printDecreasing(int num) {
		// BASE CONDITION
		if (num == 0) {
			return;
		}
		// PRE AREA
		System.out.println(num);
		// Recursion Call
		printDecreasing(num - 1);
		// POST AREA
	}

	private static void printIncreasingDecreasing(int num) {
		// BASE CONDITION
		if (num == 0) {
			return;
		}
		// PRE AREA
		System.out.println(num);
		// Recursion Call
		printIncreasingDecreasing(num - 1);
		// POST AREA
		System.out.println(num);
	}

	private static void printOddtoEven(int num) {
		// BASE CONDITION
		if (num == 0) {
			return;
		}
		// PRE AREA
		if (num % 2 != 0) {
			System.out.println("HI " + num);
		}
		// RECURSION CALL
		printOddtoEven(num - 1);
		// POST AREA
		if (num % 2 == 0) {
			System.out.println("BYE " + num);
		}
	}

	private static int factorial(int num) {
		int x = 1;
		if (num == 0) {
			return x;
		}
		x = factorial(num - 1) * num;
		return x;
	}

	private static int printPower(int lower, int upper) {
		if (upper == 0) {
			return 1;
		}
		return lower * printPower(lower, upper - 1);
	}

	private static int printPowerBetter(int lower, int upper) {
		if (upper == 0) {
			return 1;
		}
		if (upper == 1) {
			return lower;
		}
		if (upper % 2 == 0) {
			int upperBy2 = printPowerBetter(lower, upper / 2);
			return upperBy2 * upperBy2;
		} else {
			int upperOdd = printPowerBetter(lower, upper / 2);
			return upperOdd * upperOdd * lower;
		}
	}

	private static int fibonacci(int num) {
		if (num == 1) {
			return 0;
		}
		if (num == 2) {
			return 1;
		}
		int fb1 = fibonacci(num - 1);
		int fb2 = fibonacci(num - 2);
		int current = fb1 + fb2;
		return current;
	}
}
