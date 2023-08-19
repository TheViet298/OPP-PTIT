import java.util.Scanner;

public class J01026 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        while (t-- > 0)
        {
            int n = input.nextInt();
            if (check(n))
            {
                System.out.println("YES");
            }
            else 
            {
                System.out.println("NO");
            }
        }
    }
    public static boolean check (int num)
    {
        int sqr = (int)Math.sqrt(num);
        if (sqr * sqr == num)
        {
            return true;
        } else 
        {
            return false;
        }
    }
}
