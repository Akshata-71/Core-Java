 /*




*/


import java.util.Scanner;

class StarPattern5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of lines : ");
		int line = sc.nextInt();

		int star = 1;

		int space = line - star;


		for(int i=0 ; i<line ; i++)
		{
			for(int j=0 ; j<space ; j++)
			{
				System.out.print("  ");

			}	
	
			for(int k=0 ; k<star ; k++)
			{
				System.out.print("* ");

			}
		System.out.println();
		star++;
		space--;


		}
		
		star = 3;
		
		for(int a=1 ; a<line ; a++)
		{
			for(int b=0 ; b<star ; b++)

		}

	}




} 