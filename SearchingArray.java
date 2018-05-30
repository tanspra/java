import java.util.*;
class SearchingArray
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

    System.out.print("Enter the value to search in array :");
    int val=sc.nextInt();
    for(int j=0;j<n;j++)
    {
        if(num[j]==val)
        {
            System.out.println("The given value is at index "+j);
        }
    }    
    }
}    