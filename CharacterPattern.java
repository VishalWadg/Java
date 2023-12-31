import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        int n;
        char ch = 'A';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no. : ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
        sc.close();
    }
}
