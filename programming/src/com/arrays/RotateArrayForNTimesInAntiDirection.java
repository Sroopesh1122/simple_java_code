package com.arrays;

import java.util.Arrays;

public class RotateArrayForNTimesInAntiDirection
{
	public static void rotate_anti(int arr[])
	{
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1] = arr[i];
		}
		arr[arr.length -1]= temp;

	}
	
	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50};
		
		int count=10001;
		
		for(int i=1;i<=(count%arr.length);i++)
		{
			rotate_anti(arr);
		}
		
		System.out.println(Arrays.toString(arr));
		

	}
}
