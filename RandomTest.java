import java.util.*;
class RandomTest{
    public static void main(String[] args){
        Random random=new Random();
        int point=0;
        while(point<10){
            random.setSeed(10);
            long get=random.nextLong();
            
            System.out.println(get);
            point++;
        }
    }
}