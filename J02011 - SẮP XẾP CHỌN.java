import java.util.*;

public class J02011 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        Selection_Sort(arr, n);
        input.close();
    }
    
    private static void Selection_Sort(int[] arr, int n) //  sắp xếp chọn
    {
        int min = 0; // khởi tạo vị trí nhỏ nhất
        // 5 7 3 2
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j; // cập nhật lại min
                }
            }
            // swap ( a[i] vs a[min])
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp; 
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
