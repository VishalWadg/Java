import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String args[]) {
        float pi = 3.14f;
        System.out.print("Enter Radius of the circle : ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        float area = pi * r * r;
        System.out.println("The area of the circle is : "+area);
        sc.close();
    }
    
}
