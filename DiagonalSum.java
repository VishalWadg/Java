import java.util.Scanner;

public class DiagonalSum {
    public static void add(int arr[][]) {
        int sum1 = 0, sum2 = 0;
        int col = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            // pd
            sum1 += arr[i][i];
            //sd
            if (i == col) {
                col--;
                continue;
            }
            sum2 += arr[i][col];
            col--;
        }
        System.out.println("The sum of the diagonals are : " + sum1 + " " + sum2 + " and the combined sum of diagonals is : " + (sum1 + sum2));
    }
    public static void main(String[] args) {
        int row, column;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        column = row;
        int arr [][] = new int [row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        add(arr);
        sc.close();
    }
}
