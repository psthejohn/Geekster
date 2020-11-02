package com.geekster.recursion1;

public class IncreasingNumber {

	public static void main(String[] args) {
		increase(6);
	}

	private static void increase(int num) {
		if (num == 0) {
			return;
		}
		increase(num - 1);
		System.out.println(num);
	}

}
