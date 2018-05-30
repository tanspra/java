class Employee
{
    String employeeName;
    int employeeId;
    synchronized void display(String name,int id)throws Exception
    {
        employeeName=name;
        employeeId=id;
        System.out.println("****************************************************************************");
        System.out.println("\t\t\tWelcome");
        System.out.println("\t\tEmployee Id: "+employeeId);
        Thread.sleep(5000);
        System.out.println("\t\tEmployee Name : "+employeeName);
        System.out.println("****************************************************************************");
    }

}
class Thread1 extends Thread
{
    Employee emp;
Thread1(Employee obj)
{
    this.emp=obj;
}
public void run()
{
    try
    {
    emp.display("Ravikant", 1);
    }catch(Exception e)
    {
        System.out.println(e);
    }
}


}
class Thread2 extends Thread
{
    Employee emp;
    Thread2(Employee obj)
    {
        this.emp=obj;
    }
    public void run()
    {
        try{
        emp.display("Prabhat", 2);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
class ThreadSynchronizedMethod
{
    public static void main(String args[])
    {
        Employee emp=new Employee();
        Thread1 t1=new Thread1(emp);
        Thread2 t2=new Thread2(emp);
        t1.start();
        t2.start();
    }
}