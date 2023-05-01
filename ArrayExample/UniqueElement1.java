package ArrayExample;

public class UniqueElement1 {

    public static void main (String[] args)
    {
        int[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};

        int unique = arr[0];

        for(int i=1 ; i<= arr.length ; i++){

            for(int j=0 ; j<i ; j++){
                if( arr[i] == unique){
                   break;

                }else {
                    System.out.print(arr[i] + " ");
                    i++;
                }
            }
        }


    }
}


