class Discount{

	public static void giveDiscount()
	{
		String name = "Iphone 20";
		double actualPrice = 200000;
		double discount =200000 * 0.15;
		double finalPrice = actualPrice - discount;

		System.out.println("Product name          "  +  name);
		System.out.println("Actual price            "  +  actualPrice);
		System.out.println("Discount                 "  +  discount);
		System.out.println("Price after discount " +  finalPrice);
				
	}



	public static void main( String[] agrs )
	{
		giveDiscount();		

	}

}