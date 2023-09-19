// SỐ XA CÁCH

import java.util.*;

// Liệt kê các hoán vị và check điều kiện 2 chữ số có hiệu lớn hơn 1 hay không

public class J02022 {
    public static int n;
    public static int[] x = new int[100];
    public static int[] used = new int[100];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            n = input.nextInt();
            Try(1);
        }

    }
    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (used[j] == 0) { // chưa xét
                if (i == 1 || Math.abs(j - x[i - 1]) > 1) { // check hiệu lớn hơn 1 của hoán vị chữ số j trừ đi chữ số ngay trước nó
                    x[i] = j;
                    used[j] = 1;
                    if (i == n) {
                        inkq();
                    } else {
                        Try(i + 1);
                    }
                    // backtrack
                    used[j] = 0;
                }
            }
        }
    }

    public static void inkq() {
        for (int i = 1; i <= n; i++) {
            System.out.print(x[i]);
        }
        System.out.println();
    }
}
