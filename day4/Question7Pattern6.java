package com.geekster.day4;

public class Question7Pattern6 {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int k = 5; k > i; k--) {
				System.out.print("  ");
			}
			for (int k = i; k > 1; k--) {
				System.out.print(k);
			}
			for (int k = 0; k < i; k++) {
				System.out.print(k + 1);
			}
			System.out.println();
		}
	}
}