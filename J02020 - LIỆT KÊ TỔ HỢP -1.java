import java.util.*;          // Import mọi thứ trong gói java.util
import java.io.*;            // Import mọi thứ trong gói java.io
import java.math.*;          // Import mọi thứ trong gói java.math
import java.text.*;          // Import mọi thứ trong gói java.text

// tổ hợp chập k của n 
// i : chạy từ thằng đứng trước + 1
// max : n - k + i

public class J02020 {
    public static int n, k, dem;
    public static int[] x = new int[100];
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // int t = input.nextInt();
            n = input.nextInt();
            k = input.nextInt();
            Try(1);
            System.out.println("Tong cong co " + dem + " to hop");

        input.close();
    }
    private static void Try(int i)
    {
        for ( int j = x[i-1] + 1; j <= n - k + i; j++)
        {
            x[i] = j;
            if ( i == k)
            {
                kq();
                dem++;
            }
            else 
            {
                Try(i+1);
            }
        }
    }
    private static void kq()
    {
        for (int i = 1; i <= k; i++)
        {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}

