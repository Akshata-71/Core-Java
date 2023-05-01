import java.util.Scanner;

class Divisible 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();

		if( number%3 == 0)
		{
			System.out.println("Number is divisible by 3...");
		}else{
			System.out.println("Number is not divisible by 3...");
		}
	}	
}