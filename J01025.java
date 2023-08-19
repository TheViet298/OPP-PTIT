import java.util.Scanner;

public class J01025 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int x3 = input.nextInt();
        int y3 = input.nextInt();
        int x4 = input.nextInt();
        int y4 = input.nextInt();

        int minX = Math.min(Math.min(x1, x2), Math.min(x3, x4));
        int minY = Math.min(Math.min(y1, y2), Math.min(y3, y4));

        int maxX = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        int maxY = Math.max(Math.max(y1, y2), Math.max(y3, y4));

        int side = Math.max(maxX - minX, maxY - minY);

        System.out.println(side * side);

        input.close();
    }
}
