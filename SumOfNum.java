import java.util.Scanner;

public class SumOfNum{
    public static void main(String args[]){
        System.out.println("Enter Two numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a-b;
        System.out.print("The Sum of the two numbers is : ");
        System.out.println(c);
        sc.close();
    }
}