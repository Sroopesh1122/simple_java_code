package com.numbers;

//Note : In time complexity the constants are always neglectaded

public class FactorsNumber {

	public static void main(String[] args) {
		int num = 24;
		for (int i = 1; i <= num; i++) { // O(n)
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println();

		for (int i = 1; i <= num / 2; i++) { // O(n/2)
			if (num % i == 0) {
				System.out.println(i);
			}
		}

		System.out.println();

		for (int i = 1; i <= (int) Math.sqrt(num); i++) { // O( squareroot(n))
			if (num % i == 0) {
				System.out.println(i);

			}
		}

		for (int i = (int) Math.sqrt(num); i >= 1; i--) { // O( squareroot(n))
			if (num % i == 0 && i != (num / i)) {
				System.out.println(num / i);
			}
		}
		// The above code will not work for perfect square numbers like 25,16...
		// Time complexity is 2 + squareroot(num)

	}

}
