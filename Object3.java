class Human
{
	int hands = 2;
	int legs = 2;

	public void work()
	{
		if( hand == 2)
			System.out.println("Can Work!!");
		else
			System.out.println("Cannot Work..");
	}
}

class Object3
{
	public static void main(String args[])
	{
		Object3 o = new Object3();
		Object3 o1 = new Object3();
		
		o1.hands = 1;
		System.out.println("H1 Hands" + o.Human);
		System.out.println("H2 Hands" + o1.Human);

		o.Human();
		o1.Human();
	}


}