
package p1;
import java.util.*;

public  class main{

    public static void main(String[] args) {
        Circle c1 = new Circle();
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter a radius");
         c1.setRadius(sc.nextInt());

        System.out.println("Radius = "+c1.getRadius());
        System.out.println("Area = "+c1.Area());
        System.out.println("Circumference = "+c1.circumference());
    }
}