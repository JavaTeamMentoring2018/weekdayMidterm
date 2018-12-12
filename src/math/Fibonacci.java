package math;

public class Fibonacci {
    public static void main(String[] args) {

         /*
          Write 40 Fibonacci numbers with java.
         */
         printFibo(8);


    }

    static void printFibo(int quantity){
        int n1=0;
        int n2=1;
        int n3;

        System.out.print(n1+ ", "+n2+ ", ");
        quantity=quantity-2;

        while (quantity>0){

            n3= n1+n2;
            System.out.print(n3+", ");
            quantity--;
            n1=n2;
            n2=n3;

        }

    }
}
