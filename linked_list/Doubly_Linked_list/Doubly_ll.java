import java.util.Scanner;

public class Doubly_ll {
    Scanner s=new Scanner(System.in);
    static class Node{
        int data;
        Node next;
        Node prev;
        Node (int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void creation()
    {
        int data, n;
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
                // head.prev=new_node;
                // head=new_node;
                System.out.println("Enter 1 to insert at beginning, Enter 2 to insert at end, Enter 3 to insert at specific position:");
                int m=s.nextInt();
                switch(m)
                {
                    case 1:
                    {
                        new_node.next=head;
                        head.prev=new_node;
                        head=new_node;
                        break;
                    }
                    case 2:
                    {
                        tail.next=new_node;
                        new_node.prev=tail.next;
                        tail=new_node;
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Enter the position where you want to insert:");
                        int p=s.nextInt();
                        for(int i=1;i<p-1;i++)
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
    public void deletion(){
        Node temp=head;
        Node ptr=temp.next;
        System.out.println("Enter 1 to delete from beginning, Enter 2 to delete from end, Enter 3 to delete from any position:");
        int m=s.nextInt();
        switch(m){
            case 1:
            {
                head=temp.next;
                break;
            }
            case 2:
            {
                while(ptr.next!=null){
                    temp=ptr;
                    ptr=ptr.next;

                }
                temp.next=null;
                tail=temp;               
                break;
            }
            case 3:
            {
                System.out.println("Enter the position where you want to delete:");
                int p=s.nextInt();
                for(int i=1;i<p-1;i++)
                {
                    temp=ptr;
                    ptr=ptr.next;
                }
                ptr.next=temp.next;
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
            System.out.println("linked list is empty:");
        }
        else{
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Doubly_ll ll=new Doubly_ll();
        ll.creation();
        ll.deletion();
        ll.traverse();
       
    }
}
