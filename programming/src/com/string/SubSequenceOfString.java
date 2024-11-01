package com.string;

public class SubSequenceOfString {
	
	public static void stringSubsequence(String s,String res)
	{
		if(s.length()==0)
		{
			System.out.println(res);
			return;
		}
		stringSubsequence(s.substring(1), res+s.charAt(0));
		stringSubsequence(s.substring(1), res);
	}
 

	public static void main(String[] args) {
		String text="abc";
		stringSubsequence(text,"");
	}

}
