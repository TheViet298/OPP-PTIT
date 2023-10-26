// ƯỚC SỐ CHUNG LỚN NHẤT CỦA SỐ NGUYÊN LỚN
import java.math.BigInteger;
import java.util.*;


public class J03011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            BigInteger a = input.nextBigInteger();
            BigInteger b = input.nextBigInteger();
            BigInteger ans = a.gcd(b);
            System.out.println((ans));
        }
    }
}


