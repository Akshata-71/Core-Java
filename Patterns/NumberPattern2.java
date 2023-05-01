package Patterns;
/*
1
22
333
4444
 */
public class NumberPattern2 {
    public static void main(String[] args) {
        int line = 4;
        //int num = 4;
        for(int i = 1 ; i<=line ; i++){

            for(int j = 0 ; j<i ; j++){

                System.out.print(i );

            }
            System.out.println();

        }
    }
}
