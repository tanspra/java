import java.util.*;
class EvenOdd
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no to check whether even or odd :");
        int no=sc.nextInt();
        if(no%2==0)
        {
            System.out.println(no+"  is even number.");
        }else{
            System.out.println(no+"  is odd number.");
        }
    }
}