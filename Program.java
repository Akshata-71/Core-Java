class Program{

	public static void add()
	{
		int a = 10;
		int b  = 20;
		int c = a+b;
		System.out.println("Addition of " +  a + " and " + b + " =" + c);
	}

	public static void sub()
	{
		int a = 10;
		int b  = 20;
		int c = a-b;
		System.out.println("Subtraction of " +  a  + " and " + b + " =" + c);
	}

	public static void mul()
	{
		int a = 10;
		int b  = 20;
		int c = a*b;
		System.out.println("Multiplication of " +  a + " and " + b + " =" + c);
	}

	public static void div()
	{
		int a = 20;
		int b  = 10;
		int c = a/b;
		System.out.println("Division of " +  a + " and " + b + " 

=" + c);
	}

	public static void main(String args[])
	{
		System.out.println("Starting of main method....");
		add();
		sub();
		mul();
		div();
		System.out.println("Ending of main method....");
	}
}