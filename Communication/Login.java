import java.util.*;
import java.io.*;
class Login
{
    public static void main(String []arg)
    {
        Scanner sc=new Scanner(System.in);
        Console c=System.console();
        System.out.print("Enter Username :");
        String userName=sc.next();
        //String userName=c.readLine();
        System.out.print("Enter Password :");
        //String password=c.readPassword();
        String password=sc.next();
        if(Profile.isTrue(userName,password))
        {
            System.out.println("You are welcome ......");

        }else{
            System.out.println("keep away Intrueder");
        }
    }
}
