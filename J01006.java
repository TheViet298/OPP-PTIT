import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt(); // Số bộ test

        for (int i = 0; i < numTestCases; i++) {
            int n = scanner.nextInt(); // Số Fibonacci thứ n
            long result = calculateFibonacci(n);
            System.out.println(result);
        }

        scanner.close();
    }

    public static long calculateFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }

        long[] fibArray = new long[n + 1];
        fibArray[1] = 1;
        fibArray[2] = 1;

        for (int i = 3; i <= n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        return fibArray[n];
    }
}
