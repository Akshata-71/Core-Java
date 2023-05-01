class Con2
{
	int a;
	double b;
	
	Con2()
	{

	}

	Con2(int a, double b)
	{
		this.a = a;
		this.b = b;
	}

	Con2(Con2 c)
	{
		a = c.a;
		b = c.b;
	}

	void display()
	{
		System.out.println("Value of a and b is : "+ a + " " + b);

	}
}

class Main2
{
	public static void main(String[] args)
	{
		Con2 c = new Con2();
		c.display();

		Con2 c1 = new Con2(20, 33.3);
		c1.display();

		Con2 c2 = new Con2(c1);
		c2.display();
      }
}