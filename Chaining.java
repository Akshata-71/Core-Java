class Chaining 
{
	public static void demo()
	{
		System.out.println("Demo method start !!");
		System.out.println("Demo method end !!");
	}

	public static void sample()
	{
		System.out.println("Sample method start !!");
		demo();
		System.out.println("Sample method end !!");
	}

	public static void main(String args[])
	{
		System.out.println("Main method start !!");
		sample();
		System.out.println("Main method end !!");
	}
}