package algorithm;


import org.junit.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals("Array is not Sorted", sortedArray, unSortedArray);
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below





    }
}


//public class UnitTestSorting {
//
//    private int [] unSortedArray = {6,9,2,5,1,0,4};
//    private int [] sortedArray =   {0,1,2,4,5,6,9};
//
//    //Create Sort object
//    private Sort sort = new Sort();
//
//    @Test
//    public void testSelectionSort() {
//
//        int[] result = sort.selectionSort(unSortedArray);
//        assertArrayEquals(result, sortedArray);
//    }
//
//    @Test
//    public void testInsertionSort() {
//
//        int[] result = sort.insertionSort(unSortedArray);
//        assertArrayEquals(result, sortedArray);
//    }
//
//    @Test
//    public void testBubbleSort() {
//
//        int[] result = sort.bubbleSort(unSortedArray);
//        assertArrayEquals(result, sortedArray);
//    }
//
//    @Test
//    public void testMergeSort() {
//
//        int[] result = sort.mergeSort(unSortedArray, unSortedArray.length);
//        assertArrayEquals(result, sortedArray);
//    }
//
//    @Test
//    public void testQuickSort() {
//
//        int[] result = sort.quickSort(unSortedArray, 0, unSortedArray.length - 1);
//        assertArrayEquals(result, sortedArray);
//    }
//
//    @Test
//    public void testHeapSort() {
//
//        int[] result = sort.heapSort(unSortedArray);
//        assertArrayEquals(result, sortedArray);
//    }
//
//    @Test
//    public void testBucketSort() {
//
//        int[] result = sort.bucketSort(unSortedArray, 10);
//        assertArrayEquals(result, sortedArray);
//    }
//
//    @Test
//    public void testShellSort() {
//
//        int[] result = sort.shellSort(unSortedArray);
//        assertArrayEquals(result, sortedArray);
//    }