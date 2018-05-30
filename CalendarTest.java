import java.util.*;
class CalendarTest{
    Calendar calObj;
    Calendar newObj=Calendar.getInstance();
    CalendarTest(){
        calObj=Calendar.getInstance();
    }
    void display(){
       
System.out.println("\nDate and Time component Are :");
System.out.println("Month :"+calObj.get(Calendar.MONTH));
System.out.println("Day:"+calObj.get(Calendar.DATE));
System.out.println("Year :"+calObj.get(Calendar.YEAR));
System.out.println("Hour :"+calObj.get(Calendar.HOUR));
System.out.println("Minute :"+calObj.get(Calendar.MINUTE));
System.out.println("Second :"+calObj.get(Calendar.SECOND));

calObj.add(Calendar.MINUTE,30);
System.out.println("Minute Plus 30 extra minute:"+calObj.get(Calendar.MINUTE));
calObj.add(Calendar.HOUR,10);
System.out.println("Hour plus 10  :"+calObj.get(Calendar.HOUR));
System.out.println("***********************************************************************");
calObj.set(Calendar.MONTH,10);
//calObj.clear();
if(calObj.get(Calendar.MONTH)==10){
    System.out.println("Legends");
}
System.out.println(calObj.get(Calendar.MONTH));
System.out.println("***********************************************************************");
System.out.println(calObj.before(newObj));
System.out.println(newObj.getTime().toString().substring(11,19));
System.out.println(calObj.getTime());


    }

    public static void main(String[] args){
       CalendarTest ct=new CalendarTest();
       ct.display();
      

    }
}