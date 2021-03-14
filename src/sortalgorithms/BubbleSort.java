package sortalgorithms;

import utils.PrintNumbers;

/**
 * Stable algorithm: we only swap numbers if position before is greater than the next position:
 * if (intArray[i] > intArray[i+1])  - line 12
 *
 * In-place algorithm: extra memory that you're doesn't depend on the number of items
 * O(n2) time complexity - quadratic
 */
public class BubbleSort {

    public static void sort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i+1]) {
                    swap(intArray, i, i+1);
                }
            }
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
