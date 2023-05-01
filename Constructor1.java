class Sample
{
	int a ;
      int b ;

	

	Sample()
	{
		a = 6;
		b = 66;

		System.out.println("A of non parameterized constructor: " + a);
		System.out.println("B non parameterized constructor: " + b);

		
	}

	Sample(Sample s)
	{
		a = s.a;
		b = s.b;

		
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		System.out.println("---------------------------------------------");
	}


	
}



class Constructor1
{
	static public void main(String[] args)
	{
		Sample s1 = new Sample();
		System.out.println(s1);
		Sample s2 = new Sample(s1);
		System.out.println(s2);



		

	}

}