import java.util.*;

public class J02103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        int step = 1;
        
        while (t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();

            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = input.nextInt();
                }
            }
            
            System.out.println("Test " + step++ + ":");
            
            // Ma trận chuyển vị
            int[][] matrix_transposed = new int[m][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix_transposed[j][i] = matrix[i][j];
                }
            }
            
            // Tính tích ma trận với ma trận chuyển vị - ma trận tích có kích thước số hàng của ma trận 1 = số cột của ma trận 2
            int[][] product = new int[n][n]; // Kích thước của ma trận tích là n x n
            for (int i = 0; i < n; i++) { //  duyệt số hàng của ma trận 1
                for (int j = 0; j < n; j++) { // duyệt số cột ma trận 2
                    int sum = 0; // khởi tạo 1 matrax x hoặc biến sum;
                    for (int k = 0; k < m; k++) { // duyệt số hàng của ma trận 1 ( nhân thông qua nó)
                        sum += matrix[i][k] * matrix_transposed[k][j];
                    }
                    product[i][j] = sum;
                }
            }
            
            // In ma trận tích
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
        }
        input.close();
    }
}
