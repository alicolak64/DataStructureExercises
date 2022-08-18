/**
 * @author Ali Çolak
 * 7.11.2021
 */

public class Factorial {

    static int factorial(int n) {

        if (n<0) 
            throw new IllegalArgumentException();
        else if (n==0) 
            return 1;
        else 
            return n * factorial( n - 1 );

    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(n+"! : "+factorial(n));


    }


}
