package mathproblems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        pyramid();

    }

        public static void pyramid() {
            int n = 6;
            for (int i=0; i<n; i++) //outer loop for number of rows(n)
            {
                for (int j=n-i; j>1; j--) //inner loop for spaces
                {
                    System.out.print(" "); //print space
                }
                for (int j=0; j<=i; j++ ) //inner loop for number of columns
                {
                    System.out.print("* "); //print star
                }

                System.out.println(); //ending line after each row
            }
        }


    }