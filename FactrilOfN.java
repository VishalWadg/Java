import java.util.Scanner;

public class FactrilOfN {
    public static void main(String[] args) {
        int n, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + n + " is : " + fact);
        sc.close();
    }
}
