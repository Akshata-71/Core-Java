package Patterns;
/*
   1
  22
 333
4444

 */
import java.util.Scanner;
public class NumberPattern3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of lines : ");
        int line = sc.nextInt();

        int star = 1;

        int space = line - star;

        for(int i=1 ; i<=line ; i++)
        {
            for(int j=0 ; j<space ; j++)
            {
                System.out.print(" ");

            }

            for(int k=0 ; k<star ; k++)
            {
                System.out.print(i );

            }
            System.out.println();
            star++;
            space--;
        }

    }

}
