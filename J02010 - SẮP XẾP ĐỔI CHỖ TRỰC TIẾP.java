import java.util.*;

public class J02010 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        Interchange_Sort(arr, n);
        input.close();
    }
    
    private static void Interchange_Sort(int[] arr, int n)
    {
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] < arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
