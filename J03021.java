import java.util.*;

public class J03021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        input.nextLine(); 
        while (t-- > 0) {
            String s = input.next();
            if (isPalindromeNumber(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }

    private static boolean isPalindromeNumber(String s) {
        String[] keypad = {
            "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
        };
        
        StringBuilder translated = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < keypad.length; j++) {
                if (keypad[j].contains(String.valueOf(c))) { // check có xuất hiện tương ứng với keypad hay không
                    translated.append(j + 2); 
                    break;
                }
            }
        } 
        
        return translated.toString().equals(translated.reverse().toString()); // chuyển chuỗi check thuận nghịch
    }
}
