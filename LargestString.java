public class LargestString {
    public static String largest(String fruits []) {
        String larstr = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (larstr.compareTo(fruits[i]) < 0) {
                larstr = fruits [i];
            }
        }
        return larstr;
    }
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        System.out.println("The largest string is : " + largest(fruits));
    }
}