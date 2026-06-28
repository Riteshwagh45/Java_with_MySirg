public class Employee {
    static class employee{
        String name;
        int   Empid;
        int EmpSalary;
       
        //setters
        void setName(String n){
            name = n;
        }
        void setEmployeeId(int id){
            Empid = id;
        }
        void setsalary(int s){
            EmpSalary = s;
        }

      //getters
      String getName(){
        return name;
      }

      int getId(){
        return Empid;
      }

      int getSalary(){
        return EmpSalary;
      }

    }
    public static void main(String[] args) {
        employee E = new employee();
        E.setName("ritesh");
        E.setEmployeeId(58);
        E.setsalary(550000);
        System.out.println("Name: "+E.getName());
        System.out.println("salary: "+E.getSalary());
        System.out.println("ID: "+E.getId());
    }
}
