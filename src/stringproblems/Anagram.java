package stringproblems;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        DoAnagram();
    }

    public static boolean DoAnagram() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The First String :");
        String string1 = scanner.next();
        System.out.println("Please Enter The second String :");
        String string2 = scanner.next();
        int length = string1.length();
        int length1 = string2.length();


        char[] arr1 = string1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = string2.toCharArray();
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");


        for (int i = 0; i < length; i++) {
            if (arr1[i] != arr2[i]) {
            }
            return false;


        }return true;
    }




}

