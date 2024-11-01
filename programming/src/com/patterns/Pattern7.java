package com.patterns;



//a b c d e 
//f g h i j 
//k l m n o 
//p q r s t 
//u v w x y 


public class Pattern7 {
 
	public static void main(String[] args) {
		int data=97;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print((char)data+" "); 
				data++;
			}
			System.out.println();
		}

	}

}
