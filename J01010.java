import java.util.Scanner;

public class J01010 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        while(t-- > 0)
        {
            String s = input.next();
            String c = "";
            boolean found = true;
            for (int i = 0; i < s.length(); i++)
            {
                if (s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9')
                {
                    c += '0';

                } else if (s.charAt(i) == '1')
                {
                    c += '1';

                } else 
                {
                    found = false;
                    break;
                }
            }
            if (found)
            {
                String result = c.replaceFirst("^0+", "");
                boolean check = false;
                for (int i = 0; i < result.length(); i++)
                {
                    if (result.charAt(i) != '0')
                    {
                        check = true;
                        break;
                    }
                }
                if (check)
                {
                    System.out.println(result);
                }
                else{
                    System.out.println("INVALID");
                }
            } else {
                System.out.println("INVALID");
            }
        }
        input.close();
    }
}