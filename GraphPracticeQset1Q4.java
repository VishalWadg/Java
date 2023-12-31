public class GraphPracticeQset1Q4 {
    static int count, ROW, COL;
    public static boolean isSafe(int M[][], boolean vis[][], int row, int col) {
        return ((row >= 0 && row < ROW) && (col >= 0 && col < COL) && (M[row][col] == 1 && !vis[row][col]));
    }

    public static void DFS(int M[][], boolean vis[][], int row, int col) {
        int rNmbr[] = {-1, 0, 1, -1, 1, -1, 0, 1};
        int cNmbr[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        vis[row][col] = true;
        for (int i = 0; i < 8; i++) {
            if (isSafe(M, vis, row + rNmbr[i], col + cNmbr[i])) {
                count++;
                DFS(M, vis, row + rNmbr[i], col + cNmbr[i]);
            }
        }
    }

    public static int largestRegion(int M[][]) {
        ROW = M.length;
        COL = M[0].length;
        int result = 0;
        boolean vis[][] = new boolean[ROW][COL];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (M[i][j] == 1 && !vis[i][j]) {
                    count = 1;
                    DFS(M, vis, i, j);
                    result = Math.max(result, count);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int M[][] = { { 0, 0, 1, 1, 0 },
                      { 1, 0, 1, 1, 0 },
                      { 0, 1, 0, 0, 0 },
                      { 0, 0, 0, 0, 1 } };
        ROW = 4;
        COL = 5;
        System.out.println(largestRegion(M));
    }
}
