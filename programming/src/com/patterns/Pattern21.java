package com.patterns;

//        5 
//      5 4 5 
//    5 4 3 4 5 
//  5 4 3 2 3 4 5 
//5 4 3 2 1 2 3 4 5  


//Use reverse maths

public class Pattern21 {

	public static void main(String[] args) {
		
		int rows=5;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=rows;j>=(rows-i+1);j--)
			{
				System.out.print(j+" ");
			}
			for(int j=(rows+2-i);j<=rows;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
