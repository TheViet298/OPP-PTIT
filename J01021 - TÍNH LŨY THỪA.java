import java.util.Scanner;

public class J01021 {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            long a = input.nextLong();
            long b = input.nextLong();

            if (a == 0 && b == 0) {
                break; 
            }

            System.out.println(power(a, b));
        }
    }

    public static long sqr(long a, long b) {
        return ((a % MOD) * (b % MOD)) % MOD;
    }

    public static long power(long a, long b) {
        if (b == 0) {
            return 1;
        } else {
            long temp = power(a, b / 2) % MOD;
            if (b % 2 == 0) {
                return sqr(temp, temp);
            } else {
                return sqr(sqr(a, temp), temp);
            }
        }
    }
}
