import java.util.*;

public class ex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int i = 0; i < n; i++) {
            setA.add(input.nextInt());
        }
        for (int i = 0; i < m; i++) {
            setB.add(input.nextInt());
        }

        // Tìm tập giao của A và B
        Set<Integer> intersection = new TreeSet<>();
        for (int num : setA) {
            if (setB.contains(num)) {
                intersection.add(num);
            }
        }

        // In tập giao
        boolean firstElement = true;
        for (int num : intersection) {
            if (!firstElement) {
                System.out.print(" ");
            }
            System.out.print(num);
            firstElement = false;
        }

        input.close();
    }
}
