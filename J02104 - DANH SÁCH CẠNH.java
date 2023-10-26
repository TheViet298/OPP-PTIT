import java.util.*;

public class J02104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); // Số đỉnh của đồ thị

        int[][] adj = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                adj[i][j] = input.nextInt(); // Nhập ma trận kề
            }
        }

        List<Edge> edgeList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (adj[i][j] == 1 && i < j) {
                    edgeList.add(new Edge(i, j)); // Thêm cạnh vào danh sách cạnh
                }
            }
        }

        // In danh sách cạnh
        for (Edge edge : edgeList) {
            System.out.println("(" + edge.start + "," + edge.end +")");
        }

        input.close();
    }

    static class Edge {
        int start, end;

        public Edge(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
