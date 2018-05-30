import mymath.*;
class UseMaths{
    protected UseMaths(){

    }
    public static void main(String[] args){
        MathOperation mo=new MathOperation();
        Palindrome pali=new Palindrome();
        System.out.println(mo.add(3,4));
        System.out.println(mo.add(30,42));
        System.out.println(mo.sub(32,4));
        System.out.println(mo.sub(3,40));
        System.out.println(mo.mul(3,4));
        System.out.println(pali.test("121"));

    }
    
}