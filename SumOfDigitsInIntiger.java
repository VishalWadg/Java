import java.util.Scanner;

public class SumOfDigitsInIntiger {
    public static int add(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter any number : ");
        n = sc.nextInt();
        System.out.println("The Sum of Digits of the Entered number is : " + add(n));
        sc.close();
    }
}
