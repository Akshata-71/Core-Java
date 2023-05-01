/*
Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
*/

import java.util.Scanner;
class MinMax
{
	public static int max(int n1, int n2, int n3)
	{
		int maximum = n1;
		
		if( n2 > maximum )
		{
			maximum = n2;
			System.out.println("Maximum number among the three number is :" + maximum);
		}
		if( n3 > maximum)
		{
			maximum = n3;
			System.out.println("Maximum number among the three number is :" + maximum);
		}

		return maximum;
		
	}

	
	public static int min(int n1, int n2, int n3)
	{
		int minimum = n1;
		if( n2 < minimum )
		{
			minimum = n2;
			
		}
		if( n3 < minimum)
		{
			minimum = n3;
			
		}
		return minimum;
		
	}



	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();	
		int n3 = sc.nextInt();

		int max = max(n1, n2, n3);
		int min = min(n1, n2, n3);		

		System.out.println("MAXIMUM among " +  n1 +" ,"+  n2  +" and"+  n3 +" is " +  max);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("MINIMUM among " + n1  +" ,"+  n2  +" and"+  n3 + " is " +  min); 
	}


	
}


	