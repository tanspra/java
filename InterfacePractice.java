interface animal{
void moves();
   void sounds();
}
class Birds implements animal{
    public void moves(){
        System.out.println("Birds Flies");
    }
    public void sounds(){
        System.out.println("Birds chirps");
    }
    }
    class Lion implements animal{
        public void moves(){
            System.out.println("Lion Runs");
        }public void sounds(){
            System.out.println("Lions roars");
        }
    }

public class InterfacePractice {
     public static void moves(animal a){
    a.moves();
//     a.sounds();
 }
public static void main(String[] args ){
animal x=new Birds();
animal y=new Lion();
x.moves();
y.moves();
x.sounds();
y.sounds();

}
}
