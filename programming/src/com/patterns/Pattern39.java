package com.patterns;


//    3 
//  3 2 3 
//3 2 1 2 3 
//  3 2 3 
//    3 

public class Pattern39 {

	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= (rows - i); j++) {
				System.out.print("  ");
			}
			for (int j = rows; j >= rows + 1 - i; j--) {
				System.out.print(j + " ");
			}
			for (int j = rows + 2 - i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = rows - 1; i >= 1; i--) {
			for (int j = 1; j <= (rows - i); j++) {
				System.out.print("  ");
			}
			for (int j = rows; j >= rows + 1 - i; j--) {
				System.out.print(j + " ");
			}
			for (int j = rows + 2 - i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
