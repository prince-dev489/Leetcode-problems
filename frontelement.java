package Queue;

public class frontelement {

        public static void main(String[] args) {

            int[] queue = {10, 20, 30, 40, 50};

            int front = 0;
            int rear = 4;

            if (front == -1 || front > rear) {
                System.out.println("Queue is Empty");
            } else {
                System.out.println("Front element: " + queue[front]);
            }
        }
    }

