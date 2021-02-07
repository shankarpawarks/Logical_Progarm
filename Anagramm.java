//package com.logicalprogram.beans;

import java.util.Arrays;

public class Anagramm 
{
	public static void main(String[] args) 
	{
		String str="dcab";
		String str1="cbad";
		
		char ch[]=str.toCharArray();
		char ch1[]=str1.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++) {

				if((int)ch[i]>(int)ch[j]){
						char temp=ch[i];	
							ch[i]=ch[j];
							ch[j]=temp;
				}
			}
			
		}
		for(int i=0;i<ch1.length;i++){
			for(int j=i+1;j<ch1.length;j++) {

				if((int)ch1[i]>(int)ch1[j]){
						char temp=ch1[i];	
							ch1[i]=ch1[j];
							ch1[j]=temp;
				}
			}
			
		}

		for(int j=0;j<ch.length;j++){
		System.out.print(ch[j]);
		}
		System.out.println();
		
		for(int j=0;j<ch1.length;j++){
			System.out.print(ch1[j]);
			}
		System.out.println();
		System.out.println(Arrays.equals(ch, ch1));
	}
}
