class D extends Thread{
    public void run(){
        f1();
    }
    
    public void f1(){

        for(int i=0; i<=10; i++){
        System.out.println("i = "+i);
     } 
    }
}
class E extends Thread{
   public void run(){
        f2();
    }
    
    public void f2(){

       for(int j=1; j<=10; j++){
        System.out.println("Z = "+j);
     } 
    }
}

class A implements Runnable{

    public void run(){
        f1();
    }

   void f1(){

     for(int i=0; i<=10; i++){
        System.out.println("i = "+i);
     }
   }
}
class B implements Runnable{

    public void run(){
       f2();
    }

   void f2(){

     for(int j=1; j<=10; j++){
        System.out.println("j = "+j);
     }
 }

}
public class practice {
    public static void main(String[] args) {
        //A obj1 = new A();
        //  B obj2 = new B();

        //  Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        // t1.start();
        // t2.start();

        // D obj1 = new D();
        // E obj2 = new E();

        // obj1.start();
        //obj2.start();

        Thread t1 = new Thread(new Runnable() {

            public void run() {

                for (int i = 0; i < 10; i++) {
                    System.out.println("i = "+ i +" "+"Thread name t1 = "+Thread.currentThread().getName());
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {

            public void run() {
                for(int j=0; j<=10;j++){
                    System.out.println("j = "+j+" thread name of t2  = "+Thread.currentThread().getName());
                }
            }
        });

        t1.start();
        t2.start();
        System.out.println("thread name of main = "+Thread.currentThread().getName());

    }
}
