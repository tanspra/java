import java.util.*;
class DateTimeDisplay{
    Date objDate;
    DateTimeDisplay(){
        objDate=new Date();
    }
    void display(){
        String strDate,strTime="";
        System.out.println("Today's date is :"+objDate);
        long time=objDate.getTime();
        System.out.println("Today's date in millisecond since 1 Jan 1970 is :"+time);
        strDate=objDate.toString();
        System.out.println("Today's date in String :"+strDate);
        strTime=strDate.substring(11,(strDate.length()-4));
      strTime="Time :"+strTime.substring(0,8);
      System.out.println(strTime);
      
      
        
        

    }
public static void main(String [] args){
    DateTimeDisplay dt=new DateTimeDisplay();
    dt.display();
}
}