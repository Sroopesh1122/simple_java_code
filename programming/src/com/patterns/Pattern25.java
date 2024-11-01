package com.patterns;


//        A 
//      B A B 
//    C B A B C 
//  D C B A B C D 
//E D C B A B C D E 


public class Pattern25 {

	public static void main(String[] args) {
		int rows=5;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(64+j)+" ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=i+1;j<=rows;j++)
			{
				System.out.print((char)(65+rows-j)+" ");
			}
			for(int j=rows-1;j>=i+1;j--)
			{
				System.out.print((char)(65+rows-j)+" ");
			}
			System.out.println();
		}

	}

}


//In Daimond Shape

//
//
//A 
//B A B 
//C B A B C 
//D C B A B C D 
//E D C B A B C D E 
//F E D C B A B C D E F 
//G F E D C B A B C D E F G 
//H G F E D C B A B C D E F G H 
//I H G F E D C B A B C D E F G H I 
//J I H G F E D C B A B C D E F G H I J 
//K J I H G F E D C B A B C D E F G H I J K 
//L K J I H G F E D C B A B C D E F G H I J K L 
//M L K J I H G F E D C B A B C D E F G H I J K L M 
//N M L K J I H G F E D C B A B C D E F G H I J K L M N 
//O N M L K J I H G F E D C B A B C D E F G H I J K L M N O 
//P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P 
//Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q 
//R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R 
//S R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R S 
//T S R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R S T 
//U T S R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R S T U 
//V U T S R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R S T U V 
//W V U T S R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R S T U V W 
//X W V U T S R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R S T U V W X 
//Y X W V U T S R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R S T U V W X Y 
//Z Y X W V U T S R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//Y X W V U T S R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R S T U V W X Y 
//X W V U T S R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R S T U V W X 
//W V U T S R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R S T U V W 
//V U T S R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R S T U V 
//U T S R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R S T U 
//T S R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R S T 
//S R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R S 
//R Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q R 
//Q P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P Q 
//P O N M L K J I H G F E D C B A B C D E F G H I J K L M N O P 
//O N M L K J I H G F E D C B A B C D E F G H I J K L M N O 
//N M L K J I H G F E D C B A B C D E F G H I J K L M N 
//M L K J I H G F E D C B A B C D E F G H I J K L M 
//L K J I H G F E D C B A B C D E F G H I J K L 
//K J I H G F E D C B A B C D E F G H I J K 
//J I H G F E D C B A B C D E F G H I J 
//I H G F E D C B A B C D E F G H I 
//H G F E D C B A B C D E F G H 
//G F E D C B A B C D E F G 
//F E D C B A B C D E F 
//E D C B A B C D E 
//D C B A B C D 
//C B A B C 
//B A B 
// A 




