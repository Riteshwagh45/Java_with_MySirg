public class overloading{
    void f1(){
        System.out.println("i am 1st");
    }
    void f1(int n){
        System.out.println("2nd = "+n);
    }
    void f1(int a,int b){
        System.out.println("third"+a+" "+b);
    }

    public static void main(String[] args) {
        overloading obj1 = new overloading();
        obj1.f1();
        obj1.f1(10);
        obj1.f1(10,20);

    }
}