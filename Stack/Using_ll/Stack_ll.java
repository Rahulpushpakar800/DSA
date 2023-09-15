//package Stack.Using_ll;

import java.util.Scanner;

public class Stack_ll {
    static class stack {
        Scanner s = new Scanner(System.in);

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node top = null;

        void push() {
            int data;
            System.out.println("Enter item:");
            data = s.nextInt();
            Node new_node = new Node(data);
            if (top == null) {
                top = new_node;
            } else {
                new_node.next = top;
                top = new_node;
            }

        }

        void pop() {
            if (top == null) {
                System.out.println("stack does not exist");
            } else {
                top = top.next;
                System.out.println("Item is deleted!");
            }
        }

        void display() {

            Node temp = top;
            if (top == null) {
                System.out.println("Stack doesn't exist:");
            } else {
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int w;
        stack st = new stack();
        Scanner s = new Scanner(System.in);
        do {
            System.out.println(
                    "Enter your choices:\nEnter 1 to push item, Enter 2 to pop item, Enter 3 to display item:");
            int m = s.nextInt();
            switch (m) {
                case 1: {
                    st.push();
                    break;
                }
                case 2: {
                    st.pop();
                    break;
                }
                case 3: {
                    st.display();
                    break;
                }
            }
            System.out.println("Enter 5 to go to main menu:");
            w = s.nextInt();
        } while (w == 5);
    }

}
