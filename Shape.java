class Shape
{
	public static int areaA(int side)
	{
		int areaA = side * side;
		return areaA;	
	}

	public static int areaB(int len , int wid)
	{
		int areaB = len * wid;
		return areaB;
	}
	

	public static void main(String[] args)
	{
		int a = areaA(2);
		int b = areaB(5,10);
		int area = a + b;
		System.out.println("Area of A = " +a);
		System.out.println("Area of B = "+b);
		System.out.println("Area of shape is = " + area);
	}

}



