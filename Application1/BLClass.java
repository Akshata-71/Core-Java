package Application1;

public class BLClass {
    Student[] studentlist = {

    new Student(1011, "Akshata", 67.52),
    new Student(1012, "Vrushali", 82.14),
    new Student(1013, "Nikita", 66.34),
    new Student(1014, "Preeti", 72.11),
    new Student(1015, "Sakshi", 55.67),
     new Student(1016, "Ram", 90.00),
     new Student(1017, "Mahi", 45.02),
     new Student(1018, "Hardik", 35.62),
    new Student(1019, "Virat", 50.33),
    new Student(1020, "Arshdeep", 55.38)
    } ;


    public void highestScore()
    {
        int maximumMarks = 0;

        for (int i=0 ; i< studentlist.length ; i++){

            if(studentlist[i].percentage > studentlist[maximumMarks].percentage)
                maximumMarks = i;

        }
        studentlist[maximumMarks].displayDetails();
    }

    public void lowestScore()
    {
        int minimumMarks = 0;

        for (int i=0 ; i< studentlist.length ; i++){

            if(studentlist[i].percentage < studentlist[minimumMarks].percentage)
                minimumMarks = i;

        }
        studentlist[minimumMarks].displayDetails();
    }


    public double CalculateAvg()
    {
        double sum = 0.0;

        for(Student s : studentlist)
            sum += s.percentage;

        double avg = sum/studentlist.length;
        return avg;
    }


    public void passedStudents()
    {

        double avg = CalculateAvg();

        for(Student s : studentlist)
        {
            if (s.percentage > avg)
                s.displayDetails();
        }

    }
}
