package mathproblems;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestingMath {

    @Test
    public void unitTesting(){

        int expectedResult=120;
        int actualResult=Factorial.doFactorial1(5);
        // Assert.assertEquals(expectedResult,actualResult);
        Assert.assertEquals("Test case fail",actualResult,expectedResult);

    }
    @Test
    public void unitTesting1(){

        Fibonacci.doFabonacci();
    }

    public void unitTesting2(){

    }
    @Test
    public void unitTesting3(){

        FindMissingNumber.missNumber();
    }

    public void unitTesting4(){

    }
    @Test
    public void unitTesting5() {
        MakePyramid.pyramid();
    }
    @Test
    public void unitTesting6(){
        MergeTwoArraysAndRemoveDuplicatesProgram.mergeArraysWithoutDuplicates();
    }
    @Test
    public void unitTesting7(){
        Pattern.doPattern();

    }
    @Test
    public void unitTesting8(){

        PrimeNumber.findPrimeNumber();
    }


    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

    }
}
