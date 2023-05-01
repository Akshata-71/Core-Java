import java.util.Scanner;

class Bill
{
	static public int productBill(int p, int q )
	{
		int bill = p * q;

		return bill;
	}

}



class Testpgm5
{

	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter price of product : ");
		int price  = sc.nextInt();

		System.out.println("Enter quantity of product : ");
		int quantity = sc.nextInt();

		int bill = Bill.productBill(price, quantity);

		System.out.println("Bill of your purchase is : " + bill);		

	}

}