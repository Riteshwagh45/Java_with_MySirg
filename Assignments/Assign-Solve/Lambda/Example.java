
interface I1{
    void show();
    String s1(String name);
}

        class A implements I1{

         private String name;
         public void show(){
             System.out.println("hello");
         };

            public String s1(String name ) {
                return this.name = name;
            }
        }

public class Example {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        System.out.println(obj.s1("abc"));
    }
}