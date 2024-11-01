package com.patterns;

//A 
//b C 
//d E f 
//G h I j 
//K l M n O 

public class Pattern40 { 

	public static void main(String[] args) {
		int rows = 5;
		int k = 1;
		int charStart = 64;
		int smallCharStart = 96;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((k % 2 == 1 ? (char) (charStart + k) : (char) (smallCharStart + k)) + " ");
				k++;
			}
			System.out.println();
		}

	}

}