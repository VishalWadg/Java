public class BacktrackingPracticeQ3 {
    static int N = 8;
    public static boolean isSafe(int x, int y, int sol[][]) {
        return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }
    public static void printSol(int sol[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean solveKT() {
        int[][] sol = new int[N][N];
        int xMove[] = {2 ,1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sol[i][j] = -1;
            }
        }
        sol[0][0] = 0;
        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution doesn't exist");
            return false;
        } else 
            printSol(sol);
        return true;
    }
    public static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xMove[], int yMove[]) {
        if (movei == N * N) {
            return true;
        }
        for (int i = 0; i < 8; i++) {
            int next_x = x + xMove[i];
            int next_y = y + yMove[i];
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove)) 
                    return true;
                else
                    sol[next_x][next_y] = -1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        solveKT();
    }
}
