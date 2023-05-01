package ArrayExample;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int[] arr = {10, 20, 30, 40, 50};

        for (int j : arr) {
            if (num == j) {
                System.out.println("number is present in array");
            }

        }

    }
}
