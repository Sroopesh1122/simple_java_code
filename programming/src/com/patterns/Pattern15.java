package com.patterns;

// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 

public class Pattern15 {
	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(((i + j) % 2 == 0 ? "1 " : "0 "));
			}
			System.out.println();
		}
	}
}
