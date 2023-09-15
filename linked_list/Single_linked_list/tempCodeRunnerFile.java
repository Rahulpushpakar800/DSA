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