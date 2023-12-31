public class BackTrackingPracticeQ1 {
    public static void printPath(int path[][]) {
        for (int j = 0; j < path.length; j++) {
            for (int i = 0; i < path.length; i++) {
                System.out.print(path[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int maze[][], int row, int col) {
        return (row >= 0 && row < maze.length && col >= 0 && col < maze.length && maze[row][col] == 1);
    }
    public static boolean solveMze(int maze[][]) {
        int N = maze.length;
        int path[][] = new int[N][N];
        if (solveMazeUtil(maze, path, 0, 0) == false) {
            System.out.print("The Path to the destination doesn't exist !");
            return false;
        }
        printPath(path);
        return true;
    }
    public static boolean solveMazeUtil(int maze[][], int path[][], int row, int col) {
        if (row == maze.length - 1 && col == maze.length - 1 && maze[row][col] == 1) {
            path[row][col] = 1;
            return true;
        }
        if (isSafe(maze, row, col)) {          // == true
            if (path[row][col] == 1) 
                return false;
            path[row][col] = 1;
            if (solveMazeUtil(maze, path, row + 1, col)) 
                return true;
            if(solveMazeUtil(maze, path, row, col + 1))
                return true;
            path[row][col] = 0;
            return false;
        }
        return false;
    }
    public static void main (String args[]) {
        // int maze[][] = { {1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1} };
        int maze[][] = {{1, 0, 0, 0, 0},
                       {1, 1, 0, 1, 0},
                       {0, 1, 1, 1, 0},
                       {0, 1, 0, 1, 0},
                       {1, 1, 1, 1, 1}};
        solveMze(maze);
    }
}
