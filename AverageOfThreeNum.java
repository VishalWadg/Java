import java.util.Scanner;

public class AverageOfThreeNum {
    public static void averg(int a, int b, int c) {
        int averg = (a + b + c)/3;
        System.out.println("The average of the Entered three numbers is : "+(float)averg);
    }
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers : ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        averg(x, y, z);
    }
}
