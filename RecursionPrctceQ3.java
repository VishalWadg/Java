public class RecursionPrctceQ3 {
    public static void len(String str, int count) {
        StringBuilder newStr= new StringBuilder(str);
        if (newStr.isEmpty()) {
            System.out.println(count);
            return;
        }
        newStr.deleteCharAt(0);
        count++;
        len(newStr.toString(), count);
    }
    public static void main(String[] args) {
      String str = "vishal";
      int count = 0;
      len(str, count);
    }
}
