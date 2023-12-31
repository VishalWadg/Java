import java.util.Scanner;

public class SolidRhombusPattern {
    public static void display(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter any number : ");
        n = sc.nextInt();
        display(n);
        sc.close();
    }
}
