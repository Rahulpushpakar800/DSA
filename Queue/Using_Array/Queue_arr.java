//package Queue.Using_Array;

import java.util.Scanner;

import javax.swing.SwingConstants;

public class Queue_arr {

    static class Que {
        Scanner s = new Scanner(System.in);
        int front = -1;
        int rear = -1;
        int n = s.nextInt();
        int a[] = new int[n];

        void Enqueue() {
            
            if (rear == n - 1) {
                System.out.println("overFlow condition:");
            } else {
                if (front == -1 && rear == -1) {
                    front += 1;
                    rear += 1;
                    System.out.println("Enter data:");
                    int k = s.nextInt();
                    a[rear] = k;
                    System.out.println("Item is inserted:");

                } else {
                    System.out.println("Enter data:");
                    int k = s.nextInt();
                    rear += 1;

                    a[rear] = k;
                    System.out.println("Item is inserted:");

                }
            }

        }

        void Dequeue() {
            if (front == -1) {
                System.out.println("Underflow condition:");
            } else {
                front += 1;
                System.out.println("Item is deleted:");
            }

        }

        void display() {
            for (int i = front; i<=rear; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int w;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        Que qq = new Que();
        do {
            System.out.println("Enter 1 to Enqueue, Enter 2 to Dequeue , Enter 3 to Display items:");
            int m = s.nextInt();
            switch (m) {
                case 1: {
                    qq.Enqueue();
                    break;
                }
                case 2: {
                    qq.Dequeue();
                    break;
                }
                case 3: {
                    qq.display();
                    break;
                }
            }
            System.out.println("Enter 5 to go to main menu");
            w = s.nextInt();

        } while (w == 5);

    }

}
