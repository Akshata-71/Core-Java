import java.util.Scanner;

class Employee
{
	String name;
	double salary;

	public void accept()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of employee");
		name = sc.nextLine();
		System.out.println("Enter salary of employee");
		salary = sc.nextDouble();
		System.out.println("------------------------------------");
		
	}


	public void show()
	{
		System.out.println("-------Employee Data--------");
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}

	
}

class Object6
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Employee e2 =  new Employee();
		
		e1.accept();
		e2.accept();

		e1.show();
		e2.show();
		
	



	}
}