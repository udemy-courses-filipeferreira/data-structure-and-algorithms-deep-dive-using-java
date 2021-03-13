package sortalgorithms;

public class BubbleSort {

    public static void sort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i+1]) {
                    swap(intArray, i, i+1);
                }
            }
        }

        String sortedNumbers = "";
        for (int i = 0; i < intArray.length ; i++) {
            sortedNumbers += intArray[i] + " ";
        }
        System.out.println(sortedNumbers);
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

        sort(arr1);
        sort(arr2);
    }

}
