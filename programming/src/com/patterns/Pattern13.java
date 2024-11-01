package com.patterns;



// Rectangle
// * * * * * * * * * * 
// *                 * 
// *                 * 
// *                 * 
// * * * * * * * * * * 


public class Pattern13 {

	public static void main(String[] args) {
		int length=10;
		int breadth = 5;
		for(int i=1;i<=breadth;i++)
		{
			for(int j=1;j<=length;j++)
			{
				if((i==1 || i == breadth) || (j==1 || j==length))
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
					
			}
			
			System.out.println();
		}

	}

}
