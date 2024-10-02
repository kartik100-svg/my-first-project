class employee{
    int id;
    String name;
    public void printDetails(){
         System.out.println("Employee id is " +id );
         System.out.println("Employee name is " +name); 
    }
}

public class custum {
    public static void main(String[] args) {
        System.out.println("this is the custum class");
        employee kartik = new employee(); //object initiatives
        employee rohan = new employee();
        // setting attributes 
        kartik.id = 1;
        kartik.name ="kartikgaud";
        rohan. id = 2;
        rohan .name = "rohan agrawal";
        // printing the attributes 
        // System.out.println(kartik.id);
        // System.out.println(kartik.name); 
        kartik.printDetails();
        rohan .printDetails();
    }
    
}
