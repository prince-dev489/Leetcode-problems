package stack;
import java.util.Stack;
public class reverseelementofstack {




        public static void main(String[] args) {

            Stack<Integer> stack1 = new Stack<>();
            Stack<Integer> stack2 = new Stack<>();

            // Insert elements
            stack1.push(10);
            stack1.push(20);
            stack1.push(30);
            stack1.push(40);
            stack1.push(50);

            System.out.println("Original Stack: " + stack1);


            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            System.out.println("Reversed Stack: " + stack2);
        }
    }


