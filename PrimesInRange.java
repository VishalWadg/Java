import java.util.Scanner;

public class PrimesInRange {
    public static void prntprime(int a, int b) {
        for (int i = a; i <= b; i++) {
            boolean isprime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a range : ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The prime numbers in the entered range are : ");
        prntprime(a, b);
        sc.close();
    }
}
