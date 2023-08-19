import java.util.Scanner;

public class J01011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        while (t-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            long lcm = (long) a * b / gcd(a, b); // ép kiểu

            System.out.println(lcm + " " + gcd(a, b));
        }
        
        input.close();
    }

    // Hàm tính ước chung
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
