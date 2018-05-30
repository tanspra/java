class BooleanTest
{
    public static void main(String args[])
    {
        String t="true";
        Boolean booleanValue=new Boolean(t);
        System.out.println(booleanValue);
         Boolean booleanValue1=new Boolean(true);
        System.out.println(booleanValue1);
        int compareResult=Boolean.compare(booleanValue,booleanValue1);
        System.out.println(compareResult==0?"Both are equal":"both are unequal");
        boolean booleanValue2=false;
        System.out.println(booleanValue.compareTo(booleanValue2)==0?"Both are equal":"both are unequal");
        boolean a=true;    
        Boolean b=new Boolean(true);
        System.out.println(Boolean.hashCode(a));
        System.out.println(b.equals(a));
        String name="false";   
        System.out.print("getBoolean function :");    
        System.out.println(Boolean.getBoolean(name));    
        int result=Boolean.compare(booleanValue2,booleanValue);
        System.out.println("result is :"+result);
    


    }
}