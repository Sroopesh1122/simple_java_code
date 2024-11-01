package com.arrays;

import java.util.Arrays;

public class RotateNInClockDirection {

	public static void rotate_anti(int arr[])
	{
		int temp=arr[arr.length-1];
		for(int i=arr.length -2;i>=0;i--)
		{
			arr[i+1] = arr[i];
		}
		
		arr[0]= temp;

	}
	
	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50};
		
		int count=2;
		
		for(int i=1;i<=(count%arr.length);i++)
		{
			rotate_anti(arr);
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}
