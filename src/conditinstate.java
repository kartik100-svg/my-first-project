import java.util.Scanner;

public class conditinstate {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your age");
        int age = sc.nextInt() ;
        if (age <18){
            System.out.println("you are a boy you canot drive");
        }
        else {
            System.out.println("you can drive but safely");
        }
    }
}
