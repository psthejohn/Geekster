package com.geekster.class8;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/
public class BestTimeToBuyAndSell2 {
	public int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i] < prices[i + 1]) {
				profit += prices[i + 1] - prices[i];
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
