import java.util.*;
class ChangeCase
{
    public static void main(String arg[])
    {
        //System.out.println("Enter 0 to exit :");
        // while(true)
        // {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter character value :");
        // char ch=sc.next().charAt(0);
        // System.out.println("ASCII Value is :"+(int)ch);
        //  }
    //new modified code to change case
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter character value :");
        char ch=sc.next().charAt(0);
        int intVal=(int)ch;
        if(intVal>=65 && intVal<=90)
        {
            intVal+=32;
            System.out.println("The opposite case of "+ch+"  is  :"+(char)intVal);
        }
        else if(intVal>=97 && intVal<=122)
        {
            intVal-=32;
            System.out.println("The opposite case of "+ch+"  is  :"+(char)intVal);
        }
        else{
            System.out.println("Please enter the character value only !!!!");
        }
    }
}