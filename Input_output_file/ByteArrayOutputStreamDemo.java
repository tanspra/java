import java.io.*;
class ByteArrayOutputStreamDemo 
{
    public static void main(String args[])throws Exception
    {
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        FileOutputStream fos=new FileOutputStream("Output.txt");
        bos.write(123456);bos.write(123456);bos.write(123456);bos.write(123456);bos.write(123456);bos.write(123456);bos.write(123456);bos.write(123456);
        bos.writeTo(fos);   
        bos.writeTo(fos);   
        bos.writeTo(fos);   
        bos.writeTo(fos);   
        bos.writeTo(fos);   
        bos.writeTo(fos);   
        bos.writeTo(fos);   
        bos.writeTo(fos);   

    }
}