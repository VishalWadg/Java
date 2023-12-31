import java.util.Scanner;

public class HollowRectangle {
    public static void display(int i, int j) {
        for (int k = 1; k <= i; k++) {
            for (int l = 1; l <= j; l++) {
                if ((k > 1 && k < i) && (l > 1 && l < j)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter row number and column number respectively : ");
        i = sc.nextInt();
        j = sc.nextInt();
        display(i, j);
        sc.close();
    }
}
