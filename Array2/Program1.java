package Array2;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        System.out.println("Enter elements in array");
        //int element = sc.nextInt();
        int[] array1 = new int[size];
        int i;

        for (i=0 ; i< array1.length ; i++){
            int element = sc.nextInt();
            array1[i] = element;

        }
        System.out.println("Array is" );
        for (i=0 ; i< array1.length ; i++)
             System.out.print( array1[i] + " ");

    }
}
