
import java.util.Scanner;

public class J01022 {
    static long[]F = new long[100];
    private static int fibo(int n,long k){
        if(n==1) return 0;
        if(n==2) return 1;
        if(k<=F[n-2]) return fibo(n-2,k);
        return fibo(n-1,k-F[n-2]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        F[0]=0;
        F[1]=1;
        for(int i=2;i<=92;i++) F[i] = F[i-1] + F[i-2];
        while (t-- > 0) {
           int n = input.nextInt();
           long k = input.nextLong();
           System.out.println(fibo(n,k));
        }
    }
}
