import java.util.*;
class LeapYear
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter year to check whether it is leap year or not :");
    int year=sc.nextInt();
    if(year%400==0)
    {
        System.out.println(+year+"\tis a leap year.");
    }else if(year%100==0){
        System.out.println(year+"\t is not leap year");
    }else if(year%4==0)
    {   
    System.out.println(year+"\tis leap year");
    }else{
    System.out.println(year+"\tis not a leap year.");
}
}}