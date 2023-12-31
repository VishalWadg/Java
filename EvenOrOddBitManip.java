public class EvenOrOddBitManip {
    public static void IsEvenOrOdd(int n) {
        int BitMask = 1;
        if ((n & BitMask) == 0) {
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        int n = 22, a = 3, b = 6;
        IsEvenOrOdd(n);
        IsEvenOrOdd(a);
        IsEvenOrOdd(b);
    }
}
