/*
A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.
*/


import java.util.Scanner;

class ExternalMethod3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		eligible(age);		

	}


	public static void eligible(int age)
	{
		if(age <= 18)
			System.out.println("Eligible!!!");
		else
			System.out.println("Not Eligible :(");
	}

}