import java.util.Scanner;
class Employee
{
	int employeeID;
	double bSalary;
	double incentive;

	public void salaryCalculator()
	{
		double totalSalary = bSalary + incentive;
		if(totalSalary < 25000)
		{
			double hike = totalSalary + (totalSalary * 0.2);
			System.out.println("Employee got Hike of: " + hike);
		}
		else
			System.out.println("Employee total salary is : "+ totalSalary);
	}
}

class Object8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		Employee e1 = new Employee();
		System.out.println("Enter Employee Id " );
		e1.employeeID = sc.nextInt();
		System.out.println("Enter Employee Basic Salary");
		e1.bSalary = sc.nextDouble();
		System.out.println("Employee Incentive");
		e1.incentive = sc.nextDouble();

		e1.salaryCalculator();
		

	}
}