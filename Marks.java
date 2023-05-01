class Marks
{
	public static void marksCalculator(String name, int marks1, int marks2,int marks3)
	{
		int total = marks1 + marks2 + marks3;
		System.out.println("Student name : " + name);
		System.out.println("Total marks : " + total);
		System.out.println("-------------------------");
	}	


	public static void main(String args[])
	{
		System.out.println("Main start......");
		marksCalculator("ABC", 35, 35 , 35);
		
		marksCalculator("PQR", 60, 60, 65);
	
		marksCalculator("MNO", 45, 45, 45);
		System.out.println("Main End....... ");
	}
}