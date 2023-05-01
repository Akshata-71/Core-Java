package ArrayExample;

public class Example4 {
    public static void main(String[] args) {
        int[] array2 = {11,33,22,7,6,88} ;
        int maximum = array2[0];

        for (int i=0 ; i<array2.length ; i++){

            if(array2[i] > maximum) {

                maximum=array2[i];
            }
        }
        System.out.println("maximum is  : " + maximum);
    }
}
