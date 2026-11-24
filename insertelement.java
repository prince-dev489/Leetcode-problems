package Queue;
import java.util.Scanner;
public class insertelement {




        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int size = 5;
            int[] queue = new int[size];

            int front = -1;
            int rear = -1;

            System.out.println("Enter element to insert:");
            int value = sc.nextInt();

            if (rear == size - 1) {
                System.out.println("Queue Overflow");
            } else {
                if (front == -1) {
                    front = 0;
                }

                rear++;
                queue[rear] = value;

                System.out.println(value + " inserted successfully");
            }

            sc.close();
        }
    }


