public class MatrixMultiplicationMinCost {

// MCM ->  Matrix Multiplication  Memoization & tabulation

    public static int matrixMulMincst(int arr[], int i, int j){
        if (i == j) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j-1; k++) {
            int cs1 = matrixMulMincst(arr, i, k);
            int cs2 = matrixMulMincst(arr, k + 1, j);
            int cs3 = arr[i-1] * arr[k] * arr[j];
            int fincst = cs1 + cs2 + cs3;
            ans = Math.min(ans, fincst);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 3};
        System.out.print(matrixMulMincst(arr, 1, 4));
    }
}
