package stringproblems;

import org.junit.Test;

public class UnitTestingStringProblem {

    @Test
    public void unitTesting(){

        Anagram.DoAnagram();
    }

    @Test
    public void unitTesting1(){

        Palindrome.dopalindrome();
    }
    @Test
    public void unitTesting2(){

        Permutation.stringPermutation("input");
        Permutation.stringPermutation("str", "str");
    }

    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

    }
}
