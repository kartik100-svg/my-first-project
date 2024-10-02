class cylinder{
    private int radius;
    private int height;
    public cylinder(int height , int radius){
        this.height = height ;
        this.radius = radius ;
    }
    public int getradi(){
        return radius;
    }
    public void setradii(int r){
    this.radius = r;
    }
    public int gethei(){
        return height;
    }
    public void sethei(int h){
        this.height = h;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius+2*3.14*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class practiceset {
    public static void main(String[] args) {
     cylinder c = new cylinder(15,12);
    //  c.setradii(12);
    //  c.sethei(15);
     System.out.println(c.gethei());
     System.out.println(c.getradi());   
     System.out.println(c.surfaceArea());
     System.out.println(c.volume());
    }
}
