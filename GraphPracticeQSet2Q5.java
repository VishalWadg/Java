public class GraphPracticeQSet2Q5 {
    public static void dfs(int matrix[][], boolean vis[][], int x, int y, int n, int m, boolean hasCornerCell) {
        if (x < 0 || y < 0 || x >= n || y >= m || (vis[x][y] == true || matrix[x][y] == 0)) {
            return;
        }
        if (x == 0 || y == 0 || x == n - 1 || y == m - 1) {
            if (matrix[x][y] == 1) {
                hasCornerCell = true;
            }
        }
        vis[x][y] = true;
        dfs(matrix, vis, x + 1, y, n, m, hasCornerCell);
        dfs(matrix, vis, x, y + 1, n, m, hasCornerCell);
        dfs(matrix, vis, x - 1, y, n, m, hasCornerCell);
        dfs(matrix, vis, x, y - 1, n, m, hasCornerCell);
    }

    public static int closedIsland(int matrix[][], int n, int m) {
        boolean vis[][] = new boolean[n][m];
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i != 0 && j != 0 && i != n - 1 && j != m - 1) && matrix[i][j] == 1 && vis[i][j] == false) {
                    boolean hasCornerCell = false;
                    dfs(matrix, vis, i, j, n, m, hasCornerCell);
                    if (!hasCornerCell) { 
                        result = result + 1;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 5, M = 8;
        int[][] matrix = { { 0, 0, 0, 0, 0, 0, 0, 1 },
                           { 0, 1, 1, 1, 1, 0, 0, 1 },
                           { 0, 1, 0, 1, 0, 0, 0, 1 },
                           { 0, 1, 1, 1, 1, 0, 1, 0 },
                           { 0, 0, 0, 0, 0, 0, 0, 1 } };
        System.out.println("Number of closed island's is > " + closedIsland(matrix, N, M));
    }
}
