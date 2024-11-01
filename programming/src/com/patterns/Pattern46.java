package com.patterns;


//A B C D E 
//B       F 
//C       G 
//D       H 
//E F G H I 

public class Pattern46 {

	public static void main(String[] args) {
		int rows=5;
		for (int i = 1; i <=rows; i++) {
			int k=i;
			for(int j=1;j<=rows;j++)
			{
				if(i==1|| i==rows||j==1||j==rows)
				{
					System.out.print((char)(k+64)+" ");
					
				}
				else {
					System.out.print(" "+" ");
				}
				k++;
			}
			System.out.println();
		}

	}

}
