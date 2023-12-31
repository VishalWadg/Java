import java.util.Scanner;

public class Bill {
    public static void main(String args[]) {
        float pencil, pen, eraser, bill;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prices of the items Pencil, Pen, Eraser Respectively : ");
        pencil = sc.nextFloat();
        pen = sc.nextFloat();
        eraser = sc.nextFloat();
        bill = (pen + pencil + eraser);
        System.out.println("The bill without 18 % GST is : " + bill);
        bill += (bill * 0.18);
        System.out.println("The bill with 18 % GST added is : " + bill);
        sc.close();
        
    }
    
}
