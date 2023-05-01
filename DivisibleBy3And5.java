
import java.util.Scanner;

class Testpgm4
{
	public static boolean divisible3(int n)
	{
		if( n%3 == 0)
		{
			System.out.println("Number is Divisible by 3");
			return true;
		}
		else
			System.out.println("Number is Not divisible by 3");
			return false;
	}

	public static boolean divisible5(int n)
	{
		if( n%5 == 0)
		{
			System.out.println("Divisible by 5");
			return true;
		}
		else
			System.out.println("Not divisible by 5");
			return false;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		boolean a = divisible3(num);
		boolean b = divisible5(num);
		
		//System.out.println(a );

		if(a&b == true)
		{
			System.out.println("Number is divisible by 3 and 5");
		}
		else
			System.out.println("Not divisible by 3 and 5");

	}

}