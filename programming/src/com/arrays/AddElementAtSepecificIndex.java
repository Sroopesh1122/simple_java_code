package com.arrays;

import java.util.Arrays;

public class AddElementAtSepecificIndex {

	public static void main(String[] args) {
	
		int[] arr= {10,20,30,40,50};
		
		int index=2;
		int ele = 25;
		String sr="SHivu";
		
		int res[] = new int[arr.length+1];
		
		for(int i=0;i<index;i++)
		{
			res[i] = arr[i];
		}
		res[index] = ele;
		for(int i=index;i<arr.length;i++)
		{
			res[i+1] = arr[i];
		}
		
		System.out.println(Arrays.toString(res));
		

	}

}
