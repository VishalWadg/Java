import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args){
        int rad;
        System.out.println("Enter the radius of the circle : ");
        Scanner ob= new Scanner(System.in);
        rad=ob.nextInt();
        System.out.print("The area of the circle is : ");
        System.out.println(3.14*rad*rad);
    }
    
}
