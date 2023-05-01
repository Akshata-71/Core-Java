class Scope
{
	static int a = 77;
	int b = 777;

	public void display()
	{
		int c = 7;
		System.out.println("C value is : " + c);

	}

	public static void main(String args[])
	{
		System.out.println("A value is : " + a);
		
		System.out.println("B value is : " + new Scope().b);

		new Scope().display();
	}

}