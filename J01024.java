// SỐ TAM PHÂN / 
import java.util.Scanner;

public class J01024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();
        input.nextLine(); // Đọc bỏ dòng chứa số lượng test case

        for (int i = 0; i < testCases; i++) {
            String number = input.nextLine();
            boolean isTernary = true;

            for (char c : number.toCharArray()) {
                if (c != '0' && c != '1' && c != '2') {
                    isTernary = false;
                    break;
                }
            }

            System.out.println(isTernary ? "YES" : "NO");
        }

        input.close();
    }
}
