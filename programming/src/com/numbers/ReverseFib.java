package com.numbers;

public class ReverseFib {

	public static void fib(int count,int a,int b)
	{
		if(count == 0)
		{
			return;
		}
		
		 fib(--count ,b,a+b);
		 System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		fib(6,0,1);

	}

}
