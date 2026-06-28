public class Circle {
    Integer radius;

    //set radius
    void setRadius(Integer radius){
        this.radius = radius;
    }

    //get radius
    Integer getRadius(){
        return radius;
    }

    //get area of circle
    Double getAreaOfcircle(){

        return 3.14*radius*radius;
    }

    // get circumference of a circle
    Double getCircumferenceOfcircle(){
          return 2*3.14*radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.setRadius(12);
        System.out.println(c1.getAreaOfcircle());
        System.out.println(c1.getCircumferenceOfcircle());
    }
}
