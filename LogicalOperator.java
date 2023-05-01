class Examples
{
	public void example1()
	{
		int a = 10, b = 20;

		if(a<b || b<30)
		{
			System.out.println( a + b);
		}else
			System.out.println(false);

	}

	public static void example2()
	{
		int a =29, b = 30;

		if(( (a++) == 30) && (a == 30) )
		{
			System.out.println("A : " + a);
			System.out.println("B : " + b);

		}else
			System.out.println( "Else" + " Block" + a + b);		

	}

	public static void example3()
	{
		int a = 20, b=19;

		if( a-- == 19 && b++ == 20)
			System.out.println(true);
		else
		{
			System.out.println(a);
			System.out.println(b);
		}


	}

	public static void example4()
	{
		int a=100, b=99, c=1;

		if(++b ==0 && c-- < 1)
		{
			System.out.println(true);

		}else
		{
			System.out.println(false);
			System.out.println(a);
			System.out.println(b);

		}

	}

}


class LogicalOperator
{
	public static void main(String[] args)
	{
		Examples e1 = new Examples();

		e1.example1();
		System.out.println("-----------------------------------");
		e1.example2();
		System.out.println("-----------------------------------");
		e1.example3();
		System.out.println("-----------------------------------");
		e1.example4();
	}


}