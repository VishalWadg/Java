import java.util.Scanner;

public class CheckPalindrome {
    public static void palindrome(int n) {
        int reversed = 0, n1 = n;
        while (n > 0) {
            reversed = (reversed * 10) + n % 10;
            n /= 10;
        }
        if (reversed == n1) {
            System.out.println("The entered number is a palindrome number !");
        } else {
            System.out.println("The entered number is not a palindrome number !");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter any number : ");
        n = sc.nextInt();
        palindrome(n);
        sc.close();
    }
}
