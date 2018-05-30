class WrapperTest{
    public static void main(String[] args){
String number=args[1];
Byte bynum=Byte.valueOf(number);
Short shnum=Short.valueOf(number);
Integer intnum=Integer.valueOf(number);
Long lgnum=Long.valueOf(number);
System.out.println("Output");
System.out.println(bynum);
System.out.println(shnum);
System.out.println(intnum);
System.out.println(lgnum);
    }
}