import java.util.Scanner;

public class PrimeORNot {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            boolean isprime = true;
            System.out.print("Enter any number : ");
            n = sc.nextInt();
            for (i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
                System.out.println("Not a prime no!");
                break;
            }
            }
            if (isprime == true) {
                System.out.println("This is a prime no!");
            }
            
        }
    }
}
