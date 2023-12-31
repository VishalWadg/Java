import java.util.Scanner;

public class SumOfEvnNdOd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, elem, i = 1, sumev = 0, sumod = 0;
        System.out.print("Enter the number of no. you want to enter : ");
        n = sc.nextInt();
        System.out.println("Enter numbers : ");
        while (i <= n) {
            elem = sc.nextInt();
            if (elem % 2 == 0) {
                sumev += elem;
            } else {
                sumod += elem;
            }
            i++;
        }
        System.out.println("The sum of even elements entered is : " + sumev);
        System.out.println("The sum of odd elements entered is : " + sumod);
        sc.close();
    }

}
