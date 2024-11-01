package com.patterns;


//   * *   * *   
// *     *     *  
//  *  C S K   * 
//   *       *   
//     *   *     
//       *       

public class Pattern48 {

	public static void main(String[] args) {
		int rows = 6;
		int cols=7;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if ((i==1 && j%3 ==0 )|| (i==0 && j%3!=0) || (i-j==2) || (i+j==8)) {
					System.out.print("*" + " ");
				} 
				else if(i==2 && j==2)
				{
					System.out.print("C" + " ");
				}
				else if(i==2 && j==3)
				{
					System.out.print("S" + " ");
				}
				else if(i==2 && j==4)
				{
					System.out.print("K" + " ");
				}
				else { 
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		
		

	}

//	    public static void main(String[] args) {
//	        int n = 30;  // Adjust size if needed
//
//	        // Upper part of the heart
//	        for (int i = n / 2; i <= n; i += 2) {
//	            // Print spaces before the first part of the heart
//	            for (int j = 1; j < n - i; j += 2) {
//	                System.out.print("  ");
//	            }
//	            
//	            // Print the first part of the heart
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("* ");
//	            }
//	            
//	            // Print the spaces in the middle of the heart
//	            for (int j = 1; j <= n - i; j++) {
//	                System.out.print("  ");
//	            }
//	            
//	            // Print the second part of the heart
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("* ");
//	            }
//	            
//	            System.out.println();
//	        }
//
//	        // Lower part of the heart
//	        for (int i = n; i >= 1; i--) {
//	            // Print spaces before the lower part of the heart
//	            for (int j = i; j < n; j++) {
//	                System.out.print("  ");
//	            }
//	            
//	            // Print the lower part of the heart
//	            for (int j = 1; j <= (i * 2) - 1; j++) {
//	                System.out.print("* ");
//	            }
//	            
//	            System.out.println();
//	        }
//	        
//	        
//	    }
//	    
	}


