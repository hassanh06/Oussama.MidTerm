package stringproblems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        dopalindrome();

    }
        public static void dopalindrome(){


            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter a String :");
            String str = input.nextLine();

            int length = str.length();
            String rev = "";

            for (int i = length - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            if (str.equals(rev)) {
                System.out.println(str + " is a palindrome");
            } else {
                System.out.println(str + " is not a palindrome");
            }

        }

}
