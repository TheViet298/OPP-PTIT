import java.util.*;

public class J02014 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while(t-- > 0)
        {
            int n = input.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = input.nextInt();
            }
            long kq = find(arr);
            System.out.println(kq);
        }
        input.close();
    }

    private static long sum (int[] a)
    {
        long tong = 0;
        for (int i : a)
        {
            tong += i;
        }
        return tong;
    }

    private static long find(int[] arr)
    {
        long total_sum = sum(arr);
        long left_sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            total_sum -= arr[i];
            if (left_sum == total_sum)
            {
                return i + 1;
            }
            left_sum += arr[i];
        }
        return -1;
    }
}
