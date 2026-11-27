package stack;
import java.util.Stack;
public class checkpalindrome {


    public static void main(String[] args) {

            String str = "MADAM";
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }

            String reverse = "";

            while (!stack.isEmpty()) {
                reverse = reverse + stack.pop();
            }

            if (str.equals(reverse)) {
                System.out.println("Palindrome String");
            } else {
                System.out.println("Not a Palindrome String");
            }
        }
    }


