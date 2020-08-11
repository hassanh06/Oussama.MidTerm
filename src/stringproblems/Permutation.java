package stringproblems;


import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your string: ");
        String str = scan.nextLine();
        stringPermutation(str);
    }

    public static void stringPermutation(String input) {

        stringPermutation("", input);
    }

    public static void stringPermutation(String permutation, String input) {
        if (input.length() == 0) {
            System.out.println(permutation);
        } else {
            for (int i = 0; i < input.length(); i++) {
                // Recursion
                stringPermutation(permutation + input.charAt(i), input.substring(0, i) + input.substring(i + 1, input.length()));
            }
        }
    }







}
