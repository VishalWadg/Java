import java.util.Scanner;

public class MinndMaxIn2DArray {
    public static void MaxMin(int arr[][]) {
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                Max = Math.max(Max, arr[i][j]);
                Min = Math.min(Min, arr[i][j]);
            }
        }
        System.out.println("The largest element in the given 2D array is : " + Max);
        System.out.println("The smallest element in the given 2D array is : " + Min);
    }
    public static void main(String[] args) {
        int arr[][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        MaxMin(arr);
    }
}
