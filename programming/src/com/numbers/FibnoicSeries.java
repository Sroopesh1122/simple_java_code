package com.numbers;

import java.util.Date;

public class FibnoicSeries {

	public static void main(String[] args) {
		int num=5;
		int a=0;
		int b=1;
		int res;
		while(num>=0)
		{
			System.out.println(a);
			res=a+b;
			a=b;
			b=res;
			num--;
		}
		
		System.out.println(new Date());
		

	}

}
