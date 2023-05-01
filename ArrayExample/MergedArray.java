package ArrayExample;

public class MergedArray {
    public static void main(String[] args) {

        int[] a1 = {10, 20,30} ;

        int[] a2 = {40, 50, 60} ;

        int[] a3;
        a3 = new int[ a1.length + a2.length] ;

        int i = 0;

        for ( i=0 ; i< a1.length ; i++)
        {

            a3[i] = a1[i];
            a3[a1.length + 1] = a2[i];
        }

       /* for ( i=0 ; i<a2.length ; i++)
            a3[a1.length + 1] = a2[i];*/


        System.out.println("Merged array is : " + a3[i]);

    }
}
