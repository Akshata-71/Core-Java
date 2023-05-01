import java.util.Scanner;

class Rectangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length  : ");
		double len = sc.nextDouble();
		System.out.println("Enter Breadth  :");
		double wid = sc.nextDouble();
		rect(len, wid);
	}

	public static void rect(double l, double b)
	{
		double area = l*b;
		System.out.println("Area of rectangle is  : " + area );
	}
}