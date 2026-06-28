interface Device{
    int VERSION = 1;

    //abstract method
    void start();

    //defaut method
    default void info(){
        System.out.println("TV Vsersion 1 ");
    }

    //static method
    static void company(){
        System.out.println("ABC Electronics");
    }
}

interface SmartFeatures{

    //abstract method
    void connectWifi();

    //default method
     default public void info(){
         System.out.println("smart features are inable");
     }
}

class SmartTv implements Device , SmartFeatures{
    @java.lang.Override
    public void start() {
        System.out.println("TV is started");

    }

    @java.lang.Override
    public void connectWifi() {
        System.out.println("WIFI is connected");
    }


    @java.lang.Override
    public void info() {
        Device.super.info();
        SmartFeatures.super.info();
    }
}

public class TV {
    public static void main(String[] args) {
        SmartTv t1 = new SmartTv();
        t1.start();
        t1.connectWifi();
        t1.info();
        Device.company();


    }
}