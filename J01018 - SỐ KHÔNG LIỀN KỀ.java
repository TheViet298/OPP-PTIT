import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt(); // Số bộ test

        for (int t = 0; t < T; t++) {
            long N = input.nextLong(); // Số N

            if (solveN(N)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        input.close();
    }

    // Kiểm tra tính chất của số N
    private static boolean solveN(long N) {
        if (sumOfDigits(N) % 10 != 0) {
            return false;
        }

        String digits = Long.toString(N); // chuyển đổi chuỗi ký tự
        for (int i = 1; i < digits.length(); i++) {
            if (Math.abs(digits.charAt(i) - digits.charAt(i - 1)) != 2) { // check điều kiện 2 
                return false;
            }
        }

        return true;
    }

    // Tính tổng các chữ số của số
    private static int sumOfDigits(long number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
