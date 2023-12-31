import java.util.Scanner;
public class LeapYear {
    public static void main(String args[]) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(" Leap year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not a Leap Year ");
        }
        sc.close();
    }

}
