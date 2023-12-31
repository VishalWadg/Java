public class MountainRangeDp {
    public static int mountainRange(int n){
        int arr[] = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                int inside = arr[j];
                int outside = arr[i - j - 1];
                arr[i] += inside * outside;
            }
        }
        return arr[n];
    }
    public static void main(String args[]){
        int n = 4;
        System.out.print(">"+mountainRange(n));
    }
}
