package com.patterns;


//11 
//12 13 
//14 15 16 
//17 18 19 20 
//21 22 23 24 25 



public class Pattern11 {

	public static void main(String[] args) {
		int rows=5;
		int k=11;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((k++)+" ");
			}
			
			System.out.println();
		}
	}

}
