public class SuperCar {

    // Instance variables
    private String ownerName;
    private double price;
    private String colour;
    private String brand;

    // Static variable to hold single object
    private static SuperCar instance;

    // Private constructor (very important)
    private SuperCar() {
    }

    // Static method to get single instance
    public static SuperCar getInstance() {
        if (instance == null) {
            instance = new SuperCar();
        }
        return instance;
    } 

    // Setters
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getters
    public String getOwnerName() {
        return ownerName;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    // Main method
    public static void main(String[] args) {

        SuperCar car1 = SuperCar.getInstance();
        SuperCar car2 = SuperCar.getInstance();

        car1.setOwnerName("Ritesh");
        car1.setBrand("Bugatti");
        car1.setColour("Black");
        car1.setPrice(50000000);

        System.out.println("Owner: " + car2.getOwnerName());
        System.out.println("Brand: " + car2.getBrand());
        System.out.println("Colour: " + car2.getColour());
        System.out.println("Price: " + car2.getPrice());

        // Check if both objects are same
        System.out.println(car1 == car2);  // true
    }
}
