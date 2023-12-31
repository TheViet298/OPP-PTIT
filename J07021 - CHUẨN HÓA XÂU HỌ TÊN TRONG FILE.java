import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true) {
            String s = sc.nextLine();
            if (s.compareTo("END") == 0)
                break;
            Vector<String> a = new Vector<String>();
            String x = "";
            s = s.toLowerCase() + " ";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    if (x != "") {
                        a.add(x);
                        x = "";
                    }
                } else {
                    x += s.charAt(i);
                }
            }
            for (int i = 0; i < a.size(); i++) {
                String k = a.get(i);
                System.out.print(k.substring(0, 1).toUpperCase() + k.substring(1) + " ");
            }
            System.out.println();
        }
    }
}
