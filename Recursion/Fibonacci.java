/**
 * @author Ali Çolak
 * 7.11.2021
 */

public class Fibonacci {

    public static int fib(int n) {
        if ( n==1 || n==2 ) 
            return 1;
        else 
            return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        int n = 3;

        System.out.println("Fibonacci "+n+" : "+fib(n));

        // 1 1 2 3 5 8 13 21 34 55 89 144


    }

}

