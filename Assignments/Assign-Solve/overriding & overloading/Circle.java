
public class Circle{
    private int radius;

    //set radius
    void setRadius(int radius){
        this.radius = radius;
    }
    //get radius
    public int getRadius(){
        return radius;
    }
    //calculate are
    public double getArea(){
        return 3.14*radius*radius;
    }

}
class ThickCircle extends Circle{
    private int thickness;

    //set thickness
    void setThickness(int t){
        this.thickness = t;
    }
    //get thickness
    public int getThickness(){
        return thickness;
    }

    @java.lang.Override
    public double getArea() {

        return thickness * super.getArea();

    }
}
class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(10);
        System.out.println("radius=" + c1.getRadius());
        System.out.println("area of circle= " + c1.getArea());

        ThickCircle t1 = new ThickCircle();
        t1.setRadius(10);
        t1.setThickness(5);
        System.out.println("thickenss = " + t1.getThickness());
        System.out.println("area of thick circle = " + t1.getArea());
    }
}