import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of a :");
        int a = s.nextInt();
        System.out.println("enter number of b :");
        int b = s.nextInt();
        int sum = a+b;
        System.out.print("the sum of a+b is :");
        System.out.println(sum);
    }
    
}
