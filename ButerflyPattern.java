import java.util.Scanner;

public class ButerflyPattern {
    public static void display(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2*n; j++) {
                if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        n = sc.nextInt();
        display(n);
        sc.close();
    }
}
