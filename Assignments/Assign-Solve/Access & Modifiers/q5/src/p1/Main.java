package p1;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        // set length height breadth
        b1.setlhb(10,20,30);

        //get volume of the box
        System.out.println(b1.getVolume());
        //get surface area
        System.out.println(b1.getSurfaceArea());
    }
}
