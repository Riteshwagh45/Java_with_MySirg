error id: file:///D:/java_with_Saurabh_shukla/Assignments/Assign-Solve/Inheritance/Person.java:java/util/Scanner#
file:///D:/java_with_Saurabh_shukla/Assignments/Assign-Solve/Inheritance/Person.java
empty definition using pc, found symbol in pc: java/util/Scanner#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 550
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
    int salary;
     
     //input method
    public void input(int age , String name, int salary){
      Scann@@er sc = new Scanner(System.in);

      sout

    }

    //diplay employee details 
    public void display(){
        System.out.println("Employee Name:" +name);
        System.out.println("Employee Age: "+age);
        System.out.println("Employee Salary: "+salary);
    }

}
public static void main(String[] args){
Employee e1 = new Employee();
  e1.input(22,"ritesh",255);
  e1.display();
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Scanner#