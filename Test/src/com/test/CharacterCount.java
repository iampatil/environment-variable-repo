package com.test;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		String str = "Avinash";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char arr[] = str.toCharArray();
		
		for (char c : arr) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
