import java.util.Scanner;

public class J01017 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();
        while (test-- > 0)
        {
            long n = input.nextLong();

            if (check(n))
            {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
        input.close();
    }
    private static boolean check (long num)
    {
        // chuyển sang long sang chuỗi
        String s = Long.toString(num);
        for (int i = 1; i < s.length(); i++) // check 2 số cạnh nhau sai khác 1 đơn vị
        {
            if (Math.abs(s.charAt(i) - s.charAt(i-1)) != 1)
            {
                return false;
            }
        }
        return true;
    }
}
