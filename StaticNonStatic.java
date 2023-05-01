import java.util.Scanner;

class BillCalculator
{
	public static void commercialBill(double previous_reading, double current_reading)
	{
		double diff =  current_reading - previous_reading;
		double bill = diff * 8;
		System.out.println("Commercial bill is " + bill + "Rs/units");

	}

	public void residentialBill(double previous_reading, double current_reading)
	{
		double diff =  current_reading - previous_reading;
		double bill = diff * 12;
		System.out.println("Residential bill is " + bill + "Rs/units");
	}
}

class StaticNonStatic
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter current month reading");
		double c = sc.nextDouble();
		System.out.println("Enter previous month reading");
		double p = sc.nextDouble();
		
		System.out.println("---------------------------");
		System.out.println("a) View Residential bill");
		System.out.println("b) View Commercial bill");
		System.out.println("Enter choice");
		char ch = sc.next().charAt(0);
		

		switch(ch)
		{

			case 'a' :new BillCalculator().residentialBill(p,c);
				break;

			case 'b' :  BillCalculator.commercialBill(p,c);
				break;

			default :
				System.out.println("Invalid Input");
		}

	}

}