package com.arrays;

import java.util.Arrays;

public class ReversingArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		
		int res[] = new int[arr.length];
		 
		for (int i = arr.length-1; i >=0 ; i--) {
			
			res[arr.length - 1-i] = arr[i];
		} 
		System.out.println(Arrays.toString(res));

	}

}
