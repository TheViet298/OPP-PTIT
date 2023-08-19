import java.util.Scanner;

public class J01014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            long n = input.nextLong();
            long largestPrimeFactor = findNumber(n);
            System.out.println(largestPrimeFactor);
        }
    }

    // Hàm tìm ước số nguyên tố lớn nhất
    public static long findNumber(long num) {
        long largestPrime = 2;
        while (num % 2 == 0) {
            num /= 2;
        }
        for (long i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                largestPrime = i;
                num /= i;
            }
        }
        if (num > 2) {
            largestPrime = num;
        }
        return largestPrime;
    }
}
