import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        // Q 1. write a program sum of three no. 
        Scanner s = new Scanner(System.in);
        System.out.println("entre first no");
        int a = s.nextInt();
        System.out.println("entre second no");
        int b = s.nextInt();
        System.out.println("entre third no");
        int c = s.nextInt();
        int d = a+b+c;
        System.out.println(d);
    }
}
