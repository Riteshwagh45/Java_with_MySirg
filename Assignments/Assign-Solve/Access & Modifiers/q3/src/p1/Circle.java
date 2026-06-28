package p1;

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

    //calculate area of circle
    public double Area(){
        return 3.14*radius*radius;
    }

    //calculate area of circumference of a circle
    public double circumference(){

        return 2*3.14*radius;
    }
}