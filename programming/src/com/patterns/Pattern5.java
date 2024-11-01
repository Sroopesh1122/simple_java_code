package com.patterns;


//11 12 13 14 15 
//16 17 18 19 20 
//21 22 23 24 25 
//26 27 28 29 30 
//31 32 33 34 35


public class Pattern5 {

	public static void main(String[] args) {
		int data=11;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(data+" "); 
				data++;
			}
			System.out.println();
		}

	}

}
