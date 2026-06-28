
interface Shape{
    void area();
}
class Circle implements Shape{
    private static int radius = 5;

    @java.lang.Override
    public void area() {
        System.out.println("Area of a circle " + 3.14 * radius * radius);
    }
}
class Square implements Shape{
private static int  side = 4;

    @java.lang.Override
    public void area() {
        System.out.println("Area of a Square "+ side * side);
    }
}

public class MainShape {
    public static void main(String[] args) {
      Shape s1 = new Circle();
      s1.area();

      Shape s2 = new Square();
      s2.area();
    }
}