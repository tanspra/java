import java.util.*;
class SortArray
{
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of element of array :");
    int n=sc.nextInt();
    int num[]=new int[n];

    //getting array value
    System.out.println("Enter the element of array :");
    for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }

    //printing array
    System.out.println("The elements of array are :");
    for(int i=0;i<n;i++)
    {
        System.out.print(num[i]+"\t");
    }

    //sorting algorithm
    Arrays.sort(num);

    System.out.println("\nSorted array are :");
    for(int i=0;i<n;i++)
    {
        System.out.print(num[i]+"\t");
    }    
    }
}