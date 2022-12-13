package com.hanum;

import java.util.HashMap;

public class CountofChars {

	public static void main(String[] args) {
		String str = "aabbbccdd";
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		char[] strArray = str.toCharArray();
		for (char c : strArray) {
			Integer integer = hashmap.get(c);
			if (integer == null) {
				hashmap.put(c, 1);
			} else {
				hashmap.put(c, integer + 1);
			}
		}
		System.out.println(hashmap);

	}
}
