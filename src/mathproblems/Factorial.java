package mathproblems;


import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        doFactorial();
    }
        public static void doFactorial(){


            Scanner input=new Scanner(System.in);
            System.out.println("Please Enter a Number :");
            int number=input.nextInt();

                int f=1;
                for(int i=1;i<=number;i++){
                    f=f*i;
                }
                System.out.println("Factorial of "+number+" is : "+f);
    }


}
