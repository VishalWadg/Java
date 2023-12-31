import java.util.Scanner;

public class DPpart6AssignmentQ1 {
    public static void printTrib(int n){
        int arr[] = new int[n];
        arr[0] = arr[1] = 0;
        arr[2] = 1;
        for (int i = 3; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  +ve num > ");
        n = sc.nextInt();
        printTrib(n);
    }
}
