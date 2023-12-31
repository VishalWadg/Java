public class ratInmazeMycode {


    //  I wrote this code it only prints one path to the target
    // I couldn't solve the problem but it prints path even if the path goes in all four directions i.e. up, down, left, right


    public static void printPath(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void ratInMaze(int arr[][], int path[][], int row , int col) {
        if (row == arr.length - 1 && col == arr.length - 1 ) {
            path[row][col] = 1;
            printPath(path);
            return;
        }
        path[row][col] = 1;
        if (col + 1 < arr[row].length && arr[row][col + 1] == 1) {
            arr[row][col + 1] = 0;
            ratInMaze(arr, path, row, col + 1);
        }
        if (row + 1 < arr.length && arr[row + 1][col] == 1) {
            arr[row + 1][col] = 0;
            ratInMaze(arr, path, row + 1, col);
        }
        if (col - 1 >= 0 && arr[row][col - 1] == 1) {
            arr[row][col - 1] = 0;
            ratInMaze(arr, path, row, col - 1);
        }
        if (row - 1 >= 0 && arr[row - 1][col] == 1) {
            arr[row - 1][col] = 0;
            ratInMaze(arr, path, row - 1, col);
        }
        
        path[row][col] = 0;
        return;
    }
    public static void main (String args[]) {
        int arr[][] = {{1, 0, 0, 0, 0},
                       {1, 1, 0, 1, 0},
                       {0, 1, 1, 1, 0},
                       {0, 0, 0, 1, 0},
                       {1, 1, 1, 1, 1}};
        int path[][] = {{0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0}};
        int row = 0, col = 0;
        ratInMaze(arr, path, row, col);
    }
}
