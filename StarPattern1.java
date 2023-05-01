/*

****
****
****
****

*/


import java.util.Scanner;

class StarPattern1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of lines : ");
		int line = sc.nextInt();

		System.out.println("Enter number of star : ");
		int star = sc.nextInt();

		for(int a=0 ; a<line ; a++)
		{
			for(int b=0 ; b<star ; b++)
			{
				System.out.print("*");

			}
			
			System.out.println();

		}


	}

}