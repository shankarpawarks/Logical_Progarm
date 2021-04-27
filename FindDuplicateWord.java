package com.string;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWord {
	public static void main(String[] args) {
		String str="one two three four five one one ";
		
		String words[]=str.split(" ");
		
		Set< String> dupset=new HashSet<String>();
		Set<String> set=new HashSet<String>();
		
		for (String string : words) {
			
				Boolean bol=set.add(string);
					
					if (!bol) {
						dupset.add(string);
						
					}
		}
		
		System.out.println(dupset);
		
		
		
		
		}
	}


