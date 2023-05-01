import jav.util.Scanner;

class Student4
{
	int rollno;
	String name;
	double marks;


	Student(int rollno, String name, double marks)
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;

	}

	public void display()
	{
		System.out.println("STUDENT ROLLNO : "+rollno);
		System.out.println("STUDENT NAME   : "+name);
		System.out.println("STUDENT MARKS  :"+marks);
	
	}



}

class MainApp1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------MENU----------");
		System.out.println("1. Display student details");
		System.out.println("2. Highest Score");
		System.out.println("3. Lowest")


	}	


}