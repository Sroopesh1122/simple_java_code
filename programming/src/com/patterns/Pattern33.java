package com.patterns;

public class Pattern33 {

	public static void main(String[] args) {
		int rows=5;
		int k=1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+k);
				k--;
			}
			k=k+(2*i)+1;
			System.out.println();
		}

	}

}

//1
//3 2
//6 5 4
//10 9 8 7
//15 14 13 12 11
