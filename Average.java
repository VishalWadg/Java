import java.util.Scanner;

public class Average {
    public static void main(String args[]) {
        float a, b, c, aver;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Three numbers : ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        aver = (a+b+c)/3;
        System.out.println("The average of the Three numbers entered is : "+aver);
        sc.close();
        
    }
    
}
