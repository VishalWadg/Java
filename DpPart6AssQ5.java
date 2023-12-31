public class DpPart6AssQ5 {
    public static int countParentheUtil(int arr[], int n){
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                arr[i] += arr[j] * arr[i - j - 1];
            }
        }
        return arr[n];
    }
    public static int countParenthe(int n) {
        int arr[] = new int[n + 1];
        countParentheUtil(arr, n);
        return arr[n];
    }
    public static void main(String[] args) {
       int n = 4;
       System.out.println(" > " + countParenthe(n));
    }
}
