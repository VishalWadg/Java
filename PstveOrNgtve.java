import java.util.Scanner;

public class PstveOrNgtve {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The Entered number is positive ");
        } else {
            System.out.println((num == 0) ? "The number is 0 " : "The number is negative");
        }
        sc.close();
    }
}
