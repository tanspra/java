import java.io.*;
import java.util.*;
class AboutMe
{
    public static void main(String args[])throws Exception
    {    
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name :");
        String name=sc.next();
        name=name.toUpperCase();
        System.out.println("Enter About yourself:");
        DataInputStream dis=new DataInputStream(System.in);
        FileOutputStream fos=new FileOutputStream("About"+name+".txt");
        int ch;
        while((char)(ch=dis.read())!='$')
        {
            fos.write((char)ch);
        }
    }
}