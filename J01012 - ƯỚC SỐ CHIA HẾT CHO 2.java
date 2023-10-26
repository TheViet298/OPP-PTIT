import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            solve(n);
        }
        input.close();
    }

    public static void solve(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) { // duyệt đến căn 
            if (n % i == 0) {
                if (i % 2 == 0) {
                    count++;
                }
                if ((n / i) != i && (n / i) % 2 == 0) { // i và n / i
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
