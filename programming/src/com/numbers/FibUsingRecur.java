package com.numbers;

public class FibUsingRecur {

	public static void fib(int count,int a,int b)
	{
		if(count == 0)
		{
			return;
		}
		System.out.println(a);
		 fib(--count ,b,a+b);
	}
	
	
	public static void main(String[] args) {
		fib(6,0,1);
	}

}
