package Queue;

public class deleteelement {

        public static void main(String[] args) {

            int[] queue = {10, 20, 30, 40, 50};

            int front = 0;
            int rear = 4;

            if (front == -1 || front > rear) {
                System.out.println("Queue Underflow");
            } else {
                System.out.println("Deleted element: " + queue[front]);
                front++;
            }

            System.out.println("Queue after deletion:");

            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
    }
