package com.numbers;

public class PallindromeNumber {

	public static int reverse(int num) {
		int res = 0;
		while (num != 0) {
			int rem = num % 10;
			res = (res * 10) + rem;
			num = num / 10;
		}
		return res;
	}

//	public static void main(String[] args) {
//		int num = 1223221;
//		if (num == reverse(num)) {
//			System.out.println("It's pallindrome");
//		} else {
//			System.out.println("It's not");
//		}
//
//	}
	
	
	public static void main(String[] args) {
	for (int i = 1; i <=10000; i++) {
		int num = i;
		if (num == reverse(num)) {
			System.out.println(i);
		}
	}

}

}
