/* Define a program to find out whether a given number is even or odd */
import java.util.Scanner;

class ExternalMethod2
{
	public static void main(String args[] )
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int number = sc.nextInt();

		evenOdd(number);

	}

	public static void evenOdd(int num)
	{
		if(num%2 == 0)
			System.out.println("Entered number is EVEN");
		else
			System.out.println("Entered number is ODD");

	}


}