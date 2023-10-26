import java.util.*;

public class J03009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        input.nextLine(); // Consume the newline character after reading an integer
        while (t-- > 0) {
            String s1 = input.nextLine();
            String s2 = input.nextLine();
            
            // Tách thành các từ riêng lẻ bởi dấu " " trong mảng
            String[] words1 = s1.split(" ");
            String[] words2 = s2.split(" ");
            
            // Thêm vô set
            TreeSet<String> set1 = new TreeSet<>(); // chuyển mảng sang danh sách
            for (String word : words1) {
                set1.add(word);
            }
            TreeSet<String> set2 = new TreeSet<>(); 
            for (String word : words2) {
                set2.add(word);
            }

            // Tạo set mới để lưu phần tử k xuất hiện trong set2
            TreeSet<String> difference = new TreeSet<>();
            for (String s : set1)
            {
                if (!set2.contains(s)){ // phần tử trong s2 không xuất hiện trong s1
                    difference.add(s);
                }
            }
            
            // in kết quả
            for (String s : difference) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
