package com.arrays;

public class ArraySubString {

	public static void max_sum(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum+=arr[j];
		
				if(sum > max)
				{
					max = sum;
				}
			}
		}
		System.out.println("Max Sum " +max);
	}
	
	public static void max_sum_k_subArray(int arr[],int k)
	{
		int max=0;
		for(int i=0;i<k;i++)
		{
			max+=arr[i];
		}
		for(int i=0;i<=arr.length-k;i++)
		{
			int sum=0;
			for(int j=i;j<i+k;j++)
			{
				sum+=arr[j];
			}
			if(sum > max)
			{
				max = sum;
			}
		}
		System.out.println("Max Sum " +max);
	}
	
	public static void main(String[] args) {
		int arr[] = {-10,-10,-10,-10,-10,-10};
		
		max_sum(arr);
		max_sum_k_subArray(arr, 3);

	}

}
