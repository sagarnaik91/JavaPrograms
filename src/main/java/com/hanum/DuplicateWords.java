package com.hanum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateWords {
	public static void main(String[] args) {
		String str = "My name is Sagar and my friend name is xyz";
		Map<String, Integer> hashmap = new HashMap<>();
		String[] words = str.split(" ");
		for (String word : words) {
			Integer integer = hashmap.get(word);
			if (integer == null) {
				hashmap.put(word, 1);
			} else {
				hashmap.put(word, integer + 1);
			}
		}
		System.out.println(hashmap);
	

		int max = Collections.max(hashmap.values());
		List<String> keys = new ArrayList<>();
		for (Entry<String, Integer> entry : hashmap.entrySet()) {
			if (entry.getValue() == max) {
				keys.add(entry.getKey());
			}
		}
		System.out.println(keys);
		
	}

}
