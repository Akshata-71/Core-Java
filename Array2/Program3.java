package Array2;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        int positive = arr[0];
        int negative = arr[0];
        int even = arr[0];
        int odd = arr[0];
        int zero = arr[0];

        System.out.println("Enter elements 10 in array");

        for (int i=0 ; i<arr.length ; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }
        System.out.println("Positive numbers");
        for (int j=0 ; j< arr.length ;j++){
            if (arr[j] >0) {
                positive = arr[j];
                System.out.print(positive +" ");

            }
        }
        System.out.println();

        System.out.println("Negative numbers");
        for (int j=0 ; j< arr.length ;j++){
            if (arr[j] < 0) {
                negative = arr[j];
                System.out.print(negative +" ");

            }
        }
        System.out.println();

        System.out.println("Even numbers");
        for (int j=0 ; j< arr.length ;j++){
            if (arr[j]%2 == 0) {
                even = arr[j];
                System.out.print(even +" ");


            }
        }

        System.out.println();
        System.out.println("Odd numbers");
        for (int j=0 ; j< arr.length ;j++){
            if (arr[j]%2 != 0) {
                odd = arr[j];
                System.out.print(odd +" ");

            }

        }

        System.out.println();
        System.out.println("Number of zero : ");
        for (int j=0 ; j< arr.length ;j++) {
            if (arr[j] == 0) {
                zero = arr[j];
                System.out.print(zero +" ");

            }
        }

    }
}
