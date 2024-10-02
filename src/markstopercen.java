import java.util.Scanner;

public class markstopercen {
    public static void main(String[] args) {
        float noOfSubject = 5;
       Scanner s = new Scanner(System.in);
      
        System.out.println("enter english marks");
        float b = s.nextFloat();
        System.out.println("entre the marks of math");
        float c = s.nextFloat();
        System.out.println("entre the marks of physics");
        float d = s.nextFloat();
        System.out.println("entre the marks of chemistry");
        float e = s.nextFloat();
        System.out.println("entre the marks of hindi");
        float f = s.nextFloat();
        float total = (b+c+d+e+f);
        float totalmarksPercentage = (total/500)*100;
        System.out.println("total marks in percentage :"+totalmarksPercentage+"%");

    }
}
