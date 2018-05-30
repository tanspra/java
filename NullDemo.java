class NullDemo
{
    public static void main(String args[])
    {
        //null is literal of any referenced type
       /* System.out.println(null);/*NullDemo.java:6: error: reference to println is ambiguous
                                            System.out.println(null);
                                                    ^
                                    both method println(char[]) in PrintStream and method println(String) in PrintStream match */
    //assign value to variable
    System.out.println("Assigning null to variable");                                
    String test=null;
    System.out.println(test);
    Integer test1=null;
    System.out.println(test1);  
    int[] intArray=null;
    System.out.println(intArray);                    
    System.out.println("Assigning null value using type casting");
    System.out.println((String)null);
    System.out.println((int[])null);
    System.out.println((Float)null);

    }
    
}