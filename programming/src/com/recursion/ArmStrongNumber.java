package com.recursion;

public class ArmStrongNumber {
	
	public static int count_digit(int num  )
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
	
	public static int armstrong(int num,int res,int count)
	{
		if(num == 0)
		{
			return res;
		}
		return armstrong(num / 10 ,( res + (int) Math.pow(num % 10, count)),count);
	} 
	

	public static void main(String[] args) {
		
		int num = 1741725;
		
		int res = armstrong(num, 0,count_digit(num));
		
		if(res==num)
		{
			System.out.println("yes it's armstrong");
		}else {
			System.out.println("no it's not");
		}
          
	}

}
