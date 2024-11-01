package com.patterns;

//1 
//2 3 
//4 5 6 
//7 8 9 11 
//22 33 44 55 66 
//77 88 99 101 111 121 
//131 141 151 161 171 181 191 
//202 212 222 232 242 252 262 272 
//282 292 303 313 323 333 343 353 363 

public class Pattern42 {

	public static int reverse(int num) {
		int temp = num;
		int res = 0;
		while (num != 0) {
			int rem = num % 10;
			res = (res * 10) + rem;
			num = num / 10;
		}
		if(res == temp)
		{
			return res;
		}else {
			return reverse(num++);
		}
		
	}

//public static void main(String[] args) {
//		int rows = 11;
//		int k = 1;
//		for (int i = 1; i <= rows; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(k + " ");
//				if (k < 9) {
//					k++;
//				} else if (k % 10 == 9) {
//					k = k + 2;
//				} else {
//					if (k > 100) {
//						if (k % 100 >= 90 && k % 100 < 100) // if number if *9* i need to add 11 else 10;
//						{
//							k = k + 11;
//						} else {
//							k = k + 10;
//						}
//					}
//					else { // for < 100 we need to add 11
//						k = k + 11;
//					}
//
//				}
//
//			}
//			System.out.println();
//		}
//
//	}

	public static void main(String[] args) {

		int count=1;
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j < i; j++) {
				count= reverse(count);
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}

//1 - 9  => k++ ,if k=9 add 2 to it
//11 - 99 => k=k+11 if k == 99 add 2 to it
//101 - 191 => k=k+10 if k ==191 add 11 to it
//202  - 292 => k=k+10 if k == 292 add 11 to it
