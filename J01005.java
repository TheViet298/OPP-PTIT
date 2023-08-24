import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Số lượng bộ test

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Số phần chia tam giác
            int h = scanner.nextInt(); // Chiều cao của tam giác

            solve(n, h);
        }

        scanner.close();
    }

    public static void solve(int n, int h) {
        double base = 1.0; // Độ dài đáy tam giác
        double areaPerSection = h * base / (2 * n); // Diện tích mỗi phần

        for (int i = 1; i < n; i++) {
            double distance = base * Math.sqrt(i * areaPerSection * 2 / h); // Khoảng cách tính theo công thức
            System.out.printf("%.6f ", distance);
        }

        System.out.println();
    }
}
