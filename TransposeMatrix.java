import java.util.Scanner;

public class TransposeMatrix {
    public static void tm(int arr[][], int row, int col) {
        int ans [][] = new int [col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[j][i] = arr[i][j];
            }
        }
        System.out.println("The transpose of the given matirx is : ");
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row ; i++) {
                System.out.print(ans[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        System.out.println("Enter the no of rows and columns in the matrix respectively : ");
        row = sc.nextInt();
        col = sc.nextInt();
        int arr[][] = new int [row][col];
        System.out.println("Enter the elements of the matrix : ");
        for (int j = 0; j < row; j++) {
            for (int i = 0; i < col ; i++) {
                arr[j][i] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix : ");
        for (int j = 0; j < row; j++) {
            for (int i = 0; i < col ; i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        tm(arr, row, col);
        sc.close();
    }
}
