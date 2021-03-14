package sortalgorithms;

public class Recursion {

    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * recursiveFactorial(num - 1);
        }
    }

    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
        System.out.println(iterativeFactorial(5));
    }
}
