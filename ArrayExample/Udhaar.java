package ArrayExample;
/*
udhar[][] ={
    frnd1=>{1,3,5,10},
    frnd2=>{5,8,10}

};
find which frnd has borrow more money frm you
 */
public class Udhaar {
    public static void main(String[] args) {

        int[][] udhar = {
                {10,50,70,30,80},
                {80,50,100},
                {50,70,90,40}
        } ;
        int maximum =0;
        int sum =0 ;

        for(int[] arr : udhar)

        {
            for (int a : arr) {

                sum = sum + a;
                if (sum > maximum)
                    maximum = sum;
            }
        }
        System.out.println("maximum udhar is: " + maximum);
    }


}

