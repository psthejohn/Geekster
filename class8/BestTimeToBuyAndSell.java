package com.geekster.class8;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/
public class BestTimeToBuyAndSell {
	public int maxProfit(int[] prices) {
		if (prices.length == 1) {
			return 0;
		}
		int minTillNow = prices[0];
		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			maxProfit = Math.max(0, prices[i] - minTillNow);
			minTillNow = Math.min(minTillNow, prices[i]);
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
