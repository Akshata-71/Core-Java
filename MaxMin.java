/*
Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
*/

import java.util.Scanner;
class MinMax
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();	
		int n3 = sc.nextInt();

		max(n1, n2, n3);


	}


}


	public static void max(int n1, int n2, int n3)
	{
		if( n1 > n2 )
			System.out.println("Maximum number among the three number is :" + n1);
		
		else if( n2 > n3)
			System.out.println("Maximum number among the three number is :" + n2);
		
		else if( n3 > n1 )
			System.out.println("Maximum number among the three number is :" + n3);
		
}

	}