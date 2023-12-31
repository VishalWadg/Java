import java.util.Scanner;

public class CntnueStmnt {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number : ");
            n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println(" :| ");
                continue;
            }
        } while (true);
    }
}
