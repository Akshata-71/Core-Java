package Application1;

import java.util.Scanner;
public class MainApp1 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        BLClass b =new BLClass();
        boolean status = true;

        while (status)
        {
            System.out.println("1) Highest score");
            System.out.println("2) Lowest score");
            System.out.println("3) Passed Student ");
            System.out.println("4) Average Marks ");
            System.out.println("5) exit");
            System.out.println("----------------------");
            System.out.println("Enter choice :");
            int ch = sc.nextInt();


            switch (ch) {
                case 1 -> b.highestScore();
                case 2 -> b.lowestScore();
                case 3 -> b.passedStudents();
                case 4 -> {
                    double avg = b.CalculateAvg();
                    System.out.println("Average Marks are : " + avg);
                }
                case 5 -> status = false;
                default -> System.out.println("Invalid input");
            }

        }
    }
}
