class WrapperTest2{
    public static void main(String[] args){
        char[] val={'a','r','2','A','/'};
        for (int count=0;count<val.length;count++){
            if(Character.  isDigit(val[count])){
                System.out.println(val[count]+"  is a digit");
            }
            if(Character.  isLetter(val[count])){
                System.out.println(val[count]+"  is a Letter");
            }
            if(Character.  isUpperCase(val[count])){
                System.out.println(val[count]+"  is a UpperCase");
            }    
            if(Character.  isLowerCase(val[count])){
                    System.out.println(val[count]+"  is a lowerCase");
            }
            if(Character.  isWhitespace(val[count])){
                    System.out.println(val[count]+"  is a whitespace");
            }
            }
        }
}