public class ArraysAssignmentQ1 {
    public static boolean answer(int arr[]) {
        int chek[] = new int[10000006];
        for (int i = 0; i < chek.length; i++) {
            chek[i] = -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (chek[arr[i]] != -1) {
                return true;
            } else {
                chek[arr[i]] = i;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5 };
        System.out.println(" > " + answer(arr));
    }
}
