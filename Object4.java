class Laptop
{
	String company ;
	double price;
	String os;
	int ram;

	public void display()
	{
		System.out.println("Company name : " + company);
		System.out.println("Laptop price" + price );
		System.out.println("Operating System" + os);
		System.out.println("Ram size : " + ram);
	} 

}

class Object4
{
	public static void main(String[] args)
	{
		Laptop o = new Laptop();
		Laptop o1 = new Laptop();
		
		o.company  = "HP";
		o.price =55000.55;
		o.os = "Ubuntu";
		o.ram = 4;
		o.display();

		
		
		o1.company  = "Yoga";
		o1.price =76000.55;
		o1.os = "Windows";
		o1.ram = 8;
		o1.display();


	}
}