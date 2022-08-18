/**
 * @author Ali Çolak
 * 7.11.2021
 */

public class ArraySum {


    public static int arraySum(int [] data ,int n) {
        if ( n == 0) 
            return 0;
        else 
            return data [ n - 1 ] + arraySum ( data , n - 1 );
    }


    public static void main(String[] args) {

        int [] data = {4,3,6,2,8,9};

        System.out.println("Array sum : "+arraySum(data,5));

    }


}
