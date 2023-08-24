import java.util.*;

public class J02007 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        int step = 1;
        while(t-- > 0)
        {
            int n = input.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = input.nextInt();
            }
            // tạo mảng đánh dấu
            int[] cnt = new int[100005];
            for (int i = 0; i < n; i++) cnt[arr[i]]++;

            int[] fs = new int[100005];
            System.out.println("Test " + step++ +":");

            for (int i = 0; i < n; i++) {
                if (fs[arr[i]] == 0) {
                    System.out.println(arr[i] + " xuat hien " + cnt[arr[i]] + " lan");
                    fs[arr[i]] = 1; // Đặt lại đếm về 0 sau khi đã in thông tin
                }
            }
        }
    }
}
