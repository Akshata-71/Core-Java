package ArrayExample;

public class SecondMinimum {
    public static void main(String[] args) {

        int[] array1 = {11, 7, 33, 2, 7, 4 } ;
        int min1 =  array1[0];
        int min2 = array1[1];

        for(int i = 0 ; i< array1.length ; i++){

            if(array1[i] < min1)
            {
                min2 = min1;
                min1 =array1[i];
            }else  if(array1[i] < min2 && array1[i] != min1)
            {
                min2 =array1[i];
            }

        }
        System.out.println("First minimum : " +min1);
        System.out.println("Second minimum : " +min2);



    }
}
