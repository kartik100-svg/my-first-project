class Base{
    int x;
    public int geter(){
      return x;
    }
    public void seter(int x){
        System.out.println(" i am in base and setting x now");
        this.x = x;
    }

    void printx(){
        System.out.println("i am a coder");
    }
}
class Derived extends Base{
    int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y = y;
    }
}
public class iinhertance {
    public static void main(String[] args) {
        Base b= new Base();
        b.seter(6);
       System.out.println( b.geter()); 
    //    use derived class and access x; 
        Derived d = new Derived();
         b.seter(6);
       System.out.println( b.geter()); 

    }
}
