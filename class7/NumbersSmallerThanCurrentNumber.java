package com.geekster.class7;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class NumbersSmallerThanCurrentNumber {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			arr[i] = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					arr[i]++;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
