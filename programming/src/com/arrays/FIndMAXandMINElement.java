package com.arrays;


public class FIndMAXandMINElement {

	public static int findMax(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max= arr[i];
			}
		}
		
		return max;

	}
	
	public static int findMin(int arr[])
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				min= arr[i];
			}
		}
		
		return min;

	}
	
	public static void main(String[] args) {
		
		int[] arr= {-2000,-10,-20,-30,-40,-50,-1300};
		
		
//		System.out.println(findMin(arr));
		System.out.println(findMax(arr));
		

	}

}
