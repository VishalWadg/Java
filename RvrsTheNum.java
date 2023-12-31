import java.util.Scanner;

public class RvrsTheNum {
    public static void main (String args[]){
        int n,dup;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        n = sc.nextInt();
        dup = n;
        n = 0;
        while (dup > 0) {

            n = n*10+(dup % 10);
            dup /= 10;
        }
        System.out.println(n);
        sc.close();
    }
    
}
