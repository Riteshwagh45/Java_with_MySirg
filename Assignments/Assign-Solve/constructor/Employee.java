import java.util.Scanner;

public class Employee {
    private int empid;
    private String name;
    private int salary;

    static int objectCount = 1;

private static int getempid(){
   return objectCount++;
}

    public Employee() {
        System.out.println();
        Scanner sc = new Scanner(System.in);

       // objectCount++;
        System.out.println("Enter Employee Name:");
        name = sc.nextLine();

        System.out.println("Enter salary");
        salary = sc.nextInt();

        empid = getempid();
        
   System.out.print("id="+empid +" name = " +name +" salary = "+salary);
    }

    public Employee(String name, int salary) {
         System.out.println();

       // objectCount++;
        this.empid = getempid();
        this.name = name;
        this.salary = salary;

        System.out.print("id="+empid +" name = " +name +" salary = "+salary);
    }



    

    public static void main(String[] args) {
       // Employee e1 = new Employee();
        //Employee e2 = new Employee();
        Employee e1 = new Employee("ritesh", 133);
        Employee e2 = new Employee("shubham ", 355); 
         Employee e3 = new Employee("ritesh", 133);
        Employee e4 = new Employee("shubham ", 355);
         
         Employee e5 = new Employee();
        Employee e6 = new Employee();
    }

}