//package Stack.Using_array;

import java.util.Scanner;

public class Stack_arr {
    static class stack {

        Scanner s = new Scanner(System.in);
        
        int n=s.nextInt();
        int a[] = new int[n];
        int top = -1;

        void push() {

            if (top == n - 1) {
                System.out.println("overFlow condition i.e.  you can't insert further more !");
            } else {
                System.out.println("Enter data:");
                int k = s.nextInt();
                top += 1;
                a[top] = k;
                System.out.println("Item inserted!");
            }
        }

        void pop() {
            if (top == -1) {
                System.out.println("Underflow condition i.e you can't further delete item!");
            } else {
                top -= 1;
                System.out.println("Item is deleted!");
            }
        }

        void display() {
            System.out.println("Your expected stack array list:");
            for (int i = top; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        
        int w;

        stack st = new stack();
        do {
            System.out.println(
                    "Enter your choices\nEnter 1 for push operation, Enter 2 for pop operation and Enter 3 to display stack:");
            int c = s.nextInt();
            switch (c) {
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
            System.out.println("Enter 5 to back menu:");
            w = s.nextInt();
        } while (w == 5);

    }

}
