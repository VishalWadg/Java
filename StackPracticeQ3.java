import java.util.Stack;
public class StackPracticeQ3 {
    public static String decode (String str) {
       Stack<Integer>intStck = new Stack<Integer>();
       Stack<Character>stringStack = new Stack<Character>();
       String res = "", temp = "";
       for (int i = 0; i < str.length(); i++) {
                int count = 0;
                // System.out.println(Character.isDigit(str.charAt(i)));
                if (Character.isDigit(str.charAt(i))) {
                    while (Character.isDigit(str.charAt(i))) {
                        count = (count * 10) + (str.charAt(i) - '0');
                        i++;
                    }
                    i--;
                    intStck.push(count);
                } else if (str.charAt(i) == ']') {
                    temp = "";
                    count = 0;
                    if (!intStck.isEmpty()) {
                        count = intStck.peek();
                        intStck.pop();
                    }
                    while (!stringStack.isEmpty() && stringStack.peek() != '[') {
                        temp = stringStack.peek() + temp;
                        stringStack.pop();
                    }
                    if (!stringStack.isEmpty() && stringStack.peek() == '[') {
                        stringStack.pop();
                    }
                    for (int j = 0; j < count; j++) {
                        res = res + temp;
                    }
                    for (int j = 0; j < res.length(); j++) {
                        stringStack.push(res.charAt(j));
                    }
                    res = "";
                } else if (str.charAt(i) == '[') {
                    if (Character.isDigit(str.charAt(i - 1))) {     //  <--- I had made a mistake here and hence had to spend an hour finding the mistake
                        stringStack.push(str.charAt(i));            //    The mistake was  Character.isDigit(i - 1)   instead of   Character.isDigit(str.charAt(i - 1))
                    } else {
                        stringStack.push(str.charAt(i));
                        intStck.push(1);
                    }
                } else {
                    stringStack.push(str.charAt(i));
                }     
       }
       while (!stringStack.isEmpty()) {
                res = stringStack.peek() + res;
                stringStack.pop();
       }
       return res;
    }
    public static void main (String args[]) {
        String str = "3[b2[c]]";
        String res = decode(str);
        System.out.print(" > " + res);
    }
}
