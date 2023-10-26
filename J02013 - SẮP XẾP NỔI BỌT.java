import java.util.*;

public class J02013 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        Bubble_Sort(arr, n);
        input.close();
    }
    
    private static void Bubble_Sort(int[] arr, int n) // sx nổi bọt
    {
        int temp;
        int check;
        int step = 1;
        for (int i = 0; i < n - 1; i++)
        {
            check = 0;
            for (int j = 0; j < n - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                    check = 1;
                }
            }
            if (check == 1)
            {
            System.out.print("Buoc " + step++ + ": ");
            for (int x = 0 ; x < n; x++)
            {
                System.out.print(arr[x] + " ");
            }
            System.out.println();
            }
        }
    }
}
