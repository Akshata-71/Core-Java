import java.util.Scanner;

class Theatre
{
	int availableTicket = 100;


	public void bookTicket(int number)
	{

		if( number <= availableTicket )
		{	
			int bill = number * 50;
			availableTicket = availableTicket - number;

			System.out.println("Your bill is : " + bill);
			displayTicket();	                              // METHOD CHAINING
	
		}
		else
			System.out.println("ONLY 100 TICKETS ARE AVAILABLE !!!!");

	}
	


	public void cancelTicket(int number)
	{
		availableTicket = availableTicket + number;
		displayTicket();                                 // METHOD CHAINING
			
	}

	public void displayTicket()
	{
		System.out.println("Available tickets are -->" + availableTicket);
	}

}




class TicketApp{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Theatre t1 = new Theatre();

		System.out.println("******Options********");
		System.out.println("1 . BOOK TICKET");
		System.out.println("2 . CANCEL TICKET");
		System.out.println("3 . DISPLAY TICKET");

		System.out.println("Select any option .....");
		int ch = sc.nextInt();

		switch(ch)
		{
			case 1 : 
					System.out.println("Enter how many tickects to be book");
					int number = sc.nextInt();
					t1.bookTicket(number);
					break;

			case 2 :
					System.out.println("Enter how many tickects to be cancel");
					number = sc.nextInt();
					t1.cancelTicket(number);
					break;	

			case 3: 
					t1.displayTicket();
					break;


			default : 
					System.out.println("You've entered invalid option");

		}
	
	}

}


