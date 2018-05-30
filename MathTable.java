import java.util.*;
class MathTable
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any no to get mathematical table :");
        int no=sc.nextInt();
        for (int i=1;i<=20;i++)
        {
            System.out.println(no+" * "+i+" = "+no*i);
        }
    }
}