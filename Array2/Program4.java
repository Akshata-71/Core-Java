package Array2;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter elements in array");
        int i;

        for( i=0 ; i< arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();



        for (int k=0 ; k< arr.length ; k++) {

            System.out.print(arr[k] + " ");

        }
        System.out.println();



        for (int j= arr.length; j<0 ;j--) {
            System.out.println("Reverse array : ");
            System.out.println(arr[j] + " ");

        }
        System.out.println()
    }
}
