package utils;

public class PrintNumbers {

    public static void print(int[] intArray) {
        String sortedNumbers = "";
        for (int i = 0; i < intArray.length; i++) {
            sortedNumbers += intArray[i] + " ";
        }
        System.out.println(sortedNumbers);
    }
}
