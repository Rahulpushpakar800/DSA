import java.util.Scanner;

public class one_D {
    public static void main(String[] args) {
        System.out.println("Enter size of an array");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n]; 
        System.out.println("Enter values:");
        
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }

    }
}