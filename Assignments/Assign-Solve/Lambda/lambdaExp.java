
interface I1{
    void show();
}

public class lambdaExp {
    public static void main(String[] args) {
        I1 obj =  () -> System.out.println("hello");//lamda expression / Anonymous class create and show method call
        obj.show();

    }
}