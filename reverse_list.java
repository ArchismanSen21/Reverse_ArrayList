package reverse_list;
import java.util.*;
class reverse
{
    public ArrayList<Integer> revarrlis (ArrayList<Integer> ar)
    {
        int m=ar.size();
        for(int i=0; i<m/2;i++)
        {
            Integer t = ar.get(i);
            ar.set(i,ar.get(m-1-i));
            ar.set(m-1-i,t);
        }
        return ar;
    }
    public void printele(ArrayList<Integer> ar)
    {
        for (int i=0;i<ar.size();i++)
            System.out.print(ar.get(i)+" ");
    }
}

public class reve
{
    public static void main(String args[])
    {
        reverse obj = new reverse();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter the number of elements in list: ");
        int n = sc.nextInt();
        System.out.println("Appending the list : ");
        for (int i=0;i<n;i++)
            arr.add(sc.nextInt());
        System.out.println("The List before reverse : ");
        obj.printele(arr);
        arr = obj.revarrlis(arr);
        System.out.println("The List after reverse : ");
        obj.printele(arr);
    }
}
