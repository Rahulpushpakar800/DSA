import java.util.Scanner;
public class Insertion {
    public static void main(String[] args) {

        //....ARRAY DECLARATION PART
        System.out.println("Enter size of an array");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int a[]= new int[n];
       
        System.out.println("Enter values:");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("Before Insertion:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }

        //.....INSERTION PART
        System.out.println("Enter the new size of the array");
        int d=s.nextInt();
        int b[]=new int[n+1];
        System.out.println("Enter the position where you want to insert :");
        int p=s.nextInt();
        System.out.println("Enter the value you want to insert:");
        int v=s.nextInt();
        for(int i=0;i<d;i++){
            if(i<p){
                b[i]=a[i];
            }
            else if(i==p){
                b[i]=v;
            }
            else{
                b[i]=a[i-1];
            }
        }
        System.out.println("After insertion:");
        for(int i=0;i<n+1;i++)
        {
            System.out.println(b[i]+" ");
        }
    }
}
