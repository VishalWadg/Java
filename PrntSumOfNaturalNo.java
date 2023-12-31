import java.util.Scanner;

public class PrntSumOfNaturalNo {
    public static void main (String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        n = sc.nextInt();
        int sum = 0;
        int counter = 1;
        while (counter <= n) {
            sum += counter;
            counter++;
        }
        System.out.println("The sum of first n natural numbers is : "+sum);
        sc.close();
    }
    
}
