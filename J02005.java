import java.util.*;

public class J02005 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB= new HashSet<>();

        int n = input.nextInt();
        int m = input.nextInt();

        for (int i = 0; i < n; i++) {
            setA.add(input.nextInt());
        }
        for (int i = 0; i < m; i++) {
            setB.add(input.nextInt());
        }
        Set<Integer> set = new TreeSet<>();
        for (int x : setA)
        {
            if (setB.contains(x)) // x có trong b thì add vào set mới đó là giao
            {
                set.add(x);
            }
        }
        boolean found = true;
        for (int se : set)
        {
            if (!found)
            {
                System.out.print(" ");
            }
            System.out.print(se);
            found = false;
        }
        input.close();
    }
}