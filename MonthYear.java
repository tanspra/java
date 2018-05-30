import java.util.*;

import javax.lang.model.util.ElementScanner6;
class MonthYear
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total no of days :");
        int noOfDays=sc.nextInt();
        int month=noOfDays/30;
        noOfDays=noOfDays%30;
        int year=month/12;
        if(month>12)
        {
        month=month%12;
        if(year>1)
            {
                if(month>1)
                {
                    if(noOfDays>1)
                    {
                        System.out.print("Days is equal to "+year+" years "+month+" months and "+noOfDays+" days");
                    }
                    else if(noOfDays==1)
                    {
                        System.out.print("Days is equal to "+year+" years "+month+" months and "+noOfDays+" day");
                    }else
                    {
                        System.out.print("Days is equal to "+year+" years "+month+" months");
                    }

                }else if(month==1)
                {
                    if(noOfDays>1)
                    {
                        System.out.print("Days is equal to "+year+" years "+month+" month and "+noOfDays+" days");
                    }
                    else if(noOfDays==1)
                    {
                        System.out.print("Days is equal to "+year+" years "+month+" month and "+noOfDays+" day");
                    }else
                    {
                        System.out.print("Days is equal to "+year+" years "+month+" month");
                    }
                }
                else
                {
                    if(noOfDays>1)
                    {
                        System.out.print("Days is equal to "+year+" years and "+noOfDays+" days");
                    }
                    else if(noOfDays==1)
                    {
                        System.out.print("Days is equal to "+year+" years and "+noOfDays+" day");
                    }else
                    {
                        System.out.print("Days is equal to "+year+" years ");
                    }
                }
            }
        }else if(year==1)
        { if(month>1)
            {
                if(noOfDays>1)
                {
                    System.out.print("Days is equal to "+year+" year "+month+" months and "+noOfDays+" days");
                }
                else if(noOfDays==1)
                {
                    System.out.print("Days is equal to "+year+" year "+month+" months and "+noOfDays+" day");
                }else
                {
                    System.out.print("Days is equal to "+year+" year "+month+" months");
                }

            }else if(month==1)
            {
                if(noOfDays>1)
                {
                    System.out.print("Days is equal to "+year+" year "+month+" month and "+noOfDays+" days");
                }
                else if(noOfDays==1)
                {
                    System.out.print("Days is equal to "+year+" year "+month+" month and "+noOfDays+" day");
                }else
                {
                    System.out.print("Days is equal to "+year+" year "+month+" month");
                }
            }
            else
            {
                if(noOfDays>1)
                {
                    System.out.print("Days is equal to "+year+" year and "+noOfDays+" days");
                }
                else if(noOfDays==1)
                {
                    System.out.print("Days is equal to "+year+" year and "+noOfDays+" day");
                }else
                {
                    System.out.print("Days is equal to "+year+" year ");
                }
            }
        } 
        else
            {
            if(month>1)
            {
                if(noOfDays>1)
                {
                    System.out.print("Days is equal to "+month+" months and "+noOfDays+" days");
                }
                else if(noOfDays==1)
                {
                    System.out.print("Days is equal to "+month+" months and "+noOfDays+" day");
                }else
                {
                    System.out.print("Days is equal to "+month+" months");
                }

            }else if(month==1)
            {
                if(noOfDays>1)
                {
                    System.out.print("Days is equal to "+month+" month and "+noOfDays+" days");
                }
                else if(noOfDays==1)
                {
                    System.out.print("Days is equal to "+month+" month and "+noOfDays+" day");
                }else
                {
                    System.out.print("Days is equal to "+month+" month");
                }
            }
            else
            {
                if(noOfDays>1)
                {
                    System.out.print("Days is equal to  "+noOfDays+" days");
                }
                else if(noOfDays==1)
                {
                    System.out.print("Days is equal to  "+noOfDays+" day");
                }else
                {
                    System.out.print("");
                }
            }
        }

        } 
    }