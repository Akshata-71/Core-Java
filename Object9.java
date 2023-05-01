class Student2
{
	String studentName;
	int rollno;
	double marks;
	char grade;

	public void gradeCalculator()
	{
		if(marks < 40)
		{
			 grade = 'D';

		}else if(marks < 60){
			
			 grade = 'C';
	
		}else if(marks < 75){

			 grade = 'B';

		}else if(marks <  100 ){

			 grade = 'A';
		}
	}	
		
	public void studentDetails()
	{
		System.out.println("Student name :" + studentName);
		System.out.println("Student rollno :" +rollno);
		System.out.println("Grade : " + grade);
		System.out.println("*********************");
	}
	
}


class Object9
{
	public static void main(String args[])
	{
		Student2 s1 = new Student2();
		s1.studentName = "Akshata";
		s1.rollno = 35333;
		s1.marks = 67.24;
		s1.gradeCalculator();
		s1.studentDetails();
		
		Student2 s2 = new Student2();
		s2.studentName = "Kavya";
		s2.rollno = 35335;
		s2.marks = 80.62;
		s2.gradeCalculator();
		s2.studentDetails();

	}


}