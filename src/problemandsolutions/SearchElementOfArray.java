package problemandsolutions;

import java.util.Scanner;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.



    public static int sequentialSearch(int[] elements, int target) {


        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i] == target) {
                return i;

            }
        }
        System.out.println("there is no such element.");
        return -1;


    }

    public static void main(String[] args) {


        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Target :");
        int target1 = input.nextInt();


         int index = sequentialSearch(arr1,target1);
        System.out.println(index);


    }
}



















