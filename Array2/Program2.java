package Array2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[10];

        System.out.println("Enter 10 elements in array");


        for (int i = 0; i< 10 ; i++){
           int element = sc.nextInt();
            array1[i] = element;
        }

        System.out.println(" Enter a number to check if it is present in array or not ");
        int number = sc.nextInt();

        for (int j=0 ; j<array1[j] ; j++) {
            if (array1[j] == number)
                System.out.println("Number present in array !!");
            else
                System.out.println("Number NOT present in array !!");
        }
    }


}
