import java.util.Scanner;

public class two_d {
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
         System.out.println("Enter row of 2D array:");
        int n=s.nextInt();
        System.out.println("Enter coloumns of 2D array:");
        int m= s.nextInt();
        int a[][]=new int[n][m];
        System.out.println("Enter values: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Your given 2D array:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
