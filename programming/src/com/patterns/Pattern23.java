package com.patterns;


//        5 
//      4 5 4 
//    3 4 5 4 3 
//  2 3 4 5 4 3 2 
//1 2 3 4 5 4 3 2 1 


//To make it's mirror image just we need to swap the starting and ending condition in i-th for loop



public class Pattern23{

	public static void main(String[] args) {
		int rows=5;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=(rows+1-i);j<=rows;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=rows-1;j>=(rows+1-i);j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//Prints mirror images of above code
		for(int i=rows;i>=1;i--)
		{
			for(int j=1;j<=rows-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=(rows+1-i);j<=rows;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=rows-1;j>=(rows+1-i);j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
