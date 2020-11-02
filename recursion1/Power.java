package com.geekster.recursion1;

public class Power {

	public static void main(String[] args) {
		System.out.println(power(2, 8));
		System.out.println(powerBetter(2, 8));
	}

	private static int power(int num, int pow) {
		if (pow == 1) {
			return num;
		}
		int ans = num * power(num, pow - 1);
		return ans;
	}

	private static int powerBetter(int num, int pow) {
		if (pow == 1) {
			return num;
		}
		int ans = power(num, pow / 2);
		if (pow % 2 == 0) {
			return ans * ans;
		} else {
			return ans * ans * num;
		}
	}
}
