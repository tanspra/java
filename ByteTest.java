class ByteTest
{
    public static void main(String args[])
    {
        try
        {
        System.out.println(Byte.SIZE);
        String password="Decodeit";
        System.out.println("Decode string password:"+Byte.decode(password));
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
    }

}