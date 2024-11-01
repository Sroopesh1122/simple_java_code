package com.numbers;

public class LCM {

	public static int lcm(int a,int b) 
	{
		int max = (a>b) ? a: b;
		for(int i=max;i<= (a*b);i++)
		{
			if(i%a==0 && i%b==0)
			{
				return i;
			}
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		int a=3;
		int b=5;
       
		int lcmres = lcm(a, b);
		if(lcmres != 0 )
		{
			System.out.println(lcmres);
		}else {
			System.out.println("No LCM");
		}

	}

}
