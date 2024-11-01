package com.search;

public class BinarySearch {

	public static int binary_search(int arr[],int key)
	{
		int low=0;
		int high=arr.length-1;
		
		
		while(low<=high)
		{
			int mid= (low+high)/2;
			if(arr[mid] == key)
			{
				return mid;
			}
			else if(key < arr[mid])
			{
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {98,78,77,54,3,1};
		
		int key=78;
		int res = binary_search(arr, key);
		
		//  Array must be sorted
		
		if(res ==-1)
		{
			System.out.println(key + " Not found");
		}
		else {
			System.out.println(key +" Key Found at "+res);
		}
		
		

	}

}
