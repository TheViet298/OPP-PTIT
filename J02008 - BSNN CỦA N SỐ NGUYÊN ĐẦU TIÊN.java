import java.util.*;          // Import mọi thứ trong gói java.util
import java.io.*;            // Import mọi thứ trong gói java.io
import java.math.*;          // Import mọi thứ trong gói java.math
import java.text.*;          // Import mọi thứ trong gói java.text

public class J02008 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while(t-- > 0)
        {
            int n = input.nextInt();
            long kq = findLCM(1, n);
            System.out.println(kq);
        }
        input.close();
    }
    // hàm ước chung lớn nhất
    private static long gcd(long a, long b)
    {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
    // hàm bội chung nhỏ nhất
    private static long lcm (long a, long b)
    {
        return (a*b) / gcd(a, b);
    }
    // hàm findlcm
    private static long findLCM(int start, int end)
    {
        long res = start;
        for (int i = start + 1; i <= end; i++)
        {
            res = lcm(res, i);
        }
        return res;
    }
}

