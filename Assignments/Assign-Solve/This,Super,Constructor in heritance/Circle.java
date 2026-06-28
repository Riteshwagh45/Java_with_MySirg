public class Circle {
    int radius ;
    static final double pi;

    //static block
    static {
        pi = 3.14;
    }


    //initialization block
    {
        radius = 5;
    }

    //set radius
    public void setRadius(int radius){
        this.radius = radius;
    }

    //get radius
    public int getRadius(){
        return radius;
    }
    //get area
    public double getArea(){
        return pi * radius * radius;

    }
    public static void main(String[] args) {
      Circle c1 = new Circle();

    }
}