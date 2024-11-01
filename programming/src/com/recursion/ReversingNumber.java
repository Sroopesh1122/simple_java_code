package com.recursion;

public class ReversingNumber {
	
	public static int reverse(int num,int res)
	{
		if(num ==0 )
		{
			return res;
		}
		return reverse(num/10,(res*10 + num%10));
	}
	

	public static void main(String[] args) {
	 
		System.out.println(reverse(3456,0));

	}

}
