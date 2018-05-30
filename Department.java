
class Employee
{
    String employeeName;
    int employeeId;
    int employeeSalary;
    Employee(String name,int id,int salary)
    {
        employeeName=name;
        employeeId=id;
        employeeSalary=salary;
    }
    synchronized void display()throws Exception
    {
        System.out.println("************************************************************************************");
        System.out.println("\t\t\tEmployee detail ");
        System.out.println("Employee Name:"+employeeName);
        System.out.println("Employee Id:"+employeeId);
        System.out.println("Employee Salary:"+employeeSalary);
        System.out.println();
        System.out.println("************************************************************************************");
    } 
}
class Manager extends Thread
{
    Employee employee;
    Manager(Employee obj)
    {
        employee=obj;
        start();
    }
    public void run()
    {
        try{
        employee.display();
    }catch(Exception e)
    {
        System.out.println(e);
    }
}
} 
class Department
{
    public static void main(String args[])
    {
        Employee ravi=new Employee("ravi",1,1520);
        Manager m1=new Manager(ravi);
        Employee shubham=new Employee("Shubham",2,6500);
        Manager m2=new Manager(shubham);
        Employee avinash=new Employee("Avinash",3,5500);
        Manager m3=new Manager(avinash);
        Employee prabhat=new Employee("Prabhat",4,4500);
        Manager m4=new Manager(prabhat);
        Employee aashish=new Employee("Aashish",5,5200);
        Manager m5=new Manager(aashish);
        Employee abhishek=new Employee("Abhishek",6,2500);
        Manager m6=new Manager(abhishek);
        m1.start();    
        m2.start();    
        m3.start();    
        m4.start();    
        m5.start();    
        m6.start();    
    }
}