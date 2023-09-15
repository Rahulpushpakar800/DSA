import java.util.Scanner;

public class Lnkd_arr {
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
    public void creation()
    {
        
        int data,w;
        
        do{
            System.out.println("Enter data:");
            data=s.nextInt();
            Node new_node=new Node(data);
            if(head==null)
            {
                head=new_node;

            }
            else{
                
                // new_node.next=head;
                // head=new_node;
                System.out.println("Enter 1 to insert at begg, Enter 2 to insert at end, Enter 3 to insert at specific location:");
                int p=s.nextInt();
                switch(p)
                {
                    case 1:
                    {
                        new_node.next=head;
                        head=new_node;
                        break;
                    }
                    case 2:
                    {   Node temp=head;
                        while(temp.next!=null)
                        {
                            temp=temp.next;                        
                        }
                        temp.next=new_node;
                        break;
                    }
                    case 3:
                    {
                        Node temp=head;
                        System.out.println("Enter the position");
                        int k=s.nextInt();
                        for(int i=1;i<k-1;i++)
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
            w=s.nextInt();
        }while(w==5);       
    }
    public void deletion()
    {
        Node temp=head;
        Node ptr=temp.next;
        int w;
       do{
         System.out.println("Enter 1 to delete from begg, Enter 2 from end or Enter 3 from specifc location:");
        int l=s.nextInt();
        switch(l)
        {
            
            case 1:
            {
                head=temp.next;
                break;
            }
            case 2:
            {
                while(ptr.next!=null)
                {
                    temp=ptr;
                    ptr=ptr.next;
                }
                temp.next=null;
                break;
            }
            case 3:
            {
                System.out.println("Enter position:");
                int k=s.nextInt();
                for(int i=1; i<k-1;i++)
                {
                    temp=ptr;
                    ptr=ptr.next;
                }
                temp.next=ptr.next;
                break;
            }
        }
        System.out.println("Enter 5 to delete more:");
        w=s.nextInt();
       }while(w==5);
    }
    
    
    public void traverse()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("linked list is empty:");
        }
        else{
            while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int w;
        Lnkd_arr ll=new Lnkd_arr();
       do{
        System.out.println("Enter 1 to create, Enter 2 to delete, Enter 3 to display:");
        int z=s.nextInt();
        switch(z)
        {
            case 1:
            {
                ll.creation();
                break;
            }
            case 2:
            {
                ll.deletion();
                break;
            }
            case 3:
            {
                ll.traverse();
                break;
            }
        }
        System.out.println("Enter 5 to do more operation:");
        w=s.nextInt();
       }while(w==5);
        
        
    }
    
}
