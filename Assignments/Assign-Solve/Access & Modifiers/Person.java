public class Person{
    public static void main(String[] args) {
      person p1 = new person();

      p1.setAge_Name(22 , "ritesh");
        System.out.println(p1.getAge());
        System.out.println(p1.getNmae());
    }
}

class person{
    private int age;
    private String name;

    //setters
    void setAge_Name(int age , String name){
        this.age = age;
        this.name = name;
    }

    //get name
    String getNmae(){
        return name;
    }

    //get age
    int getAge(){
        return age;
    }

}