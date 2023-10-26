import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        if (a != 0) {
            double x = -b / a;
            System.out.printf("%.2f", x); // định dạng 2 số thập phân 
        } else {
            if (b == 0) {
                System.out.println("VSN");
            } else {
                System.out.println("VN");
            }
        }

        input.close();
    }
}
