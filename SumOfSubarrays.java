public class SumOfSubarrays {
    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.println(sum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 4, 9, 1 };
        display(arr);
    }
}
