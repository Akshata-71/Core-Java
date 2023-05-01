class External
{
	public static int addition(int a, int b, int c)
	{
		int add = a + b + c;

		return add;

	}

}


class Testpgm2
{
	public static void main(String[] args)
	{
		System.out.println("Main start");
		int add = External.addition(3, 3, 3);

		System.out.println("Addition is : " + add);

		System.out.println("Main End");
	}
}


