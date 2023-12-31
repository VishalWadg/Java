public class PracticeQ1_2D_Arrays {
    public static void print_no_of7s(int arr[][]) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    counter++;
                }
            }
        }
        System.out.println("The number of 7's in the given array is : " + counter);
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 7, 19},
                       {7, 5, 17}};
        print_no_of7s(arr);
    }
}
