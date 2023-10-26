import java.util.*;

public class J03027 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();

        StringBuilder result = new StringBuilder(s);
        boolean removed = true;

        while (removed) {
            removed = false;
            for (int i = 0; i < result.length() - 1; i++) {
                if (result.charAt(i) == result.charAt(i + 1)) {
                    result.delete(i, i + 2); // Xóa 2 ký tự giống nhau
                    removed = true;
                    break;
                }
            }
        }

        if (result.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(result.toString());
        }
    }
}
