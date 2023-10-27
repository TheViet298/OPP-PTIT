import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            double H = h / (Math.sqrt(n));

            for (int i = 1; i < n; i++) {
                System.out.printf("%.6f ", H * (Math.sqrt(i)));
            }

            System.out.println();

            t--;
        }

        sc.close();
    }
}
