import java.math.BigInteger; // dùng lớp BigInteger : để xử lý số nguyên lớn 
import java.util.Scanner;

public class J03033 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTests = input.nextInt();
        input.nextLine(); // Đọc dòng thừa sau khi đọc số lượng test

        for (int i = 0; i < numTests; i++) {
            BigInteger a = new BigInteger(input.nextLine());
            BigInteger b = new BigInteger(input.nextLine());
            BigInteger lcm = LCM(a, b);
            System.out.println(lcm);
        }
    }

    public static BigInteger LCM(BigInteger a, BigInteger b) {
        BigInteger gcd = a.gcd(b); // truy vết đối tượng tính gcd trong BigInteger
        return a.multiply(b).divide(gcd);
    }
}
