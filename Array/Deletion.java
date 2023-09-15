import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Enter values:");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Before Deletion:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter the position where you want to delete:");
        int k=s.nextInt();
        int b[]=new int[n-1];
        for(int i=0;i<n;i++)
        {
            if(i<k){
                b[i]=a[i];
            }
            else if(i==k){
                continue;
            }
            else{
                b[i-1]=a[i];
            }
        }
        System.out.println("After Deletion:");
        for(int i=0;i<n-1;i++){
            System.out.println(b[i]);
        }
    }
}
