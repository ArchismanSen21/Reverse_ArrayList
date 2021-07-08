import java.util.Scanner;
public class reverse_array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,m,t;
        System.out.println("Enter the elements of array : ");
        m = sc.nextInt();
        int[] n = new int [m];
        System.out.println("Enter the array : ");
        for (i=0;i<m;i++)
            n[i]=sc.nextInt();
        System.out.println("The original array is : ");
        for(i=0;i<m;i++)
            System.out.print("\t"+n[i]);
        for (i=0;i<m/2;i++)
        {
            t=n[i];
            n[i]=n[m-1-i];
            n[m-1-i]=t;
        }
        System.out.println("\nThe reverse array is : ");
        for(i=0;i<m;i++)
            System.out.print("\t"+n[i]);
    }
}