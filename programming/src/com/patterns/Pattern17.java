package com.patterns;

//        5 
//      5 4 
//    5 4 3 
//  5 4 3 2 
//5 4 3 2 1 



public class Pattern17 {

	public static void main(String[] args) {
		int rows=5;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((rows-j+1)+" ");
			}
			
			System.out.println();
		}

	}

}
