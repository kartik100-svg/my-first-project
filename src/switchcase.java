import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        int age ;
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your age :");
        age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("you are going a adult");
                break;
            case 23:
            System.out.println("you are going to job");
            break ;
            case 60:
            System.out.println("you are a retired from job");
            break ;
            default:
            System.out.println("Enjoy your life");
             break;
        }

        
        // if(age>58){
        //     System.out.println("you are mid journey");
        // }
        // else if(age>48){
        //     System.out.println("you are pro");
        // }
        // else if(age > 38){
        //     System.out.println("you are focused on our study");
        // }
        // else {
        //     System.out.println("you are not eligible");
        // }
        // if(age>58){
        //     System.out.println("you are mid journey");
        // }
        // if(age>48){
        //     System.out.println("you are pro");
        // }
        // else if(age > 38){
        //     System.out.println("you are focused on our study");
        // }
        // else {
        //     System.out.println("you are not eligible");
        // }
    }
}
