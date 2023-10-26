import java.util.*;

public class J02012 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        Insertion_Sort(arr, n);
        input.close();
    }
    
    private static void Insertion_Sort(int[] arr, int n)
    {
        int pos = 0;
        int x = 0; // lưu giá trị a[i] tránh bị ghi đè khi dời chỗ các phần tử
        System.out.print("Buoc " + "0" + ": " + arr[pos]); // đoạn a[0] coi đã sx
        System.out.println();

        for (int i = 1; i < n; i++) { // duyệt từ 1
            x = arr[i];
            pos = i - 1;
            while (pos >= 0 && arr[pos] > x) {//kết hợp dời chỗ các phần tử sẽ đứng sau x trong danh sách mới
                arr[pos + 1] = arr[pos];
                pos--;
            }
            arr[pos + 1] = x;//chèn x vào danh sách

            System.out.print("Buoc " + i + ": ");
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
