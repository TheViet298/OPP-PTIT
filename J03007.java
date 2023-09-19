import java.util.*;          
import java.io.*;            
import java.math.*;          
import java.text.*;          

public class J03007 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while(t-- > 0)
        {
            String s = input.next(); 

            if (Digits_Even(s) && First_Digit(s) && Reverse(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
    
    // check isdigit khác even 
    private static Boolean Digits_Even(String s)
    {
        Long Sum = 0L;
        for (int i = 0; i < s.length(); i++)
        {
            char digit = s.charAt(i);
            Long isDigit = Long.parseLong(String.valueOf(digit));
            Sum += isDigit;
        }
        if (Sum % 10 == 0)
        {
            return true;
        }
        return false;
    }
    
    // Check ký tự đầu và cuối là 8
    private static Boolean First_Digit(String s)
    {
        if (s.charAt(0) == '8' && s.charAt(s.length() - 1) == '8')
        {
            return true;
        }
        return false;
    }
    
    // Reverse
    private static Boolean Reverse(String s)
    {
        StringBuilder reversed = new StringBuilder(s).reverse();
        return s.equals(reversed.toString());
    }
}
