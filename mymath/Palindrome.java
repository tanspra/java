package mymath;
public class Palindrome{
 public final boolean test(final String strOriginal){
     StringBuffer str=new StringBuffer(strOriginal);
     String reverse=str.reverse().toString();
     while(strOriginal.equals(reverse)){
         return true;
     }
     return false;

 }   
}