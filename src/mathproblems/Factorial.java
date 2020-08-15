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

        int x = 10;
        System.out.println(doFactorial1(5));
        System.out.println(doFactorial2(5));
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


    public static int doFactorial1(int x){
        if (x == 1)
            return 1;
        return x * doFactorial1(x - 1);
    }
    public static int doFactorial2 ( int x){
        int product = 1;
        for (int i = 1; i <= x; i++)
            product *= i;
        return product;
    }


}
