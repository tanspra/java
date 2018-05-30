import java.util.*;
class RevArray
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
    
    //reversing array
    int rev[]=new int[n];
    int m=n-1;
    for(int j=0;j<n;j++)
    {
        rev[m]=num[j];
        m--;
    }    
    System.out.print("Given array is : ");
    for(int i=0;i<n;i++)
    {
        System.out.print(num[i]+"\t");
    }
     System.out.print("\nReverse array is : ");
    for(int i=0;i<n;i++)
    {
        System.out.print(rev[i]+"\t");
    }
    }
}