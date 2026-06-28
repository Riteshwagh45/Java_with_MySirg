package p1;

public class HelloWorld {

    public static void main(String[] args) {
         A1 a1 = new A1();
         a1.calls();
    }
}
class A1{
    public void calls(){

        B1 b1 = new B1();
        b1.f1();

        B2 b2 = new B2();
        b2.f2();
    }
}