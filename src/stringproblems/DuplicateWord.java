package stringproblems;


import java.util.Arrays;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        int count;

        //Split the string into words using built-in function
        String[] words = st.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            //Displays the duplicate word if count is greater than 1
            if (count > 1)
                System.out.println(words[i]);
        }
        System.out.println("=================================================");

        System.out.println(st.length()); //97

        Arrays.sort(words);


        for (int l = 0; l < words.length; l++) {


            String s = words[l];

            //System.out.println(s);// each word
            //System.out.print(s.length());// length of each word
            int [] h= {s.length()};
            int total=0;

            for (int n=0;n < h.length; n++){             // not done yet !
                total=total+h[n];
            }
            System.out.print(total/(float)h.length);

        }
    }
}

