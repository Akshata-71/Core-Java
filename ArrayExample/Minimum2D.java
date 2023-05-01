package ArrayExample;

public class Minimum2D {
    public static void main(String[] args) {

        int[][] array1 = {
                {10,20,30},
                {-40,50,60},
                {9,8}
        } ;

        int minimum =array1[0][0];

        for(int[] arr : array1)
        {
            for (int a: arr) {

                if (a < minimum) {

                    minimum = a;
                }
            }
        }
        System.out.println("minimum element is : " + minimum);
    }
}
