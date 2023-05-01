class This
{
	public void display(This t1)
	{
		System.out.println("This " + t1);
	}

	public static void main(String args[])
	{

		This t1 = new This();
		t1.display(t1);
		System.out.println("T1 "+ t1);
	}
}