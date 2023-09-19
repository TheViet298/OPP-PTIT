// THU GỌN DÃY SỐ

import java.util.*;

public class J02017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); 
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (!st.isEmpty() && (arr[i] + st.peek()) % 2 == 0) { // tổng của giá trị hiện tại và đỉnh ngăn xếp ( 2 số cạnh nhau = chẵn thì pop())
                st.pop(); // xóa 
            } else { // lẻ và bằng 0 thì push 
                st.push(arr[i]);
            }
        }

        System.out.println(st.size()); // in ra size 

        input.close();
    }
}
