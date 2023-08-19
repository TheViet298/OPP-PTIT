import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numTests = input.nextInt(); // Số bộ test
        
        for (int t = 0; t < numTests; t++) {
            int N = input.nextInt(); // Đọc số nguyên dương N cho mỗi bộ test
            
            long sum = (long) N * (N + 1) / 2;

            System.out.println(sum); // In kết quả cho mỗi bộ test
        }
        
        input.close();
    }
}
