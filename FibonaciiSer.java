import java.util.*;
class FibonaciiSer
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of term of Fibonacci Series :");
        int n=sc.nextInt();
        System.out.println("Fibonacci series of "+n+" are :");
        int start=0;
        System.out.print(start+" ");
        int start1=1;
        System.out.print(start1+" ");
        for(int i=2;i<=n;i++)
        {
         int sumOfPrev=start+start1;
         start=start1;
         start1=sumOfPrev;
        
        System.out.print(start1+" ");
        }
    }
}