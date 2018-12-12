package math;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here
buildRows(6);
buildRows1(6);




         }

         /*

          *
          * *
          * * *
          * * * *
          * * * * *
          * * * * * *

          */
         public static void buildRows(int n){

        int i, j;

        for(i=0;i<n; i++){
            for (j=0; j<=i; j++){
                System.out.print("* ");

            }
            System.out.println();


        }
         }


         public static void buildRows1(int n){

for (int i=0; i<n; i++){
             // inner loop to handle number spaces
             // values changing acc. to requirement
             for (int j=n-i; j>1; j--)
             {
                 // printing spaces
                 System.out.print(" ");
             }

             //  inner loop to handle number of columns
             //  values changing acc. to outer loop
             for (int j=0; j<=i; j++ )
             {
                 // printing stars
                 System.out.print("* ");
             }

             // ending line after each row
             System.out.println();
         }
}

  }
