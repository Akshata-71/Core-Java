package ArrayExample;

public class Example3 {
    public static void main(String[] args) {

        int[] array1 = { 55, 44, 23, 3} ;

        int minimum =array1[0];

        for (int j=0 ; j< array1.length ;j++){

            if(array1[j] < minimum){

                minimum = array1[j];
            }
        }
        System.out.println("minimum element is : " + minimum);
    }
}
