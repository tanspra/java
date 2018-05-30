import java.util.*;
class ShuffleArray
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
        System.out.print("Array is : ");
        for(int i=0;i<n;i++)
        {
         System.out.print(num[i]+"\t");
        }
    //shuffled array is
    Random rand=new Random();
     
    System.out.println("Shuffling the array :");


    }
}
