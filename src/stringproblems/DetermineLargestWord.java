package stringproblems;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);


        String [] words = s.split(" ", 7);
        int st=s.length();
        String rts = "";
        for(int i=0 ; i<words.length ; i++) {
            if(words[i].length() >= rts.length())
            {
                rts = words[i];
            }

        }

        System.out.println("The length and longest word in the given sentence : "+rts.length()+" "+rts);

        //implement

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement

        return map;
    }
}
