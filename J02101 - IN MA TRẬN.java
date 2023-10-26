// IN MA TRẬN
import java.util.*;          // Import mọi thứ trong gói java.util

public class J02101 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while(t-- > 0)
        {
            int n = input.nextInt();

            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    matrix[i][j] = input.nextInt(); // nhập ma trận
                }
            }

            for (int i = 0; i < n; i++)
            {
                if ( i % 2 == 0){ // in xuôi
                    for (int j = 0; j < n; j++){
                        System.out.print(matrix[i][j] + " ");
                    }
                }
                else{ // lẻ in ngược
                    for (int j = n - 1; j >= 0; j--){
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
        input.close();
    }
}

