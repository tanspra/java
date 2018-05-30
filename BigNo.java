import java.util.*;
class BigNo
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter four no :");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int big=a>b?a:b;
System.out.println("Biggest of four no is :"+big);
}
}