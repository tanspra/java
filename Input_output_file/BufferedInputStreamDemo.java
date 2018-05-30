import java.io.*;
class BufferedInputStreamDemo
{
    public static void main(String args[])throws Exception
    {
        System.out.println("Enter string:");
        BufferedInputStream bis=new BufferedInputStream(new DataInputStream(System.in));
        int ch;
        while(((char)(ch=bis.read()))!='$')
        {
            System.out.print((char)ch);
        }

    }    
}