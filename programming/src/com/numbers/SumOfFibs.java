package com.numbers;

public class SumOfFibs
{
	public static int fib(int count,int a,int b,int res)
	{
		if(count == 0)
		{
			return res;
		}
		return fib(--count ,b,a+b,res+a);
	}
	
  public static void main(String[] args) {
   System.out.println(fib(6, 0, 1,0));	
}
}
