import java.util.Scanner;

class WithoutModulusEvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		int a = n/2;
		int b = a*2;

		if(n == b)
			System.out.println("Number is EVEN");
		else
			System.out.println("Number is ODD");
	}
}