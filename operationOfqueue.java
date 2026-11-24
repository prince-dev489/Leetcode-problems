package Queue;
import java.util.Scanner;
public class operationOfqueue {





        static int[] queue = new int[5];
        static int front = -1;
        static int rear = -1;

        // Insert element
        static void enqueue(int value) {
            if (rear == queue.length - 1) {
                System.out.println("Queue Overflow");
            } else {
                if (front == -1) {
                    front = 0;
                }
                rear++;
                queue[rear] = value;
                System.out.println("Element inserted");
            }
        }

        // Delete element
        static void dequeue() {
            if (front == -1 || front > rear) {
                System.out.println("Queue Underflow");
            } else {
                System.out.println("Deleted: " + queue[front]);
                front++;

                if (front > rear) {
                    front = -1;
                    rear = -1;
                }
            }
        }

        // Display front element
        static void peek() {
            if (front == -1) {
                System.out.println("Queue is Empty");
            } else {
                System.out.println("Front: " + queue[front]);
            }
        }

        // Display rear element
        static void rearElement() {
            if (rear == -1) {
                System.out.println("Queue is Empty");
            } else {
                System.out.println("Rear: " + queue[rear]);
            }
        }

        // Display all elements
        static void display() {
            if (front == -1) {
                System.out.println("Queue is Empty");
            } else {
                System.out.println("Queue elements:");
                for (int i = front; i <= rear; i++) {
                    System.out.print(queue[i] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n--- QUEUE OPERATIONS ---");
                System.out.println("1. Enqueue");
                System.out.println("2. Dequeue");
                System.out.println("3. Front Element");
                System.out.println("4. Rear Element");
                System.out.println("5. Display");
                System.out.println("6. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter value: ");
                        int value = sc.nextInt();
                        enqueue(value);
                        break;

                    case 2:
                        dequeue();
                        break;

                    case 3:
                        peek();
                        break;

                    case 4:
                        rearElement();
                        break;

                    case 5:
                        display();
                        break;

                    case 6:
                        System.out.println("Program Exited");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

            } while (choice != 6);

            sc.close();
        }
    }


