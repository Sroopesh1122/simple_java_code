package com.string;

public class P3 {

	public static String modify1(String s)
	{
		String data1="";
		String data2 = "";
		int i=0;
		while(i<s.length())
		{
			if(s.charAt(i) == '#')
			{
				data1+='#';
			}else {
				data2+=s.charAt(i);
			}
			i++;
		}
		return data1+data2;
		
	}
	
	public static String modify2(String s)
	{
		String data1 = "";
		int i=0;
		while(i<s.length())
		{
			if(i%2==0)
			{
				data1+=s.charAt(i);
			}else {
               int  no = Integer.parseInt(s.charAt(i)+"");
               
               for(int j=0;j<no-1;j++)
               {
            	   data1+=s.charAt(i-1);
               }
               
			}
			i++;
		}
		return data1;
		
	}
	
	public static String modify3(String s)
	{
		String data1 = "";
		
		int i=0;
		while(i<s.length())
		{
			char ch = s.charAt(i);
			int no = 0;
			int j=i;
			while((j<s.length() && s.charAt(j) == ch))
			{
				no++;
				j++;
			}
			
			data1+=s.charAt(i);
			data1=data1+no;
			i=j;
		}
	
		return data1;	
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(modify1("Move#hash#to#first"));
		System.out.println(modify2("a2b4c4e2f"));
		System.out.println(modify3("aabbbbcccceef"));

	}

}
