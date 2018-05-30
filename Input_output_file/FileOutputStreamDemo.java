import java.io.*;
class FileOutputStreamDemo
{
    public static void main(String args[])throws Exception
    {    
        System.out.print("Enter About yourself:");
        DataInputStream dis=new DataInputStream(System.in);
        FileOutputStream fos=new FileOutputStream("AboutMe.txt");
        int ch;
        while((char)(ch=dis.read())!='$')
        {
            fos.write((char)ch);
        }
    }
}