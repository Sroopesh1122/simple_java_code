package com.patterns;

//        1 
//      1 2 1 
//    1 2 3 2 1 
//  1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1 


public class Pattern20 {

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
				System.out.print(j+" ");
			}
//			for(int j=1;j<=(i-1);j++)
//			{
//				System.out.print((i-j)+" ");
//			}
			for(int j=(i-1);j>=1;j--)
		     {
					System.out.print(j+" ");
			 }
			
			System.out.println();
		}

	}

}
