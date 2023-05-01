import java.util.Scanner;

class BooleanValueToBitwise
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A value : ");
		boolean a = sc.nextBoolean();
		System.out.println("Enter B value : ");
		boolean b = sc.nextBoolean();

		System.out.println("************TABLE FOR AND************");
		System.out.println( "Input1" + " " + "Input2" + "  Output");
		
		if( a == true & b == true){
			System.out.println( a + "    " + b  + "  " + true);
			System.out.println("---------------------");
		}
		else if( a == true & b == false){
			System.out.println( a + "    " + b  +"  " + false);
			System.out.println("---------------------");
		}

		else if( a == false & b == true){
			System.out.println( a + "    " + b  +"  " + false);
			System.out.println("---------------------");
		}
		else if( a == false & b == false){
			System.out.println( a + "    " + b  +"  " + true);
			System.out.println("---------------------");
		}


		System.out.println("************TABLE FOR OR************");
		System.out.println( "Input1" + " " + "Input2" + "  Output");
		
		if( a == true & b == true){
			System.out.println( a + "    " + b  + "  " + true);
			System.out.println("---------------------");
		}
		else if( a == true & b == false){
			System.out.println( a + "    " + b  +"  " + true);
			System.out.println("---------------------");
		}

		else if( a == false & b == true){
			System.out.println( a + "    " + b  +"  " + true);
			System.out.println("---------------------");
		}
		else if( a == false & b == false){
			System.out.println( a + "    " + b  +"  " + false);
			System.out.println("---------------------");
		}
		
	}

}