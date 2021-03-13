package sortalgorithms;

/**
 *
 * sorted partition grows from left to right
 * set first element as being part of sorted partition
 * first unsorted partition = 1
 * i = 0 used to traverse the sorted partition from right to left
 * new element = the value that we want to insert into the sorted partition
 */
public class InsertionSort {
    public static void sort(int[] intArray) {
        int unsortedPosition = 1;
        while (unsortedPosition < intArray.length) {
            int unsortedValue = intArray[unsortedPosition];
            for (int i = unsortedPosition-1; i >= 0; i--) {
                if (unsortedValue < intArray[i]) {
                    intArray[i + 1] = intArray[i];
                    intArray[i] = unsortedValue;
                } else {
                    break;
                }
            }

            unsortedPosition++;
        }

        printNumbers(intArray);
    }

    public static void anotherSort(int[] intArray) {
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int unsortedValue = intArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i-1] > intArray[i]; i--) {
                intArray[i] = intArray[i-1];
            }
            intArray[i] = unsortedValue;
        }

        printNumbers(intArray);
    }

    private static void printNumbers(int[] intArray) {
        String sortedNumbers = "";
        for (int i = 0; i < intArray.length; i++) {
            sortedNumbers += intArray[i] + " ";
        }
        System.out.println(sortedNumbers);
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 8, 7};
        int[] arr2 = {9, 100, -4, 5, 90, 2020, -1000};
        int[] arr3 = {20, 35, -15, 7, 55, 1, -22};

        sort(arr1);
        sort(arr2);
        sort(arr3);

        anotherSort(arr1);
        anotherSort(arr2);
        anotherSort(arr3);
    }
}
