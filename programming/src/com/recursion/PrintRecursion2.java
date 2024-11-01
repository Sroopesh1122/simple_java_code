package com.recursion;

public class PrintRecursion2 {

	public static int print_num(int num)
	{
		if(num==0)
		{
			return num;
		}
		System.out.println(num);
		return print_num(num-1);
		
	}
	
	public static void main(String[] args) {
		int num=5;
		int res= print_num(num);
		System.out.println(res);

	}

}
