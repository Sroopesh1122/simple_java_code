package com.numbers;

public class HCF {

	
	public static int hcf_bruteforce(int a,int b) //Time complexity O(min(a,b))
	{
		int small = (a<b) ? a: b;
		int cf=1;
		for(int i=1;i<=small;i++)
		{
			if(a%i==0 && b%i==0)
			{
				cf=i;
			}
		}
		return cf;
	}
	
	
	public static int hcf_eculied(int a,int b) //Time complexity O(max(a,b))
	{
		while( a!= b )
		{
			if(a>b)
			{
				a=a-b;
			}else {
				b=b-a;
			}
		}
		return b;
		
	}
	
	public static int hcf_gabriel_lame(int a,int b) 
	{
		while( a!=0 && b!=0)
		{
			if(a>b)
			{
				a=a%b;
			}else {
				b=b%a;
			}
		}
		return (a!=0) ? a : b;
		
	}
	
	
	public static int hcf_bruteforce(int a,int b,int c) //Time complexity O(min(a,b,c))
	{
		int small = (a<b) ? a: (b<c) ? b : c;
		int cf=1;
		for(int i=1;i<=small;i++)
		{
			if(a%i==0 && b%i==0 && c%i==0)
			{
				cf=i;
			}
		}
		return cf;
	}
	
	
	public static void main(String[] args) {
		
		int a=24;
		int b=18;
		int c=4;
		
		System.out.println("HCF is "+hcf_bruteforce(a, b));
		System.out.println("HCF is "+hcf_bruteforce(a, b,c));
		
		System.out.println("HCF is "+hcf_eculied(a, b));

	
	}

}
