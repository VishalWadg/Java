public class ArraysAssignmentQ3 {
    public static int answer(int arr[]) {
        int MaxP = 0, profit = 0, bp = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (bp < arr[i]) {
                profit = arr[i] - bp;
                MaxP = Math.max(MaxP, profit);
            } else {
                bp = arr[i];
            }
        }
        return MaxP;
    }
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println("The maximum profit we could earn is : " + answer(arr));
    }
}
