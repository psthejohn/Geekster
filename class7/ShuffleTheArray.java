package com.geekster.class7;

//https://leetcode.com/problems/shuffle-the-array/submissions/
public class ShuffleTheArray {
	public int[] shuffle(int[] nums, int n) {
		int[] arr = new int[nums.length];
		int x = n, y = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				arr[i] = nums[y];
				y++;
				System.out.println("If statement :: " + arr[i]);
			} else {
				arr[i] = nums[x];
				x++;
				System.out.println("else statement :: " + arr[i]);
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
