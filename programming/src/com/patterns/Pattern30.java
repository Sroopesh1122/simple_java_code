package com.patterns;

//5 4 3 2 1 2 3 4 5 
//  5 4 3 2 3 4 5 
//    5 4 3 4 5 
//      5 4 5 
//        5 

public class Pattern30 {

	public static void main(String[] args) {
		int rows=5;
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=rows;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=i+1;j<=rows;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
