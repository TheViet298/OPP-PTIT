import java.util.Scanner;

public class J01013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        long total = 0;
        while (n-- > 0) {
            int num = input.nextInt();

            total += sumPrimeFactors(num);
        }
        System.out.println(total);
        input.close();
    }

    public static long sumPrimeFactors(int num) {
        long total = 0;

        while (num % 2 == 0) {
            total += 2;
            num /= 2;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                total += i;
                num /= i;
            }
        }

        if (num > 1) {
            total += num;
        }

        return total;
    }
}
