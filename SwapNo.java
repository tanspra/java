import java.util.*;
class SwapNo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first no : ");
        int firstNo=sc.nextInt();
        System.out.print("Enter second no : ");
        int secondNo=sc.nextInt();
        System.out.println("<---------------------Before swap---------------------------->");
        System.out.println("First no : "+firstNo);
        System.out.println("Second no : "+secondNo);
        int swap=0;
        swap=firstNo;
        firstNo=secondNo;
        secondNo=swap;
        System.out.println("<---------------------After swap---------------------------->");
        System.out.println("First no : "+firstNo);
        System.out.println("Second no : "+secondNo);

    }
}