package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {
        math();

    }
    public static void math(){

        Scanner input=new Scanner(System.in);
        System.out.println("Please Input Two Integer values");
        int value1=input.nextInt();
        int value2=input.nextInt();
        int ad=value1+value2,sub=value1-value2, mul=value1*value2;
        System.out.println(ad);
        System.out.println(sub);
        System.out.println(mul);
        try {int div=value1/value2;
            System.out.println(div);}catch (Exception e){
            System.out.println("Dividing by 0 is not allowed");
        }

    }



}
