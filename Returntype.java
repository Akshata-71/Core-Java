class Returntype
{
	public static int add(int m, int n)
	{
		int ans = m + n;
		return ans;
	}

	public static double sub(double m, double n)
	{
		double ans = m - n;
		return ans;
	}

	public static void character(char ch)
	{

	}
	

	public static void main( String[] args)
	{
		int a = add(30,30);
		System.out.println("Addition is :" + a);
		double s = sub(0.2,2.54);
		System.out.println("Sutraction is : " + s);
		

	} 
}