package com.patterns;



// Star Daimonds

public class Pattern26 {

	public static void main(String[] args) {
		int rows=10;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("*"+" ");
			} 
			System.out.println();
		}
		
		for(int i=rows-1;i>=1;i--)
		{
			for(int j=1;j<=rows-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("*"+" ");
			} 
			System.out.println();
		}
		

	}

}