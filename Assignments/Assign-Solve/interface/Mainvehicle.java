interface Vehicle{
    //abstract method
    void start();

    //deafult method
    default void fuel(){
        System.out.println("petrol");
    }

}
class Car implements Vehicle{
    @java.lang.Override
    public void start() {
        System.out.println("Car Started");
    }
}

public class Mainvehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        v1.fuel();

    }
}