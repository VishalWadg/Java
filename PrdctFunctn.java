import java.util.Scanner;

public class PrdctFunctn {
    public static int Multply(int a, int b) {
        int prdct = a * b;
        return prdct;
    }

    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers : ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("The product of two entered numbers is : " + Multply(x, y));
        sc.close();
    }
}
