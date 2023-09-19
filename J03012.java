import java.util.*;          // Import mọi thứ trong gói java.util
import java.io.*;            // Import mọi thứ trong gói java.io
import java.math.*;          // Import mọi thứ trong gói java.math
import java.text.*;          // Import mọi thứ trong gói java.text

public class J03012 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while(t-- > 0)
        {
            BigInteger a = input.nextBigInteger();
            BigInteger b = input.nextBigInteger();
            BigInteger ans = a.add(b);
            System.out.println(ans);
        }
        input.close();
    }
}
