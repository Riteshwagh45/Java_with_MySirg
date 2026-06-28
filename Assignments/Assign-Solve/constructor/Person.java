public class Person{

    private int age;
    private String name;

    // 1 non-parameterized constructor 
    public Person(){
        
        this.name ="Anonymous";
        this.age = 0;
        System.out.println(name+" "+age);


    }
     //  2 constructor with age parameter 
     public Person(int age){
        this.age = age;
        System.out.println(age);
     }
      
     // 3 constructor with name paramter
     public Person(String name){
        this.name = name;
        System.out.println(name);
     }

     //4 with two paramerters  age and Name 
     public Person(int age , String name){
             this.age = age;
             this.name = name;
        System.out.print(age+" "+name);
     }
     

     public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person(22);
        Person p3 = new Person("ritesh");
        Person p4 = new Person(23, "shubham");
     }
    }