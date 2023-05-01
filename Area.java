class Area{
	
	public static void areaOfRectangle(int length, int width)
	{
		int area = length * width;
		System.out.println("Area of rectangle :" + area);
	}

	public static void areaOfCircle(double radius)
	{
		double area = 3.14 * radius * radius;
		System.out.println("Area of Circle :" + area); 
	
	}

	public static void areaOfSquare(int side)
	{
		int area = side * side;
		System.out.println("Area of Square :" + area); 
	}


	public static void main( String[] args )
	{
		areaOfRectangle(20,40);
		areaOfCircle(2.00);
		areaOfSquare(2);
	}
}