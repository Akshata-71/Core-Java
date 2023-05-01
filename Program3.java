import java.util.Scanner;
class Emp
{
	public void bonus(double s, double y)
	{
		if(y >= 5)
		{
			double hike = s * 0.5;
			double incr = s + hike;
			System.out.println("Employee got bonus :" + hike);
		}
		else
		{
			System.out.println("Not Eligible");
		}	
	}
}


class Expi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary of employee");
		double sal = sc.nextDouble();

		System.out.println("Enter years of service of employee");
		double year = sc.nextDouble();

		new Emp().bonus(sal, year);		
		
	}
}