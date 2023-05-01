package Array2;

public class Program6 {
    public static void main(String[] args) {

        int[][] arr ;

        arr = new int[2][2];

        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;

        for (int[] ar : arr)
            for (int a : ar)
                System.out.println(a);
    }
}
