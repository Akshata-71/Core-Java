/*

* * * *
* * *
* *
*

*/

import java.util.Scanner;

class StarPattern2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of lines : ");
		int line = sc.nextInt();

		System.out.println("Enter number of star : ");
		int star = sc.nextInt();

		for(int i=0 ; i<line ; i++)
		{
			for(int j=0 ; j<star ; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			star--;
		}

	}
}