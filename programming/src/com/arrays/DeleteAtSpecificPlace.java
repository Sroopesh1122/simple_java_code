package com.arrays;

import java.util.Arrays;

public class DeleteAtSpecificPlace {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		int index = 2;

		int res[] = new int[arr.length - 1];

		for (int i = 0; i < index; i++) {
			res[i] = arr[i];
		}
		for (int i = index+1; i < arr.length; i++) {
			res[i - 1] = arr[i];
		}

		System.out.println(Arrays.toString(res));

	}

}
