package Array2;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 elements in array");
        int sum =0;
        int product=1;
        for (int a : arr) {
            a = sc.nextInt();
            product *= a;
            sum +=a;


        }


        System.out.println("Addition of array elements is :" + sum);
        System.out.println("Product of array element is   :" + product);

    }
}
