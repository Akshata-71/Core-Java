import java.util.Scanner;
 
class EvenOdd
{

	public static void check(int num)
	{
		if( num%2 == 0)
			Sysetm.out.println("number is EVEN");
		else
			Sysetm.out.println("number is ODD");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter number");
		int l = sc.nextInt();
		
		check(l);
		
	}
}