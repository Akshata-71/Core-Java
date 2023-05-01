/*
Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also,
1! = 1
0! = 0

*/

import java.util.Scanner;
class ExternalMethod9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		

		System.out.println("Enter numberto find its Factorial : ");
		int number = sc.nextInt();

		factorial(number);

	}


	public static void factorial(int n)
	{
		int a = 0;
		if(n == 0)
		{
			System.out.println("Factorial is : " + n);

		}else if(a <= n)
			{
				int factorial = a * (a+1);
				System.out.println("Factorial is : " + factorial);
				factorial(a+1);
			}


	}

}


