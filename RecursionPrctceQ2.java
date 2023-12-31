public class RecursionPrctceQ2 {
    public static void toWords(String arr[], int n) {
        if (n == 0) {
            return;
        }
        toWords(arr, n/10);
        System.out.print(arr[n%10] + " ");
    }

    public static void main(String[] args) {
        String arr[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        int n = 57291832;
        toWords(arr, n);
    }
}
