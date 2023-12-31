public class PracticeQ2_2D_Arrays {
    public static void printsum(int arr[][]) {
        int sum = 0;
        for (int j = 0; j < arr[0].length; j++) {
            
                sum += arr[1][j];
        }
        System.out.println("The sum of the elements in the second row of the given array is : " + sum);
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 4, 9},
                       {11, 4, 3},
                       { 2, 2, 3}};
        printsum(arr);
    }
}
