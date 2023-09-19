import java.util.*;

public class J02105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); // Số đỉnh của đồ thị

        int[][] adjacencyMatrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                adjacencyMatrix[i][j] = input.nextInt(); // Nhập ma trận kề
            }
        }

        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List<Integer> neighbors = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    neighbors.add(j + 1); // Đánh số đỉnh từ 1 đến N
                }
            }
            adjacencyList.add(neighbors);
        }

        // In danh sách kề
        for (int i = 0; i < N; i++) {
            System.out.print("List(" + (i + 1) + ") = ");
            for (Integer neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
