import java.util.Scanner;
// phân tích thừa số nguyên tố 
public class J01008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); // Số lượng bộ test

        for (int i = 1; i <= t; i++) {
            int n = input.nextInt(); // Số nguyên dương cần phân tích
            System.out.print("Test " + i + ": ");
            solve(n);
            System.out.println();
        }

        input.close();
    }

    public static void solve(int n) {
        for (int i = 2; i <= n; i++) {
            int count = 0;
            while (n % i == 0) {
                count++;
                n /= i;
            }
            if (count > 0) {
                System.out.print(i + "(" + count + ") ");
            }
        }
    }
}
