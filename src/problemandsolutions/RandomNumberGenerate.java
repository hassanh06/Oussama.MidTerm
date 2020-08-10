package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.


    public static void main(String[] args) {
        random();

    }

    public static void random(){
        Random randomGenerator=new Random();
        for (int i = 0; i < 8; i++) {
            System.out.println(randomGenerator.nextInt(8) + 1);
        }

    }



}
