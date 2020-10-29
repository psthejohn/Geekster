package com.geekster.class7;

//https://leetcode.com/problems/running-sum-of-1d-array/
public class Running_Sum_Of_One_D_Array {
	public int[] runningSum(int[] nums) {
		int[] arr = new int[nums.length];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			arr[i] = sum;
		}
		return arr;
	}
}
