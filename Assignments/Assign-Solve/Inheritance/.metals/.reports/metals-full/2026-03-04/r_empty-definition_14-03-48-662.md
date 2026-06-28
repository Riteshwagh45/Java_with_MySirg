error id: file:///D:/java_with_Saurabh_shukla/Assignments/Assign-Solve/Inheritance/Person.java:java/util/Scanner#nextDouble().
file:///D:/java_with_Saurabh_shukla/Assignments/Assign-Solve/Inheritance/Person.java
empty definition using pc, found symbol in pc: java/util/Scanner#nextDouble().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 845
uri: file:///D:/java_with_Saurabh_shukla/Assignments/Assign-Solve/Inheritance/Person.java
text:
```scala
import java.util.*;

public class Person{
    private int age;
    private String name;

    //set age 
    protected void setAge(int age){
        this.age = age;
    }

    //set name 
   protected void setName(String name){
        this.name = name;
    }
    //get age 
   protected int getAge(){
        return age;
    }

    //get name 
     protected  String getName(){
        return name;
    }

}
class Employee extends Person{
    private double salary;
     
     //input method
    public void input(){
      Scanner sc = new Scanner(System.in);

      //set the employee name
      System.out.println("Enter a Name");
      setName(sc.nextLine());

      //set age 
      System.out.println("Enter a age");
      setAge(sc.nextInt());
      
      //set salary
      System.out.println("Enter salary:");
      salary = sc.nextDoub@@le();

    }

    //diplay employee details 
    public static void display(){

        System.out.println("Employee Name:"+getName());
        System.out.println("Employee Age:" +getAge());
        System.out.println("Employee Salary: "+salary);
    }

}
public static void main(String[] args){
Employee e1 = new Employee();

  e1.input();
  e1.display();
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Scanner#nextDouble().