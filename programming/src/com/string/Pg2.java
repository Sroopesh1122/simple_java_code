package com.string;

import java.util.Arrays;

public class Pg2 {

//	check for Anagram
	
	public static void main(String[] args) {
		String a="silent";
		String  b="listen";
		
		char [] arr1 = a.toCharArray();
		char [] arr2 = b.toCharArray();
		
		Arrays.sort(arr2);
		Arrays.sort(arr1);
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Anagram");
		}else {
			System.out.println("is not");
		}
		

	}

}
