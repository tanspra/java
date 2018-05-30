import java.io.*;
class FileHandling
{
    public static void main(String args[])throws Exception
    {
        System.out.println("Enter value to print:");
        DataInputStream dis=new DataInputStream(System.in);
        int name;
        while((char)(name=dis.read())!='$')
        System.out.print((char)name);
    }

}