import java.util.Scanner;

class vario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter two no");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.print("The addition of the two numbers is : ");
        System.out.println(c);

    }
}