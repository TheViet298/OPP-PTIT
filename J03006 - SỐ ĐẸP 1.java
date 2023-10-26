import java.util.*;          
import java.io.*;            
import java.math.*;          
import java.text.*;          

public class J03006 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while(t-- > 0)
        {
            String s = input.next(); 

            if (Digits_Even(s) && Reverse(s)) {
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
        for (int i = 0; i < s.length(); i++)
        {
            char digit = s.charAt(i);
            if (digit != '0' && digit != '2' && digit != '4' && digit != '6' && digit != '8')
            {
                return false;
            }
        }
        return true;
    }
    
    // Reverse
    private static Boolean Reverse(String s)
    {
        StringBuilder reversed = new StringBuilder(s).reverse(); // dùng lớp StringBuilder để đảo ngược chuỗi
        return s.equals(reversed.toString()); // trả về kết quả 2 chuỗi có giống nhau hay không?
    }
}
