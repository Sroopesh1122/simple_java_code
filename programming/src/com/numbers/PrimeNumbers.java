package com.numbers;

public class PrimeNumbers {

	public static int check_fact(int num) {
        int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count;
	}
	
//	to check only
//
//	public static void main(String[] args) {
//		int num=7;
//			if (check_fact(i) == 2) {
//				System.out.println("It is prime");
//			} else {
//				System.out.println("Not prime");
//			
//		}
//
//	}
	
	//To print all prime numbers between range
	
	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
			if (check_fact(i) == 2) {
				System.out.println(i);
			}
		}

	}

}
