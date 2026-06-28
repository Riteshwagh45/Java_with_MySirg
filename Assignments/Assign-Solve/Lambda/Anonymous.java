interface I1{
    void show();
}

public class Anonymous{
    public static void main(String[] args) {
      I1 obj = new I1() {

        //  @java.lang.Override
          public void show() {
              System.out.println("hello");
          }
      };
      obj.show();
    }
}