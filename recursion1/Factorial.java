package com.geekster.recursion1;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	public static int factorial(int i) {
		if(i==1) {
			return 1;
		}
		int x = factorial(i-1)*i;
		return x;
	}

}
