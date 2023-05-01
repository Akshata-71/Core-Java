import java.util.Scanner;

class Shape1
{
	public static void shape(int len , int wid)
	{
		if(len == wid)
			System.out.println("Shape is square");
		else
			System.out.println("Shape is Rectangle");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter length");
		int l = sc.nextInt();
		System.out.println("Enter width");
		int w = sc.nextInt();

		shape(l,w);
	}
}