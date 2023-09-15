import java.util.Scanner;

public class Circular_ll {
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
    Node head=null;
    Node tail=null;
    public void creation()
    {
        int data,n;
        do{
            System.out.println("Enter data:");
            data=s.nextInt();
            Node new_node=new Node(data);
            if(head==null)
            {
                head=new_node;
                tail=new_node;
                
            }
            else{
                Node temp=head;
                // new_node.next=head;
                // head=new_node;
                // tail.next=head;
                System.out.println("Enter 1 to insert from beginning, Enter 2 to insert from end, Enter 3 to insert from any position:");
                int p=s.nextInt();
                switch(p){
                    case 1:
                    {
                        new_node.next=head;
                        head=new_node;
                        tail.next=head;
                        break;
                    }
                    case 2:
                    {
                        tail.next=new_node;
                        tail=new_node;
                        new_node.next=head;
                        break;
                    }
                    case 3:
                    {
                    System.out.println("Enter the position where you want to insert:");
                    int m=s.nextInt();
                    for(int i=1;i<m-1;i++)
                    {
                        temp=temp.next;
                    }
                    new_node.next=temp.next;
                    temp.next=new_node;
                    break;

                }
                }
            }
            System.out.println("Enter 5 to add more data:");
            n=s.nextInt();

        }while(n==5);
    }
    public void deletion()
    {
        Node temp=head;
        Node ptr=temp.next;
        System.out.println("Enter 1 to delete from beginning, Enter 2 to delete from end, Enter 3 to delete from any position:");
        int a=s.nextInt();
        switch(a){
            case 1:
            {
                head=temp.next;
                tail.next=head;
                break;
            }
            case 2:
            {
                while(ptr.next!=head)
                {
                    temp=ptr;
                    ptr=ptr.next;
                }
                temp.next=head;
                tail=temp;
                break;
            }
            case 3:
            {
                System.out.println("Enter any postion to delete:");
                int p=s.nextInt();
                for(int i=1;i<p-1;i++)
                {
                    temp=ptr;
                    ptr=ptr.next;
                }
                temp.next=ptr.next;
                break;

            }
        }
    }
    public void traverse()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("Linked list is empty!");
        }
        else{
            do{
                System.out.print(temp.data+" ");
                temp=temp.next;
            }while(temp!=head);
        }
    }
    public static void main(String[] args) {
        Circular_ll ll=new Circular_ll();
        ll.creation();
        ll.deletion();
        ll.traverse();
    }
}
