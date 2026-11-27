
package stack;

public class middleelement {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    static class MyStack {
        Node top;
        int size = 0;


        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
            size++;
        }


        void pop() {
            if (top == null) {
                System.out.println("Stack is Empty");
                return;
            }

            top = top.next;
            size--;
        }

        // Find middle element
        void findMiddle() {
            if (top == null) {
                System.out.println("Stack is Empty");
                return;
            }

            int mid = size / 2;
            Node temp = top;

            for (int i = 0; i < mid; i++) {
                temp = temp.next;
            }

            System.out.println("Middle Element: " + temp.data);
        }

        // Display stack
        void display() {
            Node temp = top;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }

   
    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack Elements:");
        stack.display();

        stack.findMiddle();
    }
}


