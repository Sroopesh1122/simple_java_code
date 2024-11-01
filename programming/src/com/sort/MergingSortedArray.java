package com.sort;

import java.util.Arrays;

public class MergingSortedArray {

	public static int[] merge(int arr1[],int arr2[],int res[])
	{
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i] < arr2[j])
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
	
	public static void main(String[] args) {
		
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {9,15,21,31,45};
		int res[] = new int[arr1.length + arr2.length];
		System.out.println(Arrays.toString(merge(arr1, arr2, res)));
	}

}
