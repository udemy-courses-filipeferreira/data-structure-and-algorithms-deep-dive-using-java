package sortalgorithms;

import utils.PrintNumbers;

/**
 * Unstable algorithm
 * largest position starts at 0
 * lastUnsortedIndex is the last position of the array
 * i = 1 - index used to traverse the array from left to right
 *
 * In-place algorithm: extra memory that you're doesn't depend on the number of items
 * O(n2) time complexity - quadratic
 * Doesn't require as much swapping as bubble sort - swap once per traversal
 */
public class SelectionSort {

    public static void sort(int[] intArray) {
        int largestPosition;
        for (int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex --) {
            largestPosition = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largestPosition]) {
                    largestPosition = i;
                }
            }

            swap(intArray, largestPosition, lastUnsortedIndex);
        }

        PrintNumbers.print(intArray);
    }

    private static void swap(int[] intArray, int i, int j) {
        if (i != j) {
            int temp = intArray[i];
            intArray[i] = intArray[j];
            intArray[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 8, 7};
        int[] arr2 = {9, 100, -4, 5, 2020, -1000};
        int[] arr3 = {20, 35, -15, 7, 55, 1, -22};

        sort(arr1);
        sort(arr2);
        sort(arr3);
    }

}
