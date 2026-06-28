 class Person1 {

     private String name;
     private int age;

     //constructor 1 without arguments
     Person1() {
        this("ritesh" , 22);
     }

     //constructor 2 with 2 arguments
     public Person1(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public String getName(){
         return name;
     }

     public int getAge(){
         return age;
     }
 }

class Employee extends Person1{
    private double salary;

    //constructor 1 with no arguments
    public Employee(){
       this(35000.0);
    }

    //constructor with 1 arguments
    public Employee(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    //show employee data
    public void showEmployee(){
        System.out.println("name = "+ getName());
        System.out.println("age = " + getAge());
        System.out.println("salary = "+ getSalary());
    }


}

public class Driver {
    public static void main(String[] args) {
      Employee e1 = new Employee();
      e1.showEmployee();

    }
}
