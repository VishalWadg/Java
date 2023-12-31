public class FloydWarshallsAlgo {
    static int infin = 99999999;
    public static void floydWarshalls(int arr[][]) {
        int n = arr.length;
        for (int k = 1; k < n; k++) {
            for (int i = 1; i < n; i++) {
                if (i == k) {
                    continue;
                }
                for (int j = 1; j < n; j++) {
                    if(i == j || j == k)
                        continue;
                    if (arr[i][j] > arr[i][k] + arr[k][j]) {
                        arr[i][j] = arr[i][k] + arr[k][j];
                    }
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == infin) {
                    System.out.print('i' + " ");
                    continue;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{0, 0, 0, 0, 0},
                       {0, 0, 3, infin, 5},
                       {0, 2, 0, infin, 4},
                       {0, infin, 1, 0, infin},
                       {0, infin, infin, 2, 0}};
        floydWarshalls(arr);
    }
}
