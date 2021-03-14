package sortalgorithms;

public class ShellSort {

    public static void sort(int[] intArray) {
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {
                int unorderedValue = intArray[i];

                int j = i;

                while (j >= gap && intArray[j - gap] > unorderedValue) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = unorderedValue;
            }
        }
    }
}
