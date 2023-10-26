
import java.util.*;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.chars().distinct().count()); // trả về số lượng ký tự khác nhau duy nhất
        sc.close();
    }
}
