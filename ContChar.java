package com.string;

import java.util.HashMap;
import java.util.Map;

public class ContChar {
	public static void main(String[] args) {
		String str="shankar";
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for (char c : charArray) {
			if (!map.containsKey(c)) {
				
				map.put(c, 1);
				
			}else {
				
						Integer integer = map.get(c);
						Integer put = map.put(c, integer+1);
				
			}
		}
		System.out.println(map);
		
	}

}
