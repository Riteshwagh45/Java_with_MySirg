public class Person {
    private int age;
    private String name;

    //parameterized constructor
    public Person(int age , String name){
        this.age = age;
        this.name = name;
    }
    String getName(){
       return this.name;
    }

    int getAge(){
        return this.age;
    }

    public static void main(String[] args) {
        Person p1 = new Person(22,"ritesh");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

    }
}