import java.util.Scanner;

class OldestYoungest
{

	public static void compare(int a1, int a2, int a3)
	{
		if(a1 < a2)
		{
			System.out.println("Person with age " + a1 + " is younger");
		}
		else
		{
			System.out.println("Person with age " + a1 + " is elder");
		}	
		 if(a2 < a3)
		{
			System.out.println("Person with age " + a2 + " is younger");
		}
		else
		{
			System.out.println("Person with age " + a2 + " is elder");
		}
		 if(a3 < a1)
		{
			System.out.println("Person with age " + a3 + " is younger");	
		}
		else
		{
			System.out.println("Person with age " + a3 + " is elder");
		}
	}	



	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age of person1");
		int age1 = sc.nextInt();

		System.out.println("Enter age of person2");
		int age2 = sc.nextInt();

		System.out.println("Enter age of person3");
		int age3 = sc.nextInt();

		compare(age1, age2, age3);

	}
}