package com.geekster.recursion1;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		increDecreasing(5);
	}

	private static void increDecreasing(int num) {
		if (num == 0) {
			return;
		}
		System.out.println(num);
		increDecreasing(num - 1);
		System.out.println(num);
	}
}