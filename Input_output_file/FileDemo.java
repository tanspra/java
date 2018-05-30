import java.io.*;
class FileDemo
{
    public static void main(String args[])throws Exception
    {
        File file=new File("abc");
        boolean isFile=true;
        isFile=file.createNewFile();
        System.out.println(isFile?"File created":"File not created");
    }
}