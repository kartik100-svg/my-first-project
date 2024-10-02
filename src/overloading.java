public class overloading {
    static void foo(int a){
        System.out.println("hello bro code "+a+" you are my best friend");
    }
    static void foo(){
        System.out.println("hello bro coder you are my friend");
    }
    static void foo(int a , int b){
        System.out.println("hello bro coder "+a+ b+" you are my friend");
    }
    public static void main(String[] args) {
        foo(3);
        foo();
        foo(3,6);
    }
}
