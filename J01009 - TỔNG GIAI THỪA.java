
import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Số n

        long sum = calculateSum(n);
        System.out.println(sum);

        scanner.close();
    }

    public static long calculateSum(int n) {
        long sum = 0;
        long term = 1;

        for (int i = 1; i <= n; i++) {
            term *= i; // Tích của các số từ 1 đến i
            sum += term; // Cộng vào tổng
        }

        return sum;
    }
}
