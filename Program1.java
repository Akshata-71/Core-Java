import java.util.Scanner;


class Attendence 
{
	public static void exam(double h, double a)
	{
		double x = a/h;
		double y = x*100;

		if(y >= 70)
		{
			System.out.println("Student is " + y + "%");
			System.out.println("Student is allowed to sit in Exam!!");
		}
		else
			System.out.println("Student is NOT allowed to sit in Exam!!");
	}



	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of classes attend");
		double attend = sc.nextDouble();
		System.out.println("Enter number of classes held");
		double held = sc.nextDouble();
		exam(held, attend);
	}

}