import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int width = scanner.nextInt();

        if (length <= 0 || width <= 0) {
            System.out.println("0");
        } else {
            int perimeter = 2 * (length + width);
            int area = length * width;

            System.out.println(perimeter + " " + area);
        }

        scanner.close();
    }
}
