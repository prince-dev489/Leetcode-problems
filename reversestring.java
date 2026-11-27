package stack;
import java.util.Stack;
public class reversestring {




        public static void main(String[] args) {

            String str = "PRINCE";
            Stack<Character> stack = new Stack<>();


            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }


            String reverse = "";

            while (!stack.isEmpty()) {
                reverse = reverse + stack.pop();
            }

            System.out.println("Original String: " + str);
            System.out.println("Reversed String: " + reverse);
        }
    }


