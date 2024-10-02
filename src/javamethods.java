public class javamethods {
    static int logic(int x , int y){
        int z ;
        if(x>y){
            z = (x+y)*12;
        }
        else{
            z= x+y;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 60;
        int b = 6;
        int c = logic(a, b);
        int a1 = 20;
        int b1 = 40;
        int c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
