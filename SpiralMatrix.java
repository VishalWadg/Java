public class SpiralMatrix {
    public static void PrintMatrix(int arr[][]) {
        int row_start = 0, row_end = arr.length - 1, col_start = 0, col_end = arr[0].length - 1;
        while (row_start <= row_end && col_start <= col_end) {
            // Top
            for (int j = col_start; j <= col_end; j++) {
                System.out.print(arr[row_start][j] + " ");
            }
            row_start++;
            // Right
            for (int i = row_start; i <= row_end; i++) {
                System.out.print(arr[i][col_end] + " ");
            }
            col_end--;
            // Bottom
            for (int i = col_end; i >= col_start; i--) {
                if (row_start == row_end) {
                //    break; // avoid repeated printing of elements
                }
                System.out.print(arr[row_end][i] + " ");
            }
            row_end--;
            // Left
            for (int i = row_end; i >= row_start; i--) {
                if (col_start == col_end) {
                //    break; // avoid repeated printing of elements
                }
                System.out.print(arr[i][col_start] + " ");
            }
            col_start++;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        PrintMatrix(arr);
    }
}
