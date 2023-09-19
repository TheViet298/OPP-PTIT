import java.util.*;

public class J03027 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        int[] cnt = new int[256];

        // Đánh dấu ký tự xuất hiện
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i)]++;
        }

        // Nếu cnt % 2 != 0 thì in ra
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            if (cnt[i] != 0) {
                if (cnt[i] % 2 != 0) {
                    res.append((char) i);
                }
            }
        }
//        check StringBuilder thì khong dùng isEmpty
        if (res.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(res.toString());
        }
    }
}
