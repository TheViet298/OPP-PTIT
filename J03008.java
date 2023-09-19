import java.util.*;          
import java.io.*;            
import java.math.*;          
import java.text.*;          

public class J03008 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while(t-- > 0)
        {
            String s = input.next(); 

            if (snt(s) && Reverse(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
    // check toàn số nguyên tố
    private static Boolean snt (String s)
    {
        if ( s.length() < 2) return false;
        for (int i = 2;  i < s.length(); i++)
        {
            char c = s.charAt(i);
            if ( c != '2' && c != '3' && c != '5' && c != '7'){
                return false;
            }
        }
        return true;
    }
    
    // Reverse
    private static Boolean Reverse(String s)
    {
        StringBuilder reversed = new StringBuilder(s).reverse();
        return s.equals(reversed.toString());
    }
}
