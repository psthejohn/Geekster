package com.geekster.october28;

import java.util.ArrayList;
import java.util.HashMap;

public class StringClass {

	public static void main(String args[]) {
		String str = "abc";

		String str2 = new String("Pushpinder");
		// print
		System.out.println(str);
		// char at
		System.out.println(str.charAt(0));
		// Print from start index upto last index
		System.out.println(str.substring(1, 2));
		// Print from start index till last
		System.out.println(str.substring(1));
		// String Length
		System.out.println(str.length());
		// To uppercase
		System.out.println(str.toUpperCase());
		// Concatenation
		System.out.println(str.concat(str2));
		alphabetCounter("geekster");
		System.out.println(pallindrome("heheh"));
		ArrayList<String> arr = new ArrayList<>(pallindromicSubstrings("geek"));
		for (int i = 0; i < arr.size(); i++) {
			if (pallindrome(arr.get(i)) == true) {
				System.out.println(arr.get(i) + " ->  " + pallindrome(arr.get(i)));
			}
		}
	}

	private static String removeAllVowels(String str) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				continue;
			} else {
				ans += ch;
			}
		}
		return ans;
	}

	private static void alphabetCounter(String str) {
		int[] freq = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int idx = ch - 'a';
			freq[idx]++;
		}
		for (int i = 0; i < 26; i++) {
			if (freq[i] > 0) {
				int temp = 'a' + i;
				char ch = (char) ((int) 'a' + i);
				System.out.println(ch + " --> " + freq[i]);
			}
		}
	}

	private static boolean pallindrome(String str) {
		int l = 0;
		int r = str.length() - 1;
		while (l < r) {
			char leftCh = str.charAt(l);
			char rightCh = str.charAt(r);
			if (leftCh == rightCh) {
				l++;
				r--;
			} else {
				return false;
			}
		}
		return true;
	}

	private static ArrayList pallindromicSubstrings(String str) {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j <= str.length(); j++) {
				if (i != j) {
					list.add(str.substring(i, j));
				}
			}
		}
		return list;
	}
}
