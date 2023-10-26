import java.util.Scanner;

public class J01007 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        for (int i = 0; i < t; i++){
            long n = input.nextLong(); // nhận n
            if (check(n)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        } 
    }
    
    // hàm kiểm tra xem một số có phải là số Fibonacci hay không
    public static boolean check(long num){
        if (num == 0 || num == 1){
            return true;
        }
        
        long prev = 0;
        long curr = 1;

        while (curr <= num) {
            if (curr == num) {
                return true;
            }
            // cập nhật lại số trước và hiện tại (prev and curr)
            long next = prev + curr;
            prev = curr;
            curr = next;
        }

        return false;
    }
}
