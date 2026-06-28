class practice {

     int a = 10;

    //set value A
    void setA(int a ){
        this.a = a;
    }

      void f2(){
          a = 12;
      }

     void f1() {
         System.out.println("hello from class Person");

     }
 }


    class B extends  practice {
        int a = 5;

        void f1() {
            System.out.println("hello from class B");

           int a = 2;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(super.a);

            super.f1();
            super.f2();
            System.out.println(super.a);
        }
    }


    public class Main {

        public static void main(String[] args) {
            B b1 = new B();
           // b1.f1();
            b1.setA(20);
            b1.f1();

        }
    }