import java.util.Scanner;

public class IsEven {
    public static boolean iseven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter any no : ");
        n = sc.nextInt();
        System.out.println(" : " + iseven(n));
        sc.close();
    }
}
