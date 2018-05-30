class Threaddemo extends Thread
{

public void run()
{
    for(int i=0;i<5;i++)
{
System.out.println("User thread  "+i);    
}
}
public static void main(String args[])
{
    Threaddemo td=new Threaddemo();
    Thread t=new Thread(td);
    Threaddemo td1=new Threaddemo();
    Thread t1=new Thread(td1);
    Threaddemo td2=new Threaddemo();
    Thread t2=new Thread(td1);
    t2.start();
    t.start();
    t1.start();
}
}

