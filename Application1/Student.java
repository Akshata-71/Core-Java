package Application1;

public class Student {
    int rollNumber;
    String studentName;
    double percentage;

    public Student(int rollNumber, String studentName, double percentage) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.percentage = percentage;
    }

    public void displayDetails()
    {
        System.out.println("------------------------------------");
        System.out.println("Student Roll no : " + this.rollNumber);
        System.out.println("Student Name : " + this.studentName);
        System.out.println("Student percentage : " + this.percentage);

    }
}
