import java.util.Scanner;

public class BreakStmnt {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number : ");
            n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
        System.out.println("You did not listen to me !");
        sc.close();
    }
    
}
