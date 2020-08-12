package mathproblems;

import org.junit.Test;

public class UnitTestingMath {

    @Test
    public void unitTesting(){

        Factorial.doFactorial();
    }
    @Test
    public void unitTesting1(){

        Fibonacci.doFabonacci();
    }
    @Test
    public void unitTesting2(){

        FindMissingNumber.missNumber();
    }
    @Test
    public void unitTesting3(){
        MakePyramid.pyramid();
    }


    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

    }
}
