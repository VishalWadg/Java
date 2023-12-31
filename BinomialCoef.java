import java.util.Scanner;

public class BinomialCoef {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int NcR(int n, int r) {
        int ans = factorial(n) / (factorial(r) * factorial(n - r));
        ;
        return ans;
    }

    public static void main(String[] args) {
        int n, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the n and r respectively : ");
        n = sc.nextInt();
        r = sc.nextInt();
        System.out.println("The value of binomial coefficient is : " + NcR(n, r));
        sc.close();
    }
}
