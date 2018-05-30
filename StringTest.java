public class StringTest{
    public static void main(String[] args){
        String name="Prashant";
        System.out.println(name);
        
        String name1=new String(name);
        System.out.println(name1.length());
        boolean check=name1.equals(name1);
        System.out.println(check);
    }
}