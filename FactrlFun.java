import java.util.Scanner;

public class FactrlFun {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter any no. : ");
        n = sc.nextInt();
        System.out.println("The value of n! is : "+factorial(n));
        sc.close();
    }
}
