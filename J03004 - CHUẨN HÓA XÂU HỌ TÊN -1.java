// CHUẨN HÓA XÂU -1
import java.util.*;


public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            Vector<String> a = new Vector<String>();
            StringBuilder x = new StringBuilder();
            s = s.toLowerCase() + " ";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    if (x.length() > 0) {
                        a.add(x.toString());
                        x = new StringBuilder();
                    }
                } else {
                    x.append(s.charAt(i));
                }
            }
            for (String k : a) {
                System.out.print(k.substring(0, 1).toUpperCase() + k.substring(1) + " ");
            }
            System.out.println();
        }
    }
}
