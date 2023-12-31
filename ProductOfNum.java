import java.util.Scanner;

public class ProductOfNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = a * b;
        System.out.println(c);
        sc.close();
    }
}
