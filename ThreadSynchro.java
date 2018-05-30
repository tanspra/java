class First
{
public void display(String msg)throws Exception
{
    System.out.print("["+msg);
    Thread.sleep(1000);
    System.out.print("]");
}
}
class Second extends Thread
{
    String msg;
    First fobj;
    Second(First obj,String str)
    {
        fobj=obj;
        msg=str;
        start();
    }
    public void run()
    {
        synchronized(fobj)
        {
         try{
        fobj.display(msg);
            }
        catch(Exception e)
            {
                System.out.println(e);
             }
        }    
    }   
}
public class ThreadSynchro
{
    public static void main(String args[])
    {
        First fnew=new First();
        Second obj=new Second(fnew,"Welcome");
        Second obj1=new Second(fnew,"to");
        Second obj2=new Second(fnew,"Hyderabad");
        Second obj3=new Second(fnew,"Ameerpet");
        Second obj4=new Second(fnew,"Secunderabad");
        Second obj5=new Second(fnew,"haryana");
}
}
