package com.patterns;

//    A 
//  A B A 
//A B C B A 
//  A B A 
//    A 

public class Pattern38 {

	public static void main(String[] args) {
		int rows=3;
		int charStart=64;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=(rows-i);j++)
			{
				System.out.print("  "); 
			}
			for(int j=1;j<=i;j++)  
			{
				System.out.print((char)(charStart+j)+" "); 
			}
			for(int j=i-1;j>=1;j--)  
			{
				System.out.print((char)(charStart+j)+" "); 
			}
			System.out.println();
		}
		for(int i=rows-1;i>=1;i--)
		{
		for(int j=1;j<=(rows-i);j++)
		{
			System.out.print("  "); 
		}
		for(int j=1;j<=i;j++)  
		{
			System.out.print((char)(charStart+j)+" "); 
		}
		for(int j=i-1;j>=1;j--)  
		{ 
			System.out.print((char)(charStart+j)+" "); 
		}
		System.out.println();
		}

	}

}
