package com.geekster.class7;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class NumbersWithEvenNumberOfDigits {
	public int findNumbers(int[] nums) {
		int evenInteger = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			while (nums[i] != 0) {
				nums[i] /= 10;
				++count;
			}
			if (count % 2 == 0) {
				evenInteger++;
			}
		}
		return evenInteger;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
