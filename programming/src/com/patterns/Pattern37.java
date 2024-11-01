package com.patterns;

//
//    E 
//  E D E 
//E D C D E 
//  E D E 
//    E 
    
public class Pattern37 {

	public static void main(String[] args) {
		int rows=5;
		int charStart = 65+rows;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=(rows-i);j++)
			{
				System.out.print("  "); 
			}
			for(int j=1;j<=i;j++)  
			{
				System.out.print((char)(charStart-j)+" "); // ASCII value of E = 69 add 1 s
			}
			for(int j=i-1;j>=1;j--)  
			{
				System.out.print((char)(charStart-j)+" "); 
			}
			System.out.println();
		}
		for(int i=rows-1;i>=1;i--)
		{
		for(int j=1;j<=(rows-i);j++)
		{
			System.out.print("  "); 
		}
		for(int j=1;j<=i;j++)  
		{
			System.out.print((char)(charStart-j)+" "); 
		}
		for(int j=i-1;j>=1;j--)  
		{ 
			System.out.print((char)(charStart-j)+" "); 
		}
		System.out.println();
		}

	}

}
