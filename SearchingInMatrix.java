import java.util.Scanner;

public class SearchingInMatrix {
    public static boolean StaircaseSearch(int arr[][], int key) {
        int row = arr.length-1;
        int col = 0;
        while (col < arr.length && row >= 0 ) {
            if (key == arr[row][col]) {
                System.out.println("Key found \n" + "(" + row +", " + col + ")");
                return true;
            } else if(key < arr[row][col]) {
                row--;
            }else {
                col++;
            }
        }
        System.out.println("Key not found ");
        return false;
    }
    public static void main(String[] args) {
        int row, column, key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of row and column respectively : ");
        row = sc.nextInt();
        column = sc.nextInt();
        int arr [][] = new int [row][column];
        System.out.println("Enter the elements in the array : ");
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
        System.out.println("Enter the key you want to search ");
        key = sc.nextInt();
        StaircaseSearch(arr, key);
        sc.close();
    }
}
