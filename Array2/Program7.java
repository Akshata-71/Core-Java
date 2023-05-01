package Array2;

public class Program7 {
    public static void main(String[] args) {
        int[] arr = {10 ,7, 5, 11, -6};

        int min = arr[0];
        int max = arr[0];

        for (int a : arr)
        {
            if(a < min)
                min = a;

            if (a > max)
                max = a;

        }

        System.out.println("___________________________________");
        System.out.println("MINIMUM ELEMENT : " + min);
        System.out.println("MAXIMUM ELEMENT : " + max);
        System.out.println("___________________________________");
    }
}
