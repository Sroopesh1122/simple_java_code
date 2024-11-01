package com.search;

public class LinearSearch {

	public static int linear_search(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == key)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,77,3,66,54,78,98};
		
		int key=77;
		if(linear_search(arr, key) == -1)
		{
			System.out.println(key + " Not found");
		}
		else {
			System.out.println("Key Found");
		}
		
		

	}

}
