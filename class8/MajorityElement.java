package com.geekster.class8;

import java.util.ArrayList;

//https://leetcode.com/problems/majority-element/submissions/
public class MajorityElement {
	public int majorityElement(int[] nums) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(nums[0]);
		int num = 0;
		if (nums.length > 1) {
			for (int i = 0; i < nums.length; i++) {
				int counter = 0;
				// while(counter<nums.length/2){
				for (int j = i; j < nums.length; j++) {
					if (nums[i] == nums[j]) {
						counter++;
					}
				}
				if (counter > nums.length / 2)
					return nums[i];

			}
		}
		return num;
	}

}
