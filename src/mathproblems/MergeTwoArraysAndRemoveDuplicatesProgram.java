package mathproblems;

import java.util.*;
import java.util.stream.IntStream;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}
    public static void main(String[] args) {
        mergeArraysWithoutDuplicates();
    }
    public static void mergeArraysWithoutDuplicates() {
        int[] arrayA = {1, 3, 4};
        int[] arrayB = {4, 5, 6, 7, 8};
        int[] arrayC = IntStream.concat(IntStream.of(arrayA), IntStream.of(arrayB)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(arrayC));
    }

}