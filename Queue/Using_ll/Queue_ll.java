//package Queue.Using_ll;

import java.util.Scanner;

public class Queue_ll {
    static class Que{
        Scanner s=new Scanner(System.in);

        static class Node{
            int data;
            Node next;
            Node(int data)
            {
                this.data=data;
                this.next=null;
            }
        }
        Node front=null;
        Node rear=null;

        void Enqueue()
        {int data, w;
        
            Node temp=rear;
            System.out.println("Enter data:");
            data=s.nextInt();
            Node new_node=new Node(data);
            if(front==null)
            {
                front=new_node;
                rear=new_node;
            }
            else{
                temp.next=new_node;
                rear=new_node;
                System.out.println("Item is inserted:");
               
            }
        }

        void Dequeue()
        {
            Node temp=front.next;
            front=temp;
            System.out.println("Item is deleted:");


        }
        void display()
        {
            Node temp=front;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;

            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Que qq=new Que();
        int w;
        do{
            System.out.println("Enter 1 to Enqueue, Enter 2 to Dequeue, Enter 3 to display");
            int m=s.nextInt();
            switch(m)
            {
                case 1:
                {
                    qq.Enqueue();
                    break;
                }
                case 2:
                {
                    qq.Dequeue();
                    break;
                }
                case 3:
                {
                    qq.display();
                    break;
                }
            }
            System.out.println("Enter 5 to go to main menu");
            w=s.nextInt();

        }while(w==5);
        
    }
    
}
