import java.util.Scanner;

class Circle
{
	public void area(double r)
	{
		double a = 3.14 * r * r;
		System.out.println("Area of circle is : " + a); 
	}


	public void circum(double r)
	{
		double c = 2 * 3.14 *  r;
		System.out.println("Circumference  of circle is : " + c); 
	}

}

class Object2
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your choice");
	int ch = new Scanner(System.in).nextInt();
	System.out.println("1. Area");
	System.out.println(2. Circumference);

	System.out.println("Enter radius : ");
	double r = sc.nextDouble();

	switch(ch)
	{
		case 1 : new Circle().area(r);
		break;

		case 2 : new Circle().circum(r);
		break;

		default();
	}

}