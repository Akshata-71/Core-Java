import java.util.Scanner;

class Rectangle
{
	static public double areaOfRectangle(double l, double w)
	{
		double area = l * w;

		return area;

	}
		


}




class Testpgm3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		

		System.out.println("Eneter Length : ");
		double length = sc.nextInt();

		System.out.println("Eneter Width : ");
		double width = sc.nextInt();


		double area = Rectangle.areaOfRectangle(length, width);
		System.out.println("Area of rectangle is : " + area);

	}


}