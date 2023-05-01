class Test
{
	{
		System.out.println("In a NON-STATIC BLOCK....");   

	}

}

class Block
{

	public static void main(String[] args)
	{

		Test t1 = new Test();                // non static block execute at the time of object creation.
		System.out.println("Main method START ");

		System.out.println("Main method END ");

	}

	static{
		System.out.println("In a STATIC BLOCK....");   

	}
	
}