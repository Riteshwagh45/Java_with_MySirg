package p1;

public class Employee {
    int empid;
    String name;
    int salary;

    //setters

    // set employee id
    void setEmpid(int id){
        this.empid = id;
    }

    //set employee name
    void setName(String name){
        this.name = name;
    }

    //set employee salary
    void setSalary(int salary){
        this.salary = salary;
    }

    //getters

    //get employee name
    String getName(){
        return name;
    }

    //get employee id
    int getEmpid(){
        return empid;
    }

    //get employe salary
    int getSalary(){
        return salary;
    }

}
