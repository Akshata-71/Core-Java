class QSP
{
	byte numberOfClass;
	int batchcode;
	String name;
	
	
	QSP()
	{
		 numberOfClass = 22;
		batchcode = 1122;
		name = "Ram";
	
	}

	QSP( QSP q )
	{
		numberOfClass = q.numberOfClass;
		batchcode =q. batchcode;
		name = q.name;

	}

	public void show()
	{
		System.out.println("--------------------------------");
		System.out.println("Number of classes : " + numberOfClass);
		System.out.println("Batch code : " + batchcode);
		System.out.println("Student Name : " +name);
	
	}

}


class ConstructorPresentation
{
	public static void main(String[] args)
	{
		QSP q1 = new QSP();
		q1.show();

		QSP q2 = new QSP( q1);
		q2.show();
	}
}