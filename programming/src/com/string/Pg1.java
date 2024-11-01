package com.string;

public class Pg1 {
	
	//Reverse the given String

	public static void main(String[] args) {
		String name ="Space";
		String res="";
		for(int i=0;i<name.length();i++)
		{
			res = name.charAt(i) + res;
		}
		
		System.out.println(res);

	}

}
