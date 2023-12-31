import java.util.Scanner;
public class MultTabl {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        n = sc.nextInt();
        int b = n;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n);
            n += b;
        }
        sc.close();
    }
}
