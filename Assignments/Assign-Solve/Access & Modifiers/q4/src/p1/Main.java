package p1;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();

         e1.setEmpid(58);
         e1.setName("ritesh wagh");
         e1.setSalary(1000000);

        System.out.println("ID = "+e1.getEmpid());
        System.out.println("Name = "+e1.getName());
        System.out.println("salary = "+e1.getSalary());
    }

}
