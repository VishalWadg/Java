public class StringCompression {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        Integer count;
        for (int i = 0; i < str.length(); i++) {
            count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println("The compressed string is : " + compress(str));
    }
}
