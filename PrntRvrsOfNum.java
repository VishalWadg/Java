import java.util.Scanner;

public class PrntRvrsOfNum {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        n = sc.nextInt();
        while (n > 0) {
            System.out.print(n%10);
            n = n/10;
        }
        sc.close();
    }
    
}
