import java.util.Scanner;
class Student3
{
	

	public void display(String s, int i, double d)
	{
		System.out.println(**********Displaying********);
		System.out.println("Student name : " + s);
		System.out.println("Student Roll No" +i);
		System.out.println("Student marks" + d);
	}

	public void accept()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter roll number");
		int rno = sc.nextInt();
		System.out.println("Enter marks");
		double marks = sc.nextDouble();	
	}
}

class Object5
{
	public static void main(String[] args)
	{
		
	
		Student3 s1 = new Student3();
		s1.accept();
		s1.display(name, rno, marks);

		
	}

}