import java.util.Scanner;

class Student1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A) Add Student");
		System.out.println("B) Update Student");	
		System.out.println("C) Delete Student");
		System.out.println("D) Display Student");	
		char ch = sc.next().charAt(0);
 		switch(ch)
		{
			case 'A' :
				System.out.println("Adding student..."); 
				break;
	
			case 'B' :
				System.out.println("Updating student..."); 
				break;

			case 'C' :
				System.out.println("Deleting student..."); 
				break;

			case 'D' :
				System.out.println("Displaying student..."); 
				break;

			default :
				System.out.println("Invalid input");		
		}
	}


}