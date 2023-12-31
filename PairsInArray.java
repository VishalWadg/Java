public class PairsInArray {
    public static void pair(int arr[]) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("( " + i + ", " + j + " )");
                counter++;
            }
            System.out.println();
        }
        System.out.println("The total number of pairs is : " + counter);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 6, 8, 9, };
        pair(arr);
    }
}
