class Salary{
	public static void salaryCalculator()
	{
		 String empName = "AKshata";
		double bSal = 25000.00;
		//double a = 20/100 ; 
		double hike  = bSal * 0.2;
		double inc = bSal + hike;

		System.out.println("Employee Name " + empName);
		System.out.println("Employee basic salary " + bSal);
		System.out.println("Employee got hike of " + hike );
		System.out.println("Employee total increment " + inc);
	}
	


	public static void main(String args[])
	{
	 	System.out.println("Employees salary details.....");
		 salaryCalculator();
	}

}