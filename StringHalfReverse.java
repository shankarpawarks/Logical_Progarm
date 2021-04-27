package com.string;

public class StringHalfReverse {
	public static void main(String[] args) {
		String str="javas";
		String firstHalf;
		String secondHalf;
		if (str.length()%2==0) {
			 firstHalf = str.substring(0, str.length()/2);
			 secondHalf=str.substring(str.length()/2);
			 System.out.println(secondHalf+firstHalf);
			
		}else {
			 firstHalf = str.substring(0, str.length()/2);
			 char ch=str.charAt(str.length()/2);
			 String midle=String.valueOf(ch);
			 secondHalf=str.substring(str.length()/2+1);
			 System.out.println(secondHalf+midle+firstHalf);
		}
		
	}

}
