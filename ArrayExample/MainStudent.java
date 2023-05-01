package ArrayExample;

public class MainStudent {
    public static void main(String[] args) {
        Student[] studentlist = new Student[10];

                studentlist[0] = new Student(1011, "Akshata", 67.52);
                studentlist[1] = new Student(1012, "Vrushali", 82.14);
                studentlist[2] = new Student(1013, "Nikita", 66.34);
                studentlist[3] = new Student(1014, "Preeti", 72.11);
                studentlist[4] = new Student(1015, "Sakshi", 55.67);
                studentlist[5] = new Student(1016, "Ram", 90.00);
                studentlist[6] = new Student(1017, "Mahi", 45.02);
                studentlist[7] = new Student(1018, "Hardik", 35.62);
                studentlist[8] = new Student(1019, "Virat", 50.33);
                studentlist[9] = new Student(1020, "Arshdeep", 55.38);


        double maximum = studentlist[0].percentage;
        double minimum = studentlist[0].percentage;
        double averagePercentage = 0.0;
        double sum = 0.0;

        for (Student student : studentlist) {

            sum = sum + student.percentage;
            averagePercentage = sum / 10;

            if (student.percentage < minimum) {
                minimum = student.percentage;
            }

            if (student.percentage > maximum) {
                maximum = student.percentage;
            }


            if (student.percentage > averagePercentage) {
                System.out.println("Pass !!");
                student.displayDetails();
            }


        }

        System.out.println("===============================================");
        System.out.println("sum : " +sum);
        System.out.println("avg :" +averagePercentage);
        System.out.println("===============================================");

        System.out.println("Student having highest percentage :" + maximum);
        System.out.println("Students having least percentage :" + minimum);
        System.out.println("===============================================");

    }

}

