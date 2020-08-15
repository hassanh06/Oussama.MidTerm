package mathproblems;


import java.util.*;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33,1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        // Calculate size of Both arrays
        int k = array1.length;
        int s = array2.length;

        // Call function to
        // print smallest result
        System.out.println(findSmallestDifference
                (array1, array2, k, s));

    }
        static int findSmallestDifference(int array1[], int array2[], int k, int s) {
            // Sort both arrays using sort function.
            Arrays.sort(array1);
            Arrays.sort(array2);

            int i = 0, j = 0;

            // Initialize result as max value
            int result = Integer.MAX_VALUE;

            while (i < k && j < s) {
                if (Math.abs(array1[i] - array2[j]) < result)
                    result = Math.abs(array1[i] - array2[j]);

                // Move Smaller Value
                if (array1[i] < array2[j])
                    i++;

                else
                    j++;
            }

            // return final small result
            return result;
        }


        }


