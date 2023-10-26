import java.util.Scanner;

public class J02004 {
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

            // Kiểm tra xem dãy có đối xứng hay không
            // 1 4 4 1
            boolean check = true;
            for (int i = 0; i < n / 2; i++) {
                if (arr[i] != arr[n - 1 - i]) { // đối xứng của i
                    check = false;
                    break;
                }
            }
            if (check == true)
            {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}
