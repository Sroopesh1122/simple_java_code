package com.numbers;

//First column odd number and 2nd column even numbers

public class EvenNumbers {

	public static void main(String[] args) {
		int n=20;
		for (int i = 1; i <=n; i++) {
			if(i%2 != 0)
			{
				System.out.print(i+" ");
			}else {
				System.out.println(i);
			}
			
		}

	}

}
