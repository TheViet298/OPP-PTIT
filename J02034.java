// BỔ SUNG DÃY SỐ

import java.util.*;

public class J02034 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            int n = input.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = input.nextInt();
            }
            int[] cnt = new int[1005];
            for (int i = 0; i < n; i++) cnt[arr[i]] = 1; // đánh dấu xuất hiện trong mảng
            // duyệt từ 0 đén max 
            boolean found = false;
            long Max = max(arr, n); // số lớn nhất
            Set<Integer> se = new LinkedHashSet<>();
            for (int i = 1; i <= Max; i++)
            {
                if (cnt[i] == 0) // chưa xuất hiện
                {
                    se.add(i); // thêm vô set phần tử còn thiếu trong đoạn từ 1 đến max
                    found = true;
                }
            }
            if (found == true)
            {
                for (int x : se){
                    System.out.println(x); 
                }
            } else {
                System.out.println("Excellent!");
            }


        input.close();
    }
    // max trong dãy
    public static long max(int[] a, int n)
    {
        int max_val = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] > max_val)
            {
                max_val = a[i];
            }
        }
        return max_val;
    }
}