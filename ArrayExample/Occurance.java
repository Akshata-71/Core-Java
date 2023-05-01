package ArrayExample;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = sc.nextInt();
        int[] arr = {10, 10, 5, 4, 10} ;
        int occurence =0;

        for(int i=0; i< arr.length ; i++)
        {
            if(arr[i] == number)
            {
                occurence++;
            }
        }

        System.out.println("Occurences are : " + occurence);
    }
}
