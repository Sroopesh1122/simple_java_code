package com.sort;

import java.util.Arrays;
import java.util.Date;

public class MergeSort // Time Complexity O(nlogn) Best
{
	public static int[] merge(int arr1[],int arr2[],int res[])
	{
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i] < arr2[j])  // this sorts in ascending order to descending order use >
			{
				res[k++] = arr1[i++];
			}else {
				res[k++] = arr2[j++];
			}
		}
		while(i<arr1.length)
		{
			res[k++] = arr1[i++];
		}
		while(j<arr2.length)
		{
			res[k++] = arr2[j++];
		}
		
		
		return res;
	}
	
	public static int[] divide (int []arr)
	{
		if(arr.length ==1)
		{
			return arr;
		}
		int mid = arr.length /2;
		int left[] = new int[mid];
		int right[] = new int[arr.length - mid];
		for(int i=0;i<mid;i++)
		{
			left[i] = arr[i];
		}
		for(int i=mid ;i<arr.length;i++)
		{
			right[i-mid] = arr[i];
		}
		left = divide(left);
		right = divide(right);
		return merge(left, right,arr);
	}
	
	public static void main(String[] args) {
		
		int arr[]= {45,33,7,1,18,17,21,20,8,9,6,5,78,34,234,87,56};	 
		int res[] = divide(arr);
		System.out.println(Arrays.toString(res));
	}
}
