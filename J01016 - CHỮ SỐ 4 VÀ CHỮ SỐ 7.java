import java.util.Scanner;

public class J01016 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String n = input.next();
        int count4 = 0;
        int count7 = 0;

        for (int i = 0; i < n.length(); i++)
        {
            if (n.charAt(i) == '4')
            {
                count4++;
            }
            else if (n.charAt(i) == '7')
            {
                count7++;
            }
        }
        if (count4 + count7 == 4 || count4 + count7 == 7)
        {
            System.out.println("YES");
        } else 
        {
            System.out.println("NO");
        }
        input.close();
    }
}
