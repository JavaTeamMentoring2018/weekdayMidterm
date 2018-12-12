package math;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {

        System.out.println(fact(4));
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
int total=1;
        for (int i=4; i>1; i--){
            total=i*total;

        }
        System.out.println(total);
    }



    static int fact(int n)
    {
        int x;
        if (n==1){
            return 1; }
        else {
            x = n*fact(n-1);
            return x; }
    }
    }

